package com.kodilla.hibernate.task;

import javax.persistence.*;

@Entity
@Table(name = "TASKS_FINANCIALS")
public class TaskFinancialDetails {

    @Id
    @GeneratedValue
    @Column(name = "ID")
    private Long id;
}
