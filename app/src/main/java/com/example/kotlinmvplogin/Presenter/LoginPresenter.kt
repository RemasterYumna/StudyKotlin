package com.example.kotlinmvplogin.Presenter

import com.example.kotlinmvplogin.Model.User
import com.example.kotlinmvplogin.View.ILoginView

class LoginPresenter (internal val iLoginView: ILoginView):ILoginPresenter {
    override fun onLogin(email: String, password: String) {
        val user = User(email, password)
        val isLoginSuccess = user.isDataValid
        if(isLoginSuccess)
            iLoginView.onLoginResult("Login Success")
        else
            iLoginView.onLoginResult("Login Error")
    }
}