package id.zlz.loginmvvm.network

import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST

interface LoginClassModel {
    @FormUrlEncoded
    @POST ("accounts/login")
    fun login(
        @Field("email") email:String,
        @Field("password") password:String,

    ): Any
}