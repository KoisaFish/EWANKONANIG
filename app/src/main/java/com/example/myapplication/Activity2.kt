package com.example.myapplication

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView
import android.view.MenuItem
import androidx.core.view.GravityCompat
import androidx.appcompat.widget.Toolbar

class Activity2 : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

    private lateinit var drawerLayout: DrawerLayout
    private lateinit var actionBarDrawerToggle: ActionBarDrawerToggle
    private lateinit var characterFragment: Fragment
    private lateinit var guideFragment: Fragment

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)

        // Toolbar setup
        val toolbar: Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)

        // DrawerLayout + Toggle setup
        drawerLayout = findViewById(R.id.drawer_layout)
        actionBarDrawerToggle = ActionBarDrawerToggle(
            this, drawerLayout, toolbar,
            R.string.nav_open,
            R.string.nav_close
        )
        drawerLayout.addDrawerListener(actionBarDrawerToggle)
        actionBarDrawerToggle.syncState()

        // Fragments
        val homeFragment = Fragment_First()

        val profileFragment = ProfileFragment().apply {
            arguments = Bundle().apply {
                putString("username", intent.getStringExtra("val1"))
            }
        }

        val settingsFragment = ThirdFragment()
        characterFragment = CreateCharacter()
        guideFragment = GuideFragment() // FIXED: Changed from guideFragment() to GuideFragment()

        // Bottom Nav setup
        val bottomNavigationView: BottomNavigationView = findViewById(R.id.bottomNavigationView)
        setCurrentFragment(homeFragment)

        bottomNavigationView.setOnNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.home -> setCurrentFragment(homeFragment)
                R.id.profile -> setCurrentFragment(profileFragment)
                R.id.settings -> setCurrentFragment(settingsFragment)
            }
            true
        }

        // Welcome Message
        var value1 = intent.extras?.getString("val1").orEmpty()
        if (value1.isEmpty()) value1 = "No Name input"
        Toast.makeText(this, "Welcome, Peasant! $value1", Toast.LENGTH_LONG).show()

        // 📋 Navigation Drawer Menu
        val navView: NavigationView = findViewById(R.id.nav_view)
        navView.setNavigationItemSelectedListener(this)
    }

    // Handle nav drawer item clicks
    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.CharacterCreate -> setCurrentFragment(CreateCharacter())
            R.id.guide -> setCurrentFragment(guideFragment)
        }
        drawerLayout.closeDrawer(GravityCompat.START)
        return true
    }

    // Handle drawer toggle click (hamburger icon)
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return if (actionBarDrawerToggle.onOptionsItemSelected(item)) {
            true
        } else super.onOptionsItemSelected(item)
    }

    private fun setCurrentFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.flFragment, fragment)
            .commit()
    }

    // Exit confirmation dialog
    override fun onBackPressed() {
        AlertDialog.Builder(this)
            .setTitle("Alert !")
            .setMessage("Do you want to Logout?")
            .setCancelable(false)
            .setPositiveButton("Yes") { _, _ -> super.onBackPressed() }
            .setNegativeButton("No") { dialog, _ -> dialog.cancel() }
            .create()
            .show()
    }
}
