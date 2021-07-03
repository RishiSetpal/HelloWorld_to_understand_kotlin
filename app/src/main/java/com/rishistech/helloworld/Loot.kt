package com.rishistech.helloworld

enum class LootType{
    POTION, RING, ARMOR
}
class Loot(val name:String, val type:LootType,val value:Double) {
    override fun toString(): String {
        return """
            .lootName: $name lootType: $type lootvalue: $value
        """.trimIndent()
    }
}