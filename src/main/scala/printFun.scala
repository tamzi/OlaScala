package org.tamrefrank

import scala.language.postfixOps
import scala.main

/*
* How to print things in scala Scala Print things
*
* */
@main def HelloWorld(args: String*): Unit =
  println("Hello, World!")

@main def agesOfPeople() =
  val ages = Seq(34,12,56,87)
  println(s"The oldest person is ${ages.max}")

@main def oldestPerson() =
    val ages = Seq(42, 75, 29, 64)
    println(s"The oldest person is ${ages.min}")

@main def planetaria() =
  val planets = Seq("mars", "jupiter", "Saturn", "Uranus", "Pluto")
  println(s"This are the ${planets}")

@main def MostPoints() =
  val points = Seq(420, 775, 129, 264)
  printf(s"The least points is ${points.min}")

@main def combinedString()=
  val a = 500
  val b = ("boy")
  val c = b.concat("s")
  println(a+c)



