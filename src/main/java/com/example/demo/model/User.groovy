package com.example.demo.model

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = 'PongUser')
class User implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id
    @Column
    String name;
    @Column
    int age;
}
