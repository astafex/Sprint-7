package com.example.demo.persistance

import javax.persistence.*
import javax.persistence.Entity

@Entity
data class Entity(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null,

    @Column
    var name: String?
)