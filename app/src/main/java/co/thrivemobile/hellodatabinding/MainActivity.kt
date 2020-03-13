package co.thrivemobile.hellodatabinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModel
import co.thrivemobile.hellodatabinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val activityViewModel: HelloViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityMainBinding =
            DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.apply {
            lifecycleOwner = this@MainActivity
            viewModel = activityViewModel

            submitButton.setOnClickListener {
                val name = userNameText.text.toString()
                if (name.isNotEmpty()) {
                    activityViewModel.submitUserName(name)
                }
            }
        }
    }
}
