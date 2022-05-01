package com.example.modul4.ui.hewanherbivora

import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import com.example.modul4.R
import com.example.modul4.databinding.HewanDetailBinding

class HewanDetail : AppCompatActivity() {
    private var _binding: HewanDetailBinding? = null
    private val binding get() = _binding!!

    companion object {
        const val EXTRA_NAME = "nama"
        const val EXTRA_DESCRIPTION = "description"
        const val EXTRA_IMAGE = "image"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        _binding = HewanDetailBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val name = binding.textDetail
        name.text = intent?.getStringExtra(EXTRA_NAME).toString()

        val description = binding.textDeskripsi
        description.text = intent?.getStringExtra(EXTRA_DESCRIPTION).toString()

        val image = binding.detailImage
        image.setImageResource(intent.getIntExtra(EXTRA_IMAGE, 0))

        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
        supportActionBar!!.title = getString(R.string.label_hewan)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when(item.itemId){
            android.R.id.home -> {
                finish()
                true
            } else -> super.onOptionsItemSelected(item)
        }
    }
}