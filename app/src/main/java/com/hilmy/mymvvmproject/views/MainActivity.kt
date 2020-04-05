package com.hilmy.mymvvmproject.views

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import com.hilmy.mymvvmproject.R
import com.hilmy.mymvvmproject.databinding.ActivityMainBinding
import com.hilmy.mymvvmproject.models.Student
import com.hilmy.mymvvmproject.viewmodels.MainViewModel

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        viewModel = ViewModelProviders.of(this).get(MainViewModel::class.java)
        binding.main = viewModel

        viewModel.setData(Student("1", "2110121000", "Hilmy",
            "https://photo.jpg", "Perumahan Saya Blok Saya No. Rumah Saya"))
    }
}
