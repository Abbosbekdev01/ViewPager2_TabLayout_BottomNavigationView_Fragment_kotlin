package uz.abbosbek.myviewpager2_in_kotlin

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
import com.google.android.material.tabs.TabLayoutMediator
import uz.abbosbek.myviewpager2_in_kotlin.databinding.ActivityMainBinding
import uz.abbosbek.myviewpager2_injava.adapters.ViewPager2Adapter
import uz.abbosbek.myviewpager2_injava.adapters.ViewPager2FragmentAdapter

class MainActivity : AppCompatActivity() {

    private lateinit var viewPager2Adapter: ViewPager2Adapter
    private lateinit var viewPager2FragmentAdapter: ViewPager2FragmentAdapter
    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    private lateinit var list:ArrayList<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        loadList()
        viewPager2FragmentAdapter = ViewPager2FragmentAdapter(this, list)
        binding.viewPager2.adapter = viewPager2FragmentAdapter
//        viewPager2Adapter = new ViewPager2Adapter(list);
//        binding.viewPager2.setAdapter(viewPager2Adapter);

        //        viewPager2Adapter = new ViewPager2Adapter(list);
//        binding.viewPager2.setAdapter(viewPager2Adapter);
        val tabLayoutMediator = TabLayoutMediator(
            binding.tabLayout, binding.viewPager2
        ) { tab, position -> tab.text = "Tab - $position" }
        tabLayoutMediator.attach()

        binding.viewPager2.registerOnPageChangeCallback(object : OnPageChangeCallback() {
            override fun onPageSelected(position: Int) {}
        })

    }

    private fun loadList() {
        list = java.util.ArrayList()
        list.add("https://storage.kun.uz/source/thumbnails/_medium/9/AxrN8u_Cr7YQowuxxcy1eIWAbg7svfqg_medium.jpg")
        list.add("https://storage.kun.uz/source/thumbnails/_medium/9/Tf2sFMYPHmMXTf_BvCyDOJQg56PPeuxO_medium.jpg")
        list.add("https://storage.kun.uz/source/thumbnails/_medium/9/baCZ9G93FF45xh3-tL2TTs2BfCa8XMT9_medium.jpg")
        list.add("https://storage.kun.uz/source/thumbnails/_medium/9/yeW-59qSYaXM9gUBJMQZUmFhRPm8z-DW_medium.jpg")
        list.add("https://storage.kun.uz/source/thumbnails/_medium/9/O8c3gaRDIUEqolUrXEX2hlzSJA4BVr_P_medium.jpg")
    }

}