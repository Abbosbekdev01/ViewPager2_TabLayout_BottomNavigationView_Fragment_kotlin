package uz.abbosbek.myviewpager2_injava.ui

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.squareup.picasso.Picasso
import uz.abbosbek.myviewpager2_in_kotlin.databinding.FragmentBlankBinding

class BlankFragment : Fragment() {
    private var mParam1: String? = null
    @SuppressLint("UseRequireInsteadOfGet")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (arguments != null) {
            mParam1 = arguments!!.getString(ARG_PARAM1)
        }
    }

    private var binding: FragmentBlankBinding? = null
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentBlankBinding.inflate(inflater, container, false)
        Picasso.get().load(mParam1).into(binding!!.image)
        return binding!!.getRoot()
    }

    companion object {
        private const val ARG_PARAM1 = "param1"
        fun newInstance(param1: String?): BlankFragment {
            val fragment = BlankFragment()
            val args = Bundle()
            args.putString(ARG_PARAM1, param1)
            fragment.arguments = args
            return fragment
        }
    }
}