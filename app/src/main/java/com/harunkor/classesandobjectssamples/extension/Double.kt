package com.harunkor.classesandobjectssamples.extension


fun Double.decimalFormat(digits: Int) = "%.${digits}f".format(this).toDouble()

