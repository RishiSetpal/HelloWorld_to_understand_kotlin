package com.rishistech.helloworld

import android.os.Build
import androidx.annotation.RequiresApi

class Player(val name: String, var level: Int = 1, var lives: Int = 3, var score: Int = 3) {
    //dose't get DefaultConstructor DC
    var weapon: Weapon = Weapon("Fist", 1)
    private val inventory = ArrayList<Loot>()

    fun show() {
        if (lives > 0) {
            println("$name is alive")
        } else {
            println("$name is Dead")
        }

    }

    //bydefault this toString function returns the objectID
    override fun toString(): String {
        return """
            .
            name: $name
            lives: $lives level: $level score: $score
            //this is long cut else use direct call of object which will call toString of that class
            weaponName: ${weapon.name} weaponDamageInflicted: ${weapon.damageInflicted}
            weapon: $weapon
        """
    }

    fun setLoot(item: Loot) {
        inventory.add(item)// adds into list
    }

    fun dropLoot(item: Loot): Boolean {
        return if (inventory.contains(item)) {// checks if the item contains
            inventory.remove(item)// then remove
            true
        } else {
            false
        }
    }

    //overLoading
    @RequiresApi(Build.VERSION_CODES.N)
    fun dropLoot(name: String): Boolean {
        println("$name will be dropped")
        //return inventory.removeIf { it.name==name }
        // it checks each item in the list and removes it of the name is same
        // it. item currently been check
        // if any item is remove then it returns true else false
        for (item in inventory) {
            if (item.name == name) {
                inventory.remove(item);
                return true
            }
        }
        return false
    }

    fun showInventory() {
        var total = 0.0
        println("\n$name's Inventory")
        //println(inventory.get(0)) // called toString fn of Loot Class
        for (item in inventory) { //for each loop in java
            println(item)
            total += item.value
        }
        println("=================================")
        println("total Score is: $total")
        println("=================================")
    }
}