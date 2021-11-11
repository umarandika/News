package com.example.news.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.news.fragments.AllNewsFragment
import com.example.news.fragments.PopularNewsFragment
import com.example.news.fragments.TopNewsFragment

class SectionPagerAdapter(fa: FragmentActivity) : FragmentStateAdapter(fa) {

    override fun getItemCount() = 3

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> AllNewsFragment()
            1 -> TopNewsFragment()
            2 -> PopularNewsFragment()
            else -> TopNewsFragment()
        }
    }
}