package com.kodilla.hibernate.tasklist.repository;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.transaction.Transactional;
import java.util.List;

@SpringBootTest
public class TaskListRepositoryTestSuite {

    @Autowired
    private TaskListRepository taskListRepository;

    private static final String LISTNAME = "Test: Learn Hibernate";

    @Test
    @Transactional
    void testFindByListName(){
        //given
        TaskList taskList = new TaskList(LISTNAME, "Test: Learn hibernate");
        taskListRepository.save(taskList);
        String listName = taskList.getListName();

        //when
        List<TaskList> foundLists = taskListRepository.findByListName(listName);

        //then
        Assertions.assertEquals(1, foundLists.size());

        //cleanup
        int id = foundLists.get(0).getId();
        taskListRepository.deleteById(id);
    }
}
