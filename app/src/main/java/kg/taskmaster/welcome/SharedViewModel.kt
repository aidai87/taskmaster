package kg.taskmaster.welcome

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.viewpager2.widget.ViewPager2

class SharedViewModel : ViewModel() {

    private val _viewPager = MutableLiveData<ViewPager2>()
    val viewPager: LiveData<ViewPager2> get() = _viewPager


    fun setViewPager(viewPager: ViewPager2) {
        _viewPager.value = viewPager
    }

}
