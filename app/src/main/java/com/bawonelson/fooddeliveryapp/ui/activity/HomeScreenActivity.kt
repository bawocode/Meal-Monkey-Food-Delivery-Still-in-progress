package com.bawonelson.fooddeliveryapp.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.bawonelson.fooddeliveryapp.R
import com.bawonelson.fooddeliveryapp.databinding.ActivityHomeScreenBinding
import com.bawonelson.fooddeliveryapp.databinding.ActivityHomeScreenBinding.inflate

class HomeScreenActivity : AppCompatActivity() {
    val bottomNavView = binding.bottomNavigationView
    val navController = findNavController(R.id.fragmentContainerView)

    private lateinit var binding: ActivityHomeScreenBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        bottomNavView.setupWithNavController(navController)
        val appBarConfiguration = AppBarConfiguration(setOf(R.id.menu,R.id.offers,R.id.profile,R.id.more))
        setupActionBarWithNavController(navController, appBarConfiguration)
        binding.bottomNavigationView.background = null
        binding.bottomNavigationView.menu.getItem(2).isEnabled = false
    }
}