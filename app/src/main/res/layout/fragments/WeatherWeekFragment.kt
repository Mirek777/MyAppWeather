package com.mirek777.myappweather.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.mirek777.myappweather.R

class WeatherWeekFragment: Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_weather_week, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val buttonDay = view.findViewById<Button>(R.id.button_day)
        buttonDay?.setOnClickListener {
            findNavController().navigate(R.id.weatherDayFragment, null)
        }
        val buttonMonth = view.findViewById<Button>(R.id.button_month)
        buttonMonth?.setOnClickListener {
            findNavController().navigate(R.id.weatherMonthFragment, null)
        }
    }
}