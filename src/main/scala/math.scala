package org.tamrefrank

@main def additional(): Unit =
  val additional: Int = 8 + 4 + 10
  print(additional)

@main def multiply(): Unit =
  val multiply = 12*10
  print(multiply)

@main def bigDecimalCalc()=
  val x: BigDecimal = 12345.6789
  val y = x*100
  print(y)


@main def bodmas()=
  val bodmas: Int = (100/2)*10+10-5000
  print(bodmas)