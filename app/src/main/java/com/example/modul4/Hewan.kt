package com.example.modul4

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Hewan(
    @DrawableRes val imageResourceId: Int,
    @StringRes val name: Int,
    @StringRes val description: Int
)
