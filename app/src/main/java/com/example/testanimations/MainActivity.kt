package com.example.testanimations

import android.graphics.drawable.AnimationDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat

//class MainActivity : AppCompatActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//        findViewById<ImageView>(R.id.imageView).apply {
//            setBackgroundResource(R.drawable.my_animation)
//            val dogAnimation = background as AnimationDrawable
//            setOnClickListener { dogAnimation.start() }
//        }
//
//
//
//    }
//}

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val image = findViewById<ImageView>(R.id.imageView)
        val myVectorIcon = AnimatedVectorDrawableCompat.create(
            this,
            R.drawable.vector_file
        )
        image.setImageDrawable(myVectorIcon)
        myVectorIcon?.start()
    }
}