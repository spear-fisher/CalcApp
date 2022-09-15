package jp.techacademy.keita.michikawa.calcapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import jp.techacademy.keita.michikawa.calcapp.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val value = intent.getDoubleExtra("VALUE", 0.0)
        Log.d("UI_PARTS", "${value}")

        binding.textView.text = "${value}"
    }
}