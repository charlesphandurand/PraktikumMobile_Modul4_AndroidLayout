package com.example.modul4

import androidx.lifecycle.ViewModel

class DataSource : ViewModel() {
    fun loadHerbivoras(): List<Hewan> {
        return listOf(
            Hewan(R.drawable.herbivora1, R.string.herbivora1, R.string.deskripsi1),
            Hewan(R.drawable.herbivora2, R.string.herbivora2, R.string.deskripsi2),
            Hewan(R.drawable.herbivora3, R.string.herbivora3, R.string.deskripsi3),
            Hewan(R.drawable.herbivora4, R.string.herbivora4, R.string.deskripsi4),
            Hewan(R.drawable.herbivora5, R.string.herbivora5, R.string.deskripsi5),
            Hewan(R.drawable.herbivora6, R.string.herbivora6, R.string.deskripsi6),
            Hewan(R.drawable.herbivora7, R.string.herbivora7, R.string.deskripsi7),
            Hewan(R.drawable.herbivora8, R.string.herbivora8, R.string.deskripsi8),
            Hewan(R.drawable.herbivora9, R.string.herbivora9, R.string.deskripsi9),
            Hewan(R.drawable.herbivora10, R.string.herbivora10, R.string.deskripsi10)
        )
    }

    fun loadKarnivoras(): List<Hewan> {
        return listOf(
            Hewan(R.drawable.karnivora1, R.string.karnivora1, R.string.deskripsi11),
            Hewan(R.drawable.karnivora2, R.string.karnivora2, R.string.deskripsi12),
            Hewan(R.drawable.karnivora3, R.string.karnivora3, R.string.deskripsi13),
            Hewan(R.drawable.karnivora4, R.string.karnivora4, R.string.deskripsi14),
            Hewan(R.drawable.karnivora5, R.string.karnivora5, R.string.deskripsi15),
            Hewan(R.drawable.karnivora6, R.string.karnivora6, R.string.deskripsi16),
            Hewan(R.drawable.karnivora7, R.string.karnivora7, R.string.deskripsi17),
            Hewan(R.drawable.karnivora8, R.string.karnivora8, R.string.deskripsi18),
            Hewan(R.drawable.karnivora9, R.string.karnivora9, R.string.deskripsi19),
            Hewan(R.drawable.karnivora10, R.string.karnivora10, R.string.deskripsi20)
        )
    }

    fun loadOmnivoras(): List<Hewan> {
        return listOf(
            Hewan(R.drawable.omnivora1, R.string.omnivora1, R.string.deskripsi21),
            Hewan(R.drawable.omnivora2, R.string.omnivora2, R.string.deskripsi22),
            Hewan(R.drawable.omnivora3, R.string.omnivora3, R.string.deskripsi23),
            Hewan(R.drawable.omnivora4, R.string.omnivora4, R.string.deskripsi24),
            Hewan(R.drawable.omnivora5, R.string.omnivora5, R.string.deskripsi25),
            Hewan(R.drawable.omnivora6, R.string.omnivora6, R.string.deskripsi26),
            Hewan(R.drawable.omnivora7, R.string.omnivora7, R.string.deskripsi27),
            Hewan(R.drawable.omnivora8, R.string.omnivora8, R.string.deskripsi28),
            Hewan(R.drawable.omnivora9, R.string.omnivora9, R.string.deskripsi29),
            Hewan(R.drawable.omnivora10, R.string.omnivora10, R.string.deskripsi30)
        )
    }
}
