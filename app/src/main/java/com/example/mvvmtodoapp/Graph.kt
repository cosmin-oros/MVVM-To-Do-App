package com.example.mvvmtodoapp

import android.content.Context
import com.example.mvvmtodoapp.data.TodoDataSource
import com.example.mvvmtodoapp.data.room.TodoDatabase

object Graph {
    lateinit var database: TodoDatabase
        private set
    val todoRepo by lazy {
        TodoDataSource(database.todoDao())
    }

    fun provide(context: Context){
        database = TodoDatabase.getDatabase(context)
    }
}