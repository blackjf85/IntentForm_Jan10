package com.example.intentform_jan10

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.intentform_jan10.databinding.ActivityThirdBinding

class ThirdActivity: AppCompatActivity() {

    private lateinit var binding: ActivityThirdBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityThirdBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding) {
            // Grabbing extras from intent
            firstNameTv.text = intent.getStringExtra(FIRST_NAME_EXTRA)
            lastNameTv.text = intent.getStringExtra(LAST_NAME_EXTRA)
            emailTv.text = intent.getStringExtra(EMAIL_EXTRA)
            schoolTv.text = intent.getStringExtra(SCHOOL_EXTRA)
        }
    }
}