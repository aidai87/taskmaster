package kg.taskmaster.welcome

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import kg.taskmaster.R

class WelcomeSlideFragment : Fragment() {

    private val sharedViewModel: SharedViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val layoutResId = arguments?.getInt("layoutResId") ?: 0
        return inflater.inflate(layoutResId, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.continueButton)?.setOnClickListener {
            sharedViewModel.viewPager.value!!.currentItem += 1
        }
    }

    companion object {
        fun newInstance(layoutId: Int): WelcomeSlideFragment {
            val fragment = WelcomeSlideFragment()
            val args = Bundle()
            args.putInt("layoutResId", layoutId)
            fragment.arguments = args
            return fragment
        }
    }
}
