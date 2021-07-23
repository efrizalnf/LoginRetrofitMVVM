package id.zlz.loginmvvm.network

import com.google.gson.Gson
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

class RetrofitClient {
    companion object {
        private const val BASE_URL = "https://api-emis.kemenag.go.id/v1/"
    }

    fun <Api> getApi(api: Class<Api>): Api {
       return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(api)
    }
}