package com.mirek777.myappweather

import android.content.Context
import android.os.Bundle
import android.util.AttributeSet
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController


class MainActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}


//class MainActivity: AppCompatActivity(), View.OnClickListener {
//    private lateinit var navController: NavController
//    private var navHostFragment: NavHostFragment? = null
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//        navHostFragment = supportFragmentManager.findFragmentById(R.id.mainNavHostFragment) as? NavHostFragment ?: return
//        navController = findNavController(R.id.mainNavHostFragment)
//    }
//
//    override fun onClick(v: View?) {
//        if (v?.id == R.id.button_month) {
//            Navigation.findNavController(v).navigate(R.id.weatherMonthFragment)
//        }
//    }
//}