package com.spec.demo

class Demo {

    fun greetName(name : String) : String{
        return "Hello $name"
    }

    companion object{
        fun greet(name: String):String{
            return "Hello $name"
        }
    }
}