package com.example.exam55.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class ViewPagerAdapterMain(fm: FragmentManager) :FragmentPagerAdapter(fm) {
    private val fragments: MutableList<Fragment> = ArrayList()
    private val fragmentsTitle: MutableList<String> = ArrayList()
    fun add(fragment: Fragment, title: String) {
        fragments.add(fragment)
        fragmentsTitle.add(title)
    }

    override fun getItem(position: Int): Fragment {
        return fragments[position]
    }

    override fun getCount(): Int {
        return fragments.size
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return fragmentsTitle[position]
    }
}