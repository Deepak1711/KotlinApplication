package com.example.deepak.kotlintrial.Util

/**
 * Created by webonise on 13/7/17.
 */
class Constant {
    val QUESTION_1 = "Question 1"
    val CODE_1 = """
        val spell:String ?= null
        val length=spell?.length ?:-1
        findProduct("2",null)

        fun findProduct(arg1:String?,arg2:String?){
            val x=parseInt(arg1)
            val y=parseInt(arg2)
            if(x!=null && y!=null)
                Toast.makeText(this,(x*y).toString(),Toast.LENGTH_SHORT).show()
            else
                Toast.makeText(this,"either x or y is null",Toast.LENGTH_SHORT).show()
        }
"""
    val OUTPUT_1 = "Either X or Y is null"
    val DESCRIPTION_1 = "Not Required"

    val QUESTION_2 = "Question 2"
    val CODE_2 = "Code 2"
    val OUTPUT_2 = "Output 2"
    val DESCRIPTION_2 = "Description 2"
}