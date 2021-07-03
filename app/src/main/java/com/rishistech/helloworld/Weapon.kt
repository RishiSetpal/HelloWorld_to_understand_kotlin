package com.rishistech.helloworld

class Weapon(val name:String, var damageInflicted:Int) {

    override fun toString(): String {
        return """
            . weaponName:$name weaponDamageInflicted:$damageInflicted
        """.trimIndent()
    }
}