import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class Screen2ViewModel : ViewModel() {
    private val _selectedImage = MutableLiveData<String>()
    val selectedImage: LiveData<String> = _selectedImage

    fun setSelectedImage(image: String) {
        _selectedImage.value = image
    }
}