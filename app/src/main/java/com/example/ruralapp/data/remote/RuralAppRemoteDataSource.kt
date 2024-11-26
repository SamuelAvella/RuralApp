package com.example.ruralapp.data.remote

class RuralAppRemoteDataSource {

    suspend fun register (username: String, email: String, password: String):Boolean

    suspend fun login (user: String, password: String):String?

    suspend fun readParticipant
}