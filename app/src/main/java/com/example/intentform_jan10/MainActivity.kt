package com.example.intentform_jan10

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.intentform_jan10.databinding.FormLayoutBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: FormLayoutBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = FormLayoutBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding) {
            nextBtn.setOnClickListener {
                startSecondActivity()
            }
        }
    }

    private fun startSecondActivity() {
        // Grabbing text from EditText
        val firstName = binding.firstEt.text.toString()
        val lastName = binding.secondEt.text.toString()

        // Also scope function to work with object
        val intent = Intent(this, SecondActivity::class.java).also {
            it.putExtra(FIRST_NAME_EXTRA, firstName)
            it.putExtra(LAST_NAME_EXTRA, lastName)
        }

        // Starts next activity with intent.
        startActivity(intent)
    }

}