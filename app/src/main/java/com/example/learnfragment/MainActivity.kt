package com.example.learnfragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.fragment_show_result.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    //penghubung antara fragment 1 dan fragment
    fun controllerData(value: Int) {
        resultTextView.text = value.toString()
    }
}