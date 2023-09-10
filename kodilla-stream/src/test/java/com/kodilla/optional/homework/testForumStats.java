package com.kodilla.optional.homework;


import com.kodilla.stream.ForumStats;
import com.kodilla.stream.UsersRepository;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class testForumStats {


    @Test
    public void testAveragePostCountAbove40() {
        double above40 = com.kodilla.stream.ForumStats.averagePostCountAbove40(UsersRepository.getUsersList(), 40);
        assertEquals(2.25, above40);
    }

    @Test
    public void testAveragePostCountBelow40(){
        double below40 = com.kodilla.stream.ForumStats.averagePostCountBelow40(UsersRepository.getUsersList(), 40);
        assertEquals(2382.0, below40);
    }

    @Test
    public void testAveragePostCountAbove58(){
        double above58 = com.kodilla.stream.ForumStats.averagePostCountAbove58(UsersRepository.getUsersList(), 58);
        assertEquals(0, above58);
    }

    @Test
    public void testAveragePostCountBelow0() {
        double below0 = com.kodilla.stream.ForumStats.averagePostCountBelow0(UsersRepository.getUsersList(), 0);
        assertEquals(0, below0);
    }

}