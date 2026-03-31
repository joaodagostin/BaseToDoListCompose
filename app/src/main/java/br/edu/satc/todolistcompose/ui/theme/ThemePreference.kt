package package br.edu.satc.todolistcompose.ui.theme

import android.content.Context
import com.seupacote.model.ThemeMode

class ThemePreference(context: Context) {

    private val prefs = context.getSharedPreferences("theme_prefs", Context.MODE_PRIVATE)

    fun saveTheme(themeMode: ThemeMode) {
        prefs.edit().putString("theme_mode", themeMode.name).apply()
    }

    fun getTheme(): ThemeMode {
        val value = prefs.getString("theme_mode", ThemeMode.SYSTEM.name)
        return try {
            ThemeMode.valueOf(value ?: ThemeMode.SYSTEM.name)
        } catch (e: Exception) {
            ThemeMode.SYSTEM
        }
    }
}