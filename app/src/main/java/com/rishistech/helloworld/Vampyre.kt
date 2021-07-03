package com.rishistech.helloworld
//in kotlin We cant use InheritMechanism/OverRide unless we mark it with open
open class Vampyre(name:String):Enemy(name,20,3) {
    override fun takeDamage(damage: Int) {
        super.takeDamage(damage/2)//8(value)/2=4
    }
}