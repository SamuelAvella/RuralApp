package com.example.ruralapp.di

import com.example.ruralapp.data.local.login.LoginLocalDataSource

class TokenInterceptor(
    private val dataSource: LoginLocalDataSource
) : Interceptor{

    override fun intercept(chain: Interceptor.Chain): Response{
        var request= chain.request()
        val token = dataSource.token
        if(token != null){
            request = request.newBuilder()
                .header("Authorization", "Bearer $token")
                .build
        }

        val response = chain.proceed(request)
        return response
    }
}