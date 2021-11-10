package com.faizzakiramadhan_19104075.practice5activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.faizzakiramadhan_19104075.practice5activity.databinding.ActivityMainBinding
import com.faizzakiramadhan_19104075.practice5activity.databinding.ActivityPractice5ReadDataBinding

class Practice5ReadDataActivity : AppCompatActivity() {

    private lateinit var binding: ActivityPractice5ReadDataBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding =  ActivityPractice5ReadDataBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_practice5_read_data)

        val prodi = intent.getStringExtra(EXTRA_PRODI)
        binding.lblProdiSaya.text = "Prodi Saya Adalah $prodi"
    }

    companion object {
        const val EXTRA_PRODI = "extra_prodi"
    }

}