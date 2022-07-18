package com.example.mvvmtodoapp.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Todo(
    @PrimaryKey(autoGenerate = true)
    val id: Long,
    val todo: String,
    val time: String,
    val isComplete: Boolean
)
