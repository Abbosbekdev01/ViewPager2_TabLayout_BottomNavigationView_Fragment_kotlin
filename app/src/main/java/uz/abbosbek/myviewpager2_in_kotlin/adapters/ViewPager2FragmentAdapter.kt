package uz.abbosbek.myviewpager2_injava.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import uz.abbosbek.myviewpager2_injava.ui.BlankFragment

class ViewPager2FragmentAdapter(
    fragmentActivity: FragmentActivity,
    private val list: List<String>
) :
    FragmentStateAdapter(fragmentActivity) {
    override fun createFragment(position: Int): Fragment {
        return BlankFragment.newInstance(list[position])
    }

    override fun getItemCount(): Int {
        return list.size
    }
}