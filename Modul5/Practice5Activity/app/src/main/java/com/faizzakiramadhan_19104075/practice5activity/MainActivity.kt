package com.faizzakiramadhan_19104075.practice5activity

import android.annotation.SuppressLint
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.view.LayoutInflater
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import com.faizzakiramadhan_19104075.practice5activity.databinding.ActivityMainBinding
import java.util.jar.Manifest

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding =  ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.btnProdi.setOnClickListener{
            val namaprodi = binding.inputProdi.text.toString()

            if (namaprodi.isEmpty()){
                binding.inputProdi.error = "Prodi Tidak Boleh Kosong"
                return@setOnClickListener
            }
            val moveWithDataIntent = Intent(this@MainActivity,  Practice5ReadDataActivity::class.java)
            moveWithDataIntent.putExtra(Practice5ReadDataActivity.EXTRA_PRODI, namaprodi)
            startActivity(moveWithDataIntent)
        }
        binding.btnCallBrowser.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("http://ittelkom-pwt.ac.id/")
            startActivity(intent)
        }
        binding.btnCallCamera.setOnClickListener{
            val intent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivity(intent)
        }
        binding.btnCallPhone.setOnClickListener{
            val phoneNumber = binding.inputPhoneNumber.getText()
            if (phoneNumber.isEmpty()) {
                binding.inputPhoneNumber.error = "Nomor Telpon Tidak Boleh Kosong"
                return@setOnClickListener
            }
            val intent = Intent(Intent.ACTION_CALL)
            intent.data = Uri.parse("tel:" + phoneNumber)
            startActivity(intent)
        }

        }
    val CALL_REQUEST_CODE = 100
    @SuppressLint("MissingPermission")
    private fun setupPermissions() {
        val permission = ContextCompat.checkSelfPermission(this,
            Manifest.permission.CALL_PHONE)
        if (permission != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(this,
                arrayOf(Manifest.permission.CALL_PHONE),
                CALL_REQUEST_CODE)
        }
    }
}