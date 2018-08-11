package com.example.hannahpaulson.suggestions

import org.junit.Assert.*
import org.junit.Test
import retrofit2.Call
import retrofit2.Callback
import java.util.concurrent.Semaphore

class ApiIntegrationTest {

    private val apiService = ApiInterface.create()

    @Test
    fun testCallForBaconReturnsResults() {
        val finishSemaphore = Semaphore(0)
        var didFail = false;

        apiService.getSearchResults("bacon").enqueue(object : Callback<SearchResponse> {
            override fun onResponse(call: Call<SearchResponse>, response: retrofit2.Response<SearchResponse>?) {
                if (response != null) {
                    println(response.body())
                    println(response.raw().request().url().toString())
                }
                finishSemaphore.release()
            }

            override fun onFailure(call: Call<SearchResponse>, t: Throwable) {
                didFail = true
                println(call.request().url().toString())
                println(call.request().body().toString())
                println(t.toString())
                finishSemaphore.release()
            }
        })

        finishSemaphore.acquire()
        assertEquals("Request failed", didFail, false)
    }
}