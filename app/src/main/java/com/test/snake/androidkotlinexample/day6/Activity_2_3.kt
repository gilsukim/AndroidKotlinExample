package com.test.snake.androidkotlinexample.day6

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.test.snake.androidkotlinexample.R
import android.R.menu
import android.content.Intent
import android.util.Log


class Activity_2_3 : AppCompatActivity() {

    var nLineNumber = 0

    // Activity가 생성될 때
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2_3)

        Log.d("ALLTEST", String.format("\n%d: onCreate", nLineNumber++))
    }

    // 내 activity 맨앞으로 왔을 때
    public override fun onResume() {
        super.onResume()
        Log.d("ALLTEST", String.format("%d: onResume", nLineNumber++))
    }

    // 내 activity 맨앞에 뭔가가 있을 때
    public override fun onStop() {
        super.onStop()
        Log.d("ALLTEST", String.format("%d: onStop", nLineNumber++))
    }

    // Activity가 최초실행될 때
    public override fun onStart() {
        super.onStart()
        Log.d("ALLTEST", String.format("%d: onStart", nLineNumber++))
    }

    // Activity가 완전히 종료될 때
    public override fun onDestroy() {
        super.onDestroy()
        Log.d("ALLTEST", String.format("%d: onDestroy", nLineNumber++))
    }

}
