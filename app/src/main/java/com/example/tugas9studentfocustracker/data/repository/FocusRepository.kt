package com.example.tugas9studentfocustracker.data.repository

import com.example.tugas9studentfocustracker.data.api.RetrofitClient
import com.example.tugas9studentfocustracker.data.model.Focus

class FocusRepository {
    suspend fun getFocusTasks(): List<Focus> {
        return try {
            RetrofitClient.instance.getFocusTasks()
        } catch (e: Exception) {
            emptyList()
        }
    }
}