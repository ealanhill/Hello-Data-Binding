package co.thrivemobile.hellodatabinding

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HelloViewModel : ViewModel() {

    val userName: LiveData<String> = MutableLiveData<String>()

    fun submitUserName(name: String) {
        (userName as MutableLiveData).value = "Hello, $name!"
    }
}