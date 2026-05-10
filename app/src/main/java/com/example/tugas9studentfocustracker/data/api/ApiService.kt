package com.example.tugas9studentfocustracker.data.api

import com.example.tugas9studentfocustracker.data.model.Focus
import retrofit2.http.GET

interface ApiService {
    @GET("focus_tasks.json")
    suspend fun getFocusTasks(): List<Focus>
}