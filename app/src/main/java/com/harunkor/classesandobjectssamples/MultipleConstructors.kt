package com.harunkor.classesandobjectssamples


class MultipleConstructors(radius: Double) {

    constructor(name:String): this(1.0)
    constructor(diameter:Int): this(diameter/ 2.0)
    constructor(diameter:Int,name:String): this(diameter/ 3.0)

    init {

        println("Area : ${Math.PI * radius * radius}")
    }


}