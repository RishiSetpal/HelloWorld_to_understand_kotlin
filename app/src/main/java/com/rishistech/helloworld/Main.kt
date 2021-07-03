package com.rishistech.helloworld

import android.os.Build
import androidx.annotation.RequiresApi

//No need to create class in Kotlin
//main is the starting function of kotlin
//fun keyword to define function
//{part of the function}

//capital name of the Class or Interface
//var variable Which varies (Mutable)
//val is Value which is constant (imMutable)
//Memory: 2types -  1.Stack> it creates a set of frames with methods which refers the variable in the Heap.
//                  2.Heap> it stores the values of referred variable. Where Objects are created.

// DataTypes: Primitive(PreDefined) Kotlin uses Classes
// Byte(1B), Short(2B), Int(4B), Long(8B),
// Float(4B), Double(8B),
// Char(1B), Boolean(1b),
// String


@RequiresApi(Build.VERSION_CODES.N)
fun main(args: Array<String>) {
    //
//    var rii: String      //Declaration
//    rii = "Rishi Setpal" //initialization
//    println(rii)         //
//
//    var riisWeaklySalary: Int = 32
//    var riiMonthlySalary: Int = riisWeaklySalary*4
//    println(riisWeaklySalary)
//    println(riiMonthlySalary)
//    println("I can Print \$bRishi");
//    println();
//
//    //lateral is a term to used for actual value rather than a variable
//    val apples: String = 6.6.toString();
//    val oranges: String = 5.toString();
//    var fruits: Double = oranges.toDouble()+apples.toDouble();
//    println(fruits);
//
//    println((11+22).toString()+"=="+11+22)
//    //or String InterPolation
//    var a:Int = 11
//    var b:Int = 22
//    println("$a+$b=="+11+22)
//    println("${a+b}=="+11+22)

    //conditional Processing
    //
//    val lives = 0
//    val isGameOver = lives<1 //declaration and evaluation
//    if (isGameOver){ //block of code or Statements
//        println("Game Over!")
//    }else{
//        println("you are still alive!")
//    }

    //Input
//    println("How old are you: ")
//    val age: Int = readLine()!!.toInt()
//    println("Your age is $age") //not null asserted call
////https://www.geeksforgeeks.org/kotlin-null-safety/#:~:text=Not%20null%20assertion%20%3A%20!!&text=The%20not%20null%20assertion%20(!!,ask%20explicitly%20using%20this%20operator.
//    var message: String
//    message = if (age<18) {"You're too young to vote"} else if (age==100) {"Congratulations"} else {"You can vote"}
//    print(message)
//    message = when {
//        age<18 -> {"You're too young to vote"}
//        age==100 -> {"Congratulations"}
//        else -> {"You can vote"}
//    }
//    print(message)

    //Game
    // Class is a Blueprint/Structure or template of object
    // Class is collection of methods(behaviour) and variable()
    //Process of creating a class is called encapsulation
    // object is an instance of the Class
    //process of creating a object is called initialization
    //constructor: Special type of method used for initialization of InstanceVariable at the time of object creation

//    val tim = Player("Timm")
//    println(tim.name+" "+tim.lives+" "+tim.level+" "+tim.score) // dot notation to refer to various properties
//    tim.show()
//
//    val louise = Player("louise", 5)
//    //louise.level=5
//    louise.show()
//    //while initialization of object parameters/arguments first_non_default the default or directly using equal=
//    val p1 = Player("P1",level = 4,lives = 8)
//    val p2 = Player("p2",2,5,1000)
//    val p3 = Player("p3",2,5,1000)
//    p1.show();p2.show();p3.show()
//
//    println(p1.weapon.name.toUpperCase()+" "+p1.weapon.damageInflicted)
//
//    val axe:Weapon = Weapon("Axe",12)
//    p1.weapon = axe // now p1.weapon is also referring to the same object
//    //so if any of the one changes, it is working  on the same/one object
//    println(p1.weapon.name+" = "+axe.name)
//
//    //example
//    axe.damageInflicted=24
//    println(axe.damageInflicted) //no surprise
//    print(p1.weapon.damageInflicted) // surprise working on same object which we referred to.
//
//    tim.weapon = Weapon("Sword",10)
//    println(tim.weapon.name)
//    tim.show()
//
//    louise.weapon = tim.weapon
//    louise.show()
//
//    tim.weapon = Weapon("Spear",14)
//    tim.show()
//
//    //enum is way pf storing multiple choices for something+
//    val redPortion = Loot("Red Potion",LootType.POTION,7.50)
//    ////tim.inventory.add(redPortion)
//    tim.setLoot(redPortion)
//    val chestArmor = Loot("+3Chest Armor",LootType.ARMOR,80.0)
//    ////tim.inventory.add(chestArmor)
//    tim.setLoot(chestArmor)
//    //we can also do it using
//    //object on fly
//    ////tim.inventory.add(Loot("Ring of Protection +2", LootType.RING,40.25))
//    ////tim.inventory.add(Loot("Invisibility Portion", LootType.POTION,35.95))
//
//    tim.showInventory()
//
//    //new
//    tim.setLoot(Loot("RED portion",LootType.POTION,7.50))
//    tim.setLoot(Loot("Invisibility Portion",LootType.POTION,35.95))
//    tim.showInventory()
//    if (tim.dropLoot(redPortion)){
//        tim.showInventory()
//    }else{println("you don't have a ${redPortion.name}")}
//    val bluePortion = Loot("Blue Portion",LootType.POTION,6.00)
//    if (tim.dropLoot(bluePortion)){
//        tim.showInventory()
//    }else{println("you don't have a ${bluePortion.name}")}
//
//    if(tim.dropLoot("Invisibility Portion")){
//        tim.showInventory()
//    }else{
//        println("It Doesn't have Invisibility Portion")
//    }
    //println(" =============$tim") //called toString function


//    for (i in 1..10){//starting from 1 till 10 is inclusive
//        println(i)
//    }
//    for (i in 0..10){//starting from 0 till 10 is inclusive
//        println(i)
//    }
//    for (i in 0 until 10){
//        println(i)
//    }
//    for (i in 10 downTo 0 step 2){
//        println(i)
//    }
//    for (i in 10 downTo 0){
//        println(i)
//    }
//    println("==========")
//    for (i in 5..100 step 5){
//        if(i%3==0 && i%5==0){
//            println(i)
//        }
//    }

    // normal use of Class
//    val enemy: Enemy = Enemy("test enemy", 10, 3)
//    print(enemy.toString() + "\n")
//    enemy.takeDamage(4)
//    print(enemy.toString() + "\n")
//    enemy.takeDamage(11)
//    println(enemy)
//
//    // use of inheritance
//    val uglyTroll: Troll = Troll("Ugly Troll")
//    println(uglyTroll)
//    uglyTroll.takeDamage(30)
//
//    //Top most call in Super Class is baseClass/Any/Default Constructor
//    val vlad = Vampyre("Vlad")
//    println(vlad)
//    vlad.takeDamage(8)
//    println(vlad)

    //for loop
    //for (i in 1..10){
//    val dracula = VampyreKing("Dracula")
//    println(dracula)

    //While Loop |Continue|Break|Random|doWhile(atLeastOnesExecutes,EndCheck)
//    do {
//        if (dracula.dodges()) {
//            continue;
//        }
//        if (dracula.runAway()) {
//            println("Dracula run Away")// infinite loop
//            break
//        } else {
//            dracula.takeDamage(80)
//        }
//    }while (dracula.lives > 0)
//    println("--------------------")
        //}


    //for loop
    val conan = Player("conan")
    conan.setLoot(Loot("Invisibility", LootType.POTION, 4.0))
    conan.setLoot(Loot("Mithril", LootType.ARMOR, 183.0))
    conan.setLoot(Loot("Ring of Speed", LootType.RING, 25.0))
    conan.setLoot(Loot("red Portion", LootType.POTION, 2.0))
    //conan.setLoot(Loot("Cursed Shield", LootType.ARMOR, -8.0))
    conan.setLoot(Loot("Brass Ring", LootType.RING, 1.0))
    conan.setLoot(Loot("Chain Mail", LootType.ARMOR, 4.0))
    conan.setLoot(Loot("Gold Ring", LootType.RING, 12.0))
    conan.setLoot(Loot("Gold Ring", LootType.RING, 12.0))
    conan.setLoot(Loot("Gold Ring", LootType.RING, 12.0))
    conan.setLoot(Loot("Health Portion", LootType.POTION, 3.0))
    conan.setLoot(Loot("Silver Ring", LootType.RING, 6.0))
    conan.setLoot(Loot("Silver Ring", LootType.RING, 6.0))
    conan.showInventory()

    conan.dropLoot("Gold Ring")
    conan.showInventory()

    conan.dropLoot("Silver Ring")
    conan.showInventory()

    //1
    val dropped = conan.dropLoot("Something not present")
    println(dropped)
    //2
    println(conan.dropLoot("Something else"))// object on fly
    //3
    if (conan.dropLoot("A bit of junk")){ // in-spite of printing false/true we print a statement to be understood
        println("Junk Dropped")
    }else{
        println("You don't have any Junk")
    }

    //loop Challenge
}