package package br.edu.satc.todolistcompose.ui.theme

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.seupacote.model.ThemeMode

class ThemeViewModel(
    private val themePreference: ThemePreference
) : ViewModel() {

    var themeMode = mutableStateOf(themePreference.getTheme())
        private set

    fun setTheme(mode: ThemeMode) {
        themePreference.saveTheme(mode)
        themeMode.value = mode
    }
}