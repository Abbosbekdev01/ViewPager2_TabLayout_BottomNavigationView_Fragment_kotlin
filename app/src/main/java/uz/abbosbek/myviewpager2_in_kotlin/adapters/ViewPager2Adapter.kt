package uz.abbosbek.myviewpager2_injava.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import uz.abbosbek.myviewpager2_in_kotlin.databinding.ItemImageBinding

class ViewPager2Adapter(private val list: List<String>) :
    RecyclerView.Adapter<ViewPager2Adapter.Vh>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Vh {
        return Vh(ItemImageBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: Vh, position: Int) {
        Picasso.get().load(list[position]).into(holder.binding.image)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    inner class Vh(binding: ItemImageBinding) :
        RecyclerView.ViewHolder(binding.getRoot()) {
        var binding: ItemImageBinding

        init {
            this.binding = binding
        }
    }
}