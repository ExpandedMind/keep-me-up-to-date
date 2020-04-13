package edu.expandedmind.keepmeuptodate.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HomeViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Feed will be displayed here"
    }
    val text: LiveData<String> = _text
}