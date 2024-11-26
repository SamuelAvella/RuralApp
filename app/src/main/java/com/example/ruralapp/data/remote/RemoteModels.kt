package com.example.ruralapp.data.remote

data class AuthPayload(
    val identifier: String,
    val password: String
)

data class UserResponse(
    val id:Int,
    val documentedId: String,
    val username: String,
    val email: String
)

data class AuthResponse(
    val jwt: String,
    val user: UserResponse
)

data class ParticipantResponse(
    val id: Int,
    val documentId: String,
    val name: String,
    val surname1: String,
    val surname2: String
)