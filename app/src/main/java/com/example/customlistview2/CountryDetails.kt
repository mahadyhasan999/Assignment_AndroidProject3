package com.example.customlistview2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import de.hdodenhof.circleimageview.CircleImageView

class CountryDetails : AppCompatActivity() {
    private lateinit var profileDetails: CircleImageView
    private lateinit var nameDetails: TextView
    private lateinit var messageDetails: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_country_details)

        val profileDetails: CircleImageView = findViewById(R.id.profileDetails)
        val nameDetails: TextView = findViewById(R.id.nameDetails)
        val messageDetails: TextView = findViewById(R.id.messageDetails)
    }
}