package com.harunkor.classesandobjectssamples.extension

import java.text.SimpleDateFormat
import java.util.*


fun Date.dateFormat(dateFormat: String) =
  SimpleDateFormat(dateFormat, Locale.getDefault()).format(this)
