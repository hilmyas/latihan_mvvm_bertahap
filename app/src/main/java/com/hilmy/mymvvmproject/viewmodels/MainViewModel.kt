package com.hilmy.mymvvmproject.viewmodels

import android.app.Application
import androidx.databinding.ObservableField
import androidx.lifecycle.AndroidViewModel
import com.hilmy.mymvvmproject.models.Student

class MainViewModel(application: Application): AndroidViewModel(application) {

    var id: ObservableField<String> = ObservableField()
    var main_number: ObservableField<String> = ObservableField()
    var name: ObservableField<String> = ObservableField()
    var photo: ObservableField<String> = ObservableField()
    var address: ObservableField<String> = ObservableField()

    fun setData(student: Student) {
        id.set(student.id)
        main_number.set(student.main_number)
        name.set(student.name)
        photo.set(student.photo)
        address.set(student.address)

    }
}