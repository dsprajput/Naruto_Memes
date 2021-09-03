package com.example.narutomemes.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Narutomeme(@StringRes val stringResourceId: Int,
                        @DrawableRes val imageResourceId: Int)