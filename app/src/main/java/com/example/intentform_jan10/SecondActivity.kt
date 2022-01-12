package com.example.intentform_jan10

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.intentform_jan10.databinding.FormLayoutBinding

class SecondActivity: AppCompatActivity() {

    private lateinit var binding: FormLayoutBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = FormLayoutBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.nextBtn.setOnClickListener {
            navigateToThirdActivity()
        }
    }

    private fun navigateToThirdActivity() {
        val firstName = binding.firstEt.text.toString()
        val lastName = binding.secondEt.text.toString()
        val email = binding.email.text.toString()
        val schoolName = binding.school.text.toString()

        val intent = Intent(this, ThirdActivity::class.java).also {
            it.putExtra(FIRST_NAME_EXTRA, firstName)
            it.putExtra(LAST_NAME_EXTRA, lastName)
            it.putExtra(EMAIL_EXTRA, email)
            it.putExtra(SCHOOL_EXTRA, schoolName)
        }

        startActivity(intent)
    }

    override fun onStart() {
        super.onStart()
    }

    override fun onResume() {
        super.onResume()
    }

    override fun onPause() {
        super.onPause()
    }

    override fun onStop() {
        super.onStop()
    }

    override fun onRestart() {
        super.onRestart()
    }

    override fun onDestroy() {
        super.onDestroy()
    }
}
