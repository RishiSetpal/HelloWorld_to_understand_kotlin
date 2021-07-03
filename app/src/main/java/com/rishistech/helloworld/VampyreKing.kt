package com.rishistech.helloworld

import java.util.*

class VampyreKing(name:String): Vampyre(name) {
    init {
        hitPoints = 140 // at the time of instantiation default hitPoints=140
    }

    override fun takeDamage(damage: Int) {
        super.takeDamage(damage/2)//oh it calls Class(superClass(damage/2)/2)so its /4
    }

    fun runAway(): Boolean{
        return lives<2
    }

    fun dodges():Boolean{
        val rand = Random()
        val chance = rand.nextInt(6) //between 0 to 5
        if (chance>3){
            println("Dracula dodges")
            return true
        }
        return false
    }
}