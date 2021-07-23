package id.zlz.loginmvvm.network

import okhttp3.ResponseBody

sealed class Resources <out T>{
    data class Successful <out T>(val value: T): Resources<T>()
    data class Error (
        val isNetworkError: Boolean,
        val errorCode: Int?,
        val errorResponse: ResponseBody?,
            )
}