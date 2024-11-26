package com.example.ruralapp.data

interface LoginRepository {
    suspend fun login(user:String, password:String):Boolean
    val isLoggedIn:Boolean
    val toke:String?
    suspend fun logout()
    suspend fun register(user:String, email:String, password:String):Boolean
}