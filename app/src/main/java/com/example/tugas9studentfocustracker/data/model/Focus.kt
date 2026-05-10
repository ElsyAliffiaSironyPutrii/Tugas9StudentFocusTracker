package com.example.tugas9studentfocustracker.data.model

import com.google.gson.annotations.SerializedName

data class Focus(
    @SerializedName("title") val title: String,
    @SerializedName("description") val description: String,
    @SerializedName("imageUrl") val imageUrl: String,
    @SerializedName("category") val category: String
)