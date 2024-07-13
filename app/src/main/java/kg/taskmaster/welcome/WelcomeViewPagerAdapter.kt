package kg.taskmaster.welcome

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class WelcomeViewPagerAdapter(
    private val layouts: Array<Int>,
    fragmentActivity: FragmentActivity
) : FragmentStateAdapter(fragmentActivity) {

    override fun createFragment(position: Int): Fragment {
        return WelcomeSlideFragment.newInstance(layouts[position])
    }

    override fun getItemCount(): Int {
        return layouts.size
    }

}
