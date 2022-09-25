package com.harunkor.classesandobjectssamples

class CustomGetterSetter(
    private var firstName: String,
    private var lastName:String) {


    var fullName: String = ""
        get() {
        return "$firstName $lastName"
    }
    set(value) {
        val spliter = value.split(" ")
        firstName = spliter[0] + "X"
        lastName = spliter[1] + "X"
        field = value
    }


}