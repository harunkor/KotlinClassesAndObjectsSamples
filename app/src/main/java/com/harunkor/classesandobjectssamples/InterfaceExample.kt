package com.harunkor.classesandobjectssamples


class InterfaceExample(private val radius: Double): Shape {

    override fun computeArea() = Math.PI * radius * radius


}