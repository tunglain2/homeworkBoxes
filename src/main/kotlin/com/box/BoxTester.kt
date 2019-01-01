package com.box.kotlin

import java.util.*
import kotlin.collections.HashMap

fun main(args: Array<String>) {
    val sizeNames = listOf<String>("length","width","height")
    val sizeValues= HashMap<String,Float>()
    val scanner = Scanner(System.`in`)
    for(sizeName in sizeNames){
        print("Please enter object's $sizeName:")
        sizeValues.put(sizeName,scanner.nextFloat())
    }
    if (Box5().validate(sizeValues)){
        if (Box3().validate(sizeValues)){
            println(Box3().name.toString())
        }else {
            println(Box5().name.toString())
        }
    }else {
        println("Box3和Box5尺寸不符合")
    }
}