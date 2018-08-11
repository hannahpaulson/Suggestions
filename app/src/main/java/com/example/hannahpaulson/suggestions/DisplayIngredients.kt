package com.example.hannahpaulson.suggestions

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity

import kotlinx.android.synthetic.main.activity_display_ingredients.*

class DisplayIngredients : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display_ingredients)
        setSupportActionBar(toolbar)

    }

}
