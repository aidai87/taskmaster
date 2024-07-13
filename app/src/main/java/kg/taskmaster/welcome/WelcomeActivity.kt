package kg.taskmaster.welcome

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2
import kg.taskmaster.R

class WelcomeActivity : AppCompatActivity() {

    private lateinit var pager: ViewPager2
    private lateinit var adapter: WelcomeViewPagerAdapter
    private val sharedViewModel: SharedViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_welcome)

        val layouts = arrayOf(
            R.layout.slide_1,
            R.layout.slide_2,
            R.layout.slide_3,
            R.layout.slide_4,
            R.layout.slide_5,
            R.layout.slide_6
        )
        adapter = WelcomeViewPagerAdapter(layouts, this)
        pager = findViewById(R.id.viewPager)
        pager.adapter = adapter

        sharedViewModel.setViewPager(pager)
    }

}