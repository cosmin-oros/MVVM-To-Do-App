package com.example.mvvmtodoapp.data.room

import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.mvvmtodoapp.data.Todo
import kotlinx.coroutines.flow.Flow

interface TodoDao {
    @Query("SELECT * FROM todo")
    fun selectAll(): Flow<List<Todo>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(todo: Todo)

    @Query("Delete From todo WHERE id = :id")
    suspend fun delete(id: Long)

    @Query("DELETE FROM todo")
    suspend fun deleteAllTodo()

}