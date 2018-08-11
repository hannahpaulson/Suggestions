package com.example.hannahpaulson.suggestions

import android.os.Build
import android.os.Bundle
import android.support.annotation.RequiresApi
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_ingredient_input.*
import kotlinx.android.synthetic.main.fragment_ingredient_input.*
import retrofit2.Call
import retrofit2.Callback

class IngredientInput : AppCompatActivity() {

    private val apiService = ApiInterface.create()

    @RequiresApi(Build.VERSION_CODES.N)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ingredient_input)
        setSupportActionBar(toolbar)

        search_button.setOnClickListener {
            callWebService(search_editText.text.toString())
        }
    }


    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_ingredient_input, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }

    private fun callWebService(searchText: String) {
        apiService.getSearchResults(searchText).enqueue(object : Callback<SearchResponse> {
            override fun onResponse(call: Call<SearchResponse>, response: retrofit2.Response<SearchResponse>?) {
                if (response != null) {
                    Log.d("MainActivity", "" + response.body())
                    Log.d("Hannah", "" + response.raw().request().url())
                    Toast.makeText(this@IngredientInput, "List of Category  \n  " + response.code(), Toast.LENGTH_LONG).show()
                }
            }

            override fun onFailure(call: Call<SearchResponse>, t: Throwable) {
                Log.d("REQUEST FAIL ", call.request().url().toString() + "")
                Log.d("REQUEST FAIL ", call.toString() + "")
            }
        })
    }
}
