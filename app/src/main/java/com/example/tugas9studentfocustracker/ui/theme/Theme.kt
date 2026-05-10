package com.example.tugas9studentfocustracker.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable

private val AppColorScheme = lightColorScheme(
    primary = NavyPrimary,
    secondary = BlueSecondary,
    background = LightBackground,
    surface = WhiteSurface,
    onPrimary = OnPrimaryText,
    error = AccentRed
)

@Composable
fun Tugas9StudentFocusTrackerTheme(
    content: @Composable () -> Unit
) {
    MaterialTheme(
        colorScheme = AppColorScheme,
        typography = AppTypography,
        content = content
    )
}
