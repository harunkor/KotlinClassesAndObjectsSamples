package com.harunkor.classesandobjectssamples

import android.annotation.SuppressLint
import android.icu.util.Calendar
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.harunkor.UserTypeEnum
import com.harunkor.classesandobjectssamples.extension.dateFormat
import com.harunkor.classesandobjectssamples.extension.decimalFormat
import java.text.SimpleDateFormat
import java.time.LocalDate
import java.time.LocalDateTime
import java.util.*

class MainActivity : AppCompatActivity() {

    //private lateinit var house: House


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Sample 1
       /* val house = House()
        house.updateColor("white")
        println(house.color)
        Log.v("PATIKA",house.color)*/

        //Sample 2
        /*val a = ConstructorsA(9)
        println(a.x)
        val b = ConstructorsB(8)
        println(b.x)*/

        //Sample 3
        /*val box = ConstructorsDefaultParametersBox(length = 60)
        val box1 = ConstructorsDefaultParametersBox(10,10,35)
        val box2 = ConstructorsDefaultParametersBox( height = 30,width = 10, length = 80)
*/

        // Sample 4
       // val initializerBlock = InitializerBlock(4)

        // Sample 5
        //val multipleConstructors = MultipleConstructors(4.5)
        //val multipleConstructors2 = MultipleConstructors("PATIKA")
        //val multipleConstructors3 = MultipleConstructors(1)
        //val multipleConstructors4 = MultipleConstructors(1,"PATIKA")

        // Sample 6
       /* val personProperty = PersonProperty("PATIKA")
        println(personProperty.name)
        personProperty.name = "HARUN"
        println(personProperty.name)
        personProperty.printName()*/

        // Sample 7
        /*val customGetterSetter = CustomGetterSetter("HARUN","KÖR")
        customGetterSetter.fullName = "JOHN PASSER"
        println(customGetterSetter.fullName)*/

        //Sample 8
        /*
        val interfaceExample = InterfaceExample(5.0)
        println(interfaceExample.)*/

        //Sample 9
        /*val abstractSample = AbstractSample()
        abstractSample.consume()*/

        //Sample 10
       /* val d1:Double = 4.576
        val d2:Double = 2.546
        val b1: Double = d1/d2
        println(b1)
        println(b1.decimalFormat(3))

        val currentDate = Date()
        println(currentDate.dateFormat("d MMMM EEE" ))*/

        //Sample 11
        /*val dataClassSample = DataClassSample("Harun",34)
        println(dataClassSample)

        var pairSample = Pair("DENEME","DENEME2")
        println(pairSample.first)
        println(pairSample.second)

        val tripleSample = Triple("A","B","C")
        println(tripleSample)
        println(tripleSample.first)
        println(tripleSample.second)
        println(tripleSample.third)

        val pairToSample = "Harry Potter".to("J. K. Rowling")
        val pairToSample2 = "Harry Potter" to "J. K. Rowling"
        println(pairToSample)
        println(pairToSample2)

        val map = mapOf(1 to "x",2 to "y",3 to "z")
        println(map)*/


        //Sample 12
        /*val premium = 2
        if(premium == UserTypeEnum.PREMIUM){
            println("PREMIUM")
        }

        println("${Color.GREEN.r} ${Color.GREEN.g} ${Color.GREEN.b}")*/


        //Sample 13
        //println(ObjectClassSample.add(4,5))


        // Sample 14
        /*
        println(CompanionObjectSample.gravity)
        println(CompanionObjectSample.computeForce(10.0,20.0))*/




    }
}