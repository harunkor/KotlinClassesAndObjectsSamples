package com.harunkor.classesandobjectssamples

class CompanionObjectSample {



    companion object WorldConstants {
        const val t = 44
        val gravity = 9.8
        val unit = "metric"
        fun computeForce(mass: Double, accel: Double): Double {
            return mass * accel
        }
    }



}