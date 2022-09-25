package com.harunkor.classesandobjectssamples

abstract class Food  {
    abstract val kcal: Int
    abstract val name: String
    fun consume() =  println("I am eating $name")
}