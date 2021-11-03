package com.faizzakiramadhan_19104075.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast

class Halaman2Activity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_halaman22)
    }
    fun printState(msg: String){
        Log.d("ActivityState",msg)
        Toast.makeText(applicationContext,msg, Toast.LENGTH_SHORT).show()
    }


    override fun onStart(){
        super.onStart()
        printState("Halaman Dua On Start")
    }
    override fun onResume(){
        super.onResume()
        printState("Halaman Dua On Resume")
    }
    override fun onPause(){
        super.onPause()
        printState("Halaman Dua On Pause")
    }
    override fun onStop(){
        super.onStop()
        printState("Halaman Dua On Stop")
    }
    override fun onRestart(){
        super.onRestart()
        printState("Halaman Dua On Restart")
    }
    override fun onDestroy() {
        super.onDestroy()
        printState("Halaman Dua On Destroy")
    }
}