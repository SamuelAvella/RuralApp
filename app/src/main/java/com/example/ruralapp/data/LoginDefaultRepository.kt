package com.example.ruralapp.data

import javax.inject.Inject

class LoginDefaultRepository @Inject constructor(
    private val remote:RuralAppRemoteDataSource,
    private val local: LoginLocalDataSource
) : LoginRepository{

    override val token:String?
        get() = local.token

    override suspend fun login(user: String, password: String)
}