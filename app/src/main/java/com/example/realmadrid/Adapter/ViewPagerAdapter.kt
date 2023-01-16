package com.example.realmadrid.Adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import java.util.ArrayList

class ViewPagerAdapter(val fragments: ArrayList<Fragment>,fragmentManager: FragmentManager):FragmentStatePagerAdapter(fragmentManager,FragmentStatePagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {
    override fun getCount(): Int {
        return fragments.size

    }

    override fun getItem(position: Int): Fragment {
        return fragments[position]

    }


}