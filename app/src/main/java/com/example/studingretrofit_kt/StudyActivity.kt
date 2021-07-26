package com.example.studingretrofit_kt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationMenuView
import com.google.android.material.bottomnavigation.BottomNavigationView

class StudyActivity : AppCompatActivity() {

    private val fragmentOne by lazy { FragmentOne() }
    private val fragmentTwo by lazy { FragmentTwo() }
    private val fragmentThree by lazy { FragmentThree() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_study)

        initNavigationBar()
    }

    private fun initNavigationBar() {
        val bnv_main = findViewById<BottomNavigationView>(R.id.bnv_main)
        bnv_main.run{
            setOnNavigationItemSelectedListener {
                when(it.itemId){
                    R.id.frist -> {
                        changeFragment(fragmentOne)
                    }
                    R.id.second -> {
                        changeFragment(fragmentTwo)
                    }
                    R.id.third -> {
                        changeFragment(fragmentThree)
                    }
                }
                true
            }
            selectedItemId = R.id.frist
        }
    }

    private fun changeFragment(fragment: Fragment) {
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.fi_container, fragment)
            .commit() }


}