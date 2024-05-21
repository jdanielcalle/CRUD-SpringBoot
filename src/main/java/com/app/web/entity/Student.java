package com.app.web.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private String lastName;
    private String adress;

    public Student(String name, String lastName, String adress) {
        super();
        this.name = name;
        this.lastName = lastName;
        this.adress = adress;
    }
}
