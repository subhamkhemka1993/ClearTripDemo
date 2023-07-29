package com.sk.cleartripdemoapplication.presentation.login_sign_up

import android.os.PatternMatcher
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import java.util.regex.Pattern

class LoginViewModel: ViewModel() {

    private var _loginSignUpUIState = MutableLiveData<LoginSignUpUIState>()
    val loginSignUpUIState: LiveData<LoginSignUpUIState> = _loginSignUpUIState


    fun loginOrRegister(email: String, password: String) {
        viewModelScope.launch(Dispatchers.IO) {
            if (email.isNotEmpty() && password.isNotEmpty()){

//                email.matches()
                _loginSignUpUIState.postValue(LoginSignUpUIState.LoginSuccess)

            }else{

            }
        }
    }
}