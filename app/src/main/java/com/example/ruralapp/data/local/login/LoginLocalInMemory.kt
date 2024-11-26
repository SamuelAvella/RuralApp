package com.example.ruralapp.data.local.login

import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class LoginLocalInMemory @Inject constructor(): LoginLocalDataSource{

    private var _token:String? = null
}