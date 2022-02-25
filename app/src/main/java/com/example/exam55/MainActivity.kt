package com.example.exam55

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import com.example.exam55.adapter.ViewPagerAdapterMain
import com.example.exam55.fragments.FirstFragment
import com.example.exam55.fragments.FourthFragment
import com.example.exam55.fragments.SecondFragment
import com.example.exam55.fragments.ThirdFragment
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {

    private var viewPagerAdapterMain: ViewPagerAdapterMain? = null
    private var viewPager: ViewPager? = null
    private var tabLayout: TabLayout? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
    }

    fun initViews() {
        viewPager = findViewById(R.id.viewpager)
        viewPagerAdapterMain = ViewPagerAdapterMain(supportFragmentManager)
        viewPagerAdapterMain!!.add(FirstFragment(), "Home")
        viewPagerAdapterMain!!.add(SecondFragment(), "Group")
        viewPagerAdapterMain!!.add(ThirdFragment(), "Messages")
        viewPagerAdapterMain!!.add(FourthFragment(), "Search")
        viewPager!!.adapter = viewPagerAdapterMain
        tabLayout = findViewById(R.id.tab_layout)
        tabLayout!!.setupWithViewPager(viewPager)
    }
}