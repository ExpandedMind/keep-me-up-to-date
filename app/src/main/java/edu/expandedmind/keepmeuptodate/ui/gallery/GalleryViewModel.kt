package edu.expandedmind.keepmeuptodate.ui.gallery

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class GalleryViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Here we will display settings"
    }
    val text: LiveData<String> = _text
}