package com.example.modul4.ui.hewanherbivora

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.modul4.HewanViewModel
import com.example.modul4.R
import com.example.modul4.Hewan

class OmnivoraCardAdapter(
    private val context: Context,
    private val dataset: List<Hewan>
) : RecyclerView.Adapter<OmnivoraCardAdapter.OmnivoraCardViewHolder>() {

    private val viewModel = HewanViewModel()
    class OmnivoraCardViewHolder(view: View): RecyclerView.ViewHolder(view) {
        val herbivoraImageView : ImageView = view.findViewById(R.id.hewan_img)
        val herbivoraNameText : TextView = view.findViewById(R.id.hewan_name)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): OmnivoraCardViewHolder {
        val layout = LayoutInflater
            .from(parent.context)
            .inflate(R.layout.fragment_hewan, parent, false)
        return OmnivoraCardViewHolder(layout)
    }

    override fun getItemCount() = dataset.size

    override fun onBindViewHolder(holder: OmnivoraCardViewHolder, position: Int) {
        val omnivoraData = dataset[position]
        holder.herbivoraImageView.setImageResource(omnivoraData.imageResourceId)
        holder.herbivoraNameText.text = context.resources.getString(omnivoraData.name)

        holder.itemView.setOnClickListener {
            viewModel.setHewan(omnivoraData, context)
            val intent = Intent(context, HewanDetail::class.java).apply {
                putExtra("nama", viewModel.nama.value)
                putExtra("description", viewModel.deskripsi.value)
                putExtra("image", viewModel.imageDrawable.value)
            }
            context.startActivity(intent)
        }
    }
}
