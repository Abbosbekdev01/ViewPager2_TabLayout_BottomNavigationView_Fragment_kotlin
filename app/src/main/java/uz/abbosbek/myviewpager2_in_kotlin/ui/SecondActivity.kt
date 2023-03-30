package uz.abbosbek.myviewpager2_in_kotlin.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI.setupWithNavController
import uz.abbosbek.myviewpager2_in_kotlin.R
import uz.abbosbek.myviewpager2_in_kotlin.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    private val binding by lazy { ActivitySecondBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val fragment =
            (supportFragmentManager.findFragmentById(R.id.my_nav_host_fragment) as NavHostFragment?)!!
        val navController = fragment!!.navController
        setupWithNavController(binding.bottomNavigationView, navController)

    }
}