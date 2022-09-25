package com.harunkor.classesandobjectssamples

class PrimaryConstructor {

    private  var i: Int = 0

    constructor(i: Int){
        this.i = i
    }

    constructor(i: Int,y: Int){
        this.i = i
    }

    init {

        print(i)
    }

}