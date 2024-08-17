package com.example.roomdb

import androidx.room.TypeConverter
import java.util.Date

class Converters {

    @TypeConverter
    fun getDate(date : Date) : Long{
        return date.time
    }

    @TypeConverter
    fun toDate(time : Long) : Date{
        return Date(time)
    }
}