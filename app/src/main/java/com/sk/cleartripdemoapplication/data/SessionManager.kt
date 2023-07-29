package com.sk.cleartripdemoapplication.data

interface SessionManager {

    fun saveUserSession(value: Boolean)

    fun getUserSession(): Boolean
}