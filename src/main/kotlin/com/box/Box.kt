package com.box.kotlin

 open class Box(var length: Float,var width: Float,var height: Float){

     fun validate(boxSize: Map<String, Float>): Boolean = validate(boxSize.get("length")!!, boxSize.get("width")!!, boxSize.get("height")!!)
     fun validate(length: Float, width: Float, height: Float): Boolean = length <= this.length && width <= this.width && height <= this.height
}

