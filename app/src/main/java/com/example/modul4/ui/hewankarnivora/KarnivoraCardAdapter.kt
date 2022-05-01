package com.example.modul4.ui.hewanherbivora

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.modul4.Hewan
import com.example.modul4.HewanViewModel
import com.example.modul4.R

class KarnivoraCardAdapter(
    private val context: Context,
    private val dataset: List<Hewan>
) : RecyclerView.Adapter<KarnivoraCardAdapter.KarnivoraCardViewHolder>() {

    private val viewModel = HewanViewModel()
    class KarnivoraCardViewHolder(view: View): RecyclerView.ViewHolder(view) {
        val karnivoraImageView : ImageView = view.findViewById(R.id.hewan_img)
        val karnivoraNameText : TextView = view.findViewById(R.id.hewan_name)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): KarnivoraCardViewHolder {
        val layout = LayoutInflater
            .from(parent.context)
            .inflate(R.layout.fragment_hewan, parent, false)
        return KarnivoraCardViewHolder(layout)
    }

    override fun getItemCount() = dataset.size

    override fun onBindViewHolder(holder: KarnivoraCardViewHolder, position: Int) {
        val karnivoraData = dataset[position]
        holder.karnivoraImageView.setImageResource(karnivoraData.imageResourceId)
        holder.karnivoraNameText.text = context.resources.getString(karnivoraData.name)

        holder.itemView.setOnClickListener {
            viewModel.setHewan(karnivoraData, context)
            val intent = Intent(context, HewanDetail::class.java).apply {
                putExtra("nama", viewModel.nama.value)
                putExtra("description", viewModel.deskripsi.value)
                putExtra("image", viewModel.imageDrawable.value)
            }
            context.startActivity(intent)
        }
    }
}
