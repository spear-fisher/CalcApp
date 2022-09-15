package jp.techacademy.keita.michikawa.calcapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.content.Intent
import android.util.Log
import android.widget.Toast
import jp.techacademy.keita.michikawa.calcapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.add.setOnClickListener(this)
        binding.subtract.setOnClickListener(this)
        binding.multiply.setOnClickListener(this)
        binding.divide.setOnClickListener(this)
        Log.d("UI_PARTS", "画面を表示した")
    }

    override fun onClick(v: View) {
        var result: Double = 0.0
        if (binding.input1.getText().toString().equals("") || binding.input2.getText().toString().equals("")) {
            val toast = Toast.makeText(this, "両項目に数字を入力してください", Toast.LENGTH_LONG)
            toast.show()
            Log.d("UI_PARTS", "未入力")
        } else {
            var value1: Double = binding.input1.text.toString().toDouble()
            var value2: Double = binding.input2.text.toString().toDouble()

            if (v.id == R.id.add) {
                result = value1 + value2
            } else if (v.id == R.id.subtract) {
                1
                result = value1 - value2
            } else if (v.id == R.id.multiply) {
                result = value1 * value2
            } else if (v.id == R.id.divide) {
                result = value1 / value2
            }

            var intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("VALUE", result)
            startActivity(intent)
            Log.d("UI_PARTS", "${result}")

        }


    }
}