package com.example.ruralapp.ui

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintSet.GONE
import androidx.constraintlayout.widget.ConstraintSet.VISIBLE
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.isVisible
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.example.ruralapp.R
import com.example.ruralapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, 0)
            insets
        }

        val navHost = supportFragmentManager.findFragmentById(R.id.main_navigation_area) as NavHostFragment //support para poder castear a Fragment
        val navController = navHost.navController //los navhost tienen asociados el control de navegacion, el que hace las transiciones
        navController.addOnDestinationChangedListener{
            _, _, arguments ->
                binding.bottomNavigation.isVisible =
                    arguments?.getBoolean("showBottomNav", true) == true? : true
        }

        binding.bottomNavigation.setupWithNavController(navController)


    }
}

//al bottom navigation le asigno un menu, que son los botones. Y el main Xml esta asignado a un Navhost