package com.example.hannahpaulson.suggestions

import android.util.Log
import okhttp3.*
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiInterface {
    //https://api.edamam.com/search?q=bacon&app_id=156b9bab&app_key=829a4ab1912cfedffd6bbfb4acaf864b

    @GET("/search")
    fun getSearchResults(@Query("q") q: String): Call<SearchResponse>

    companion object Factory {
        private const val BASE_URL = "https://api.edamam.com/"
        fun create(): ApiInterface {

            val retrofit = Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .client(apiKeyClient())
                    .addConverterFactory(MoshiConverterFactory.create())
                    .build()
            return retrofit.create(ApiInterface::class.java)
        }

        fun apiKeyClient(): OkHttpClient {
            return OkHttpClient.Builder().addInterceptor { chain ->
                val original = chain.request()
                val originalHttpUrl = original.url()
                val url = originalHttpUrl.newBuilder()
                        .addQueryParameter("app_id", "z")
                        .addQueryParameter("app_key", "z")
                        .build()
                val request = original.newBuilder()
                        .url(url)
                        .build()

                chain.proceed(request)
            }.build()
        }
    }
}