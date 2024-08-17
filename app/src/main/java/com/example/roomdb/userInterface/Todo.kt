package com.example.roomdb.userInterface

import java.util.Date

data class Todo(
    val id : Int,
    val title : String,
    var createdAt : Date
)

