package com.sserhiichyk.assign03

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.sserhiichyk.assign03.databinding.ActivityContactsProfileBinding
import com.sserhiichyk.assign03.extensions.loadImageWithGlide
import kotlin.random.Random

class ContactsProfile : AppCompatActivity() {
    private lateinit var binding: ActivityContactsProfileBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contacts_profile)

        binding = ActivityContactsProfileBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val avatarNum: String = Random(System.currentTimeMillis()).nextInt(0, 78).toString()
        binding.imageView6.loadImageWithGlide("https://xsgames.co/randomusers/assets/avatars/male/$avatarNum.jpg")

        binding.button2.setOnClickListener {
/*
            val intent = Intent(this, RecyclerActivityDel::class.java)
            startActivity(intent)
*/
        }
    }
}