package com.example.roomdb.userInterface

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.Date

@Entity
data class Todo(
    @PrimaryKey(autoGenerate = true)
    val id : Int = 0,
    val title : String,
    var createdAt : Date
)

