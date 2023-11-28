package com.javaback.taskapi.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "\"task\"")
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private boolean taskStatus;
    private String taskText;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

}
