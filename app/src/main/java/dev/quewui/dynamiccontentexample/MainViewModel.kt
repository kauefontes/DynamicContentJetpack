package dev.quewui.dynamiccontentexample

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {
    val textViewState = MutableLiveData("")

    fun onTextChange(newText: String) {
        textViewState.value = newText
    }
}