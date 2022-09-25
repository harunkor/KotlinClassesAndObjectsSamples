package com.harunkor.classesandobjectssamples

abstract class Drinks  {
    abstract val kcaldrinks: Int
    abstract val namedrinks: String
    fun consumeDrinks() =  println("I am eating $namedrinks")
}