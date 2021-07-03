package com.rishistech.helloworld
//SuperClass
//by default kotlin class cant be extended
// if used java we mark the class as final
// we cant inherit from enemy unless we mark it as open
open class Enemy(val name:String, var hitPoints:Int, var lives:Int) {
    open fun takeDamage(damage:Int){
        val remainingHitPoints = hitPoints - damage
        if (remainingHitPoints>0){
            hitPoints = remainingHitPoints
            println("$name took $damage points of damage, and has $hitPoints left")
            //augmented assignment/ compound subtraction
        }else{
            lives-=1
            if (lives>0){
                println("$name lost a life")
            }else{
                println("No lives left $name is Dead")
            }
        }
    }

    override fun toString(): String {
        return """
            name: $name, hitPoints: $hitPoints, lives: $lives
        """.trimIndent()

    }
}