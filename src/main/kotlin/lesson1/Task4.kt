package lesson1

fun main() {

  /**@value Расстояние, которое пролетел Гагарин, пока был в космосе в миллиметрах*/
  val length: ULong = 40_868_600_000u

  /**@value Возраст Гагарина на момент полета (целых лет)*/
  val age: UByte = 27u

  /**@value Какую часть дня Гагарин провел в космосе*/
  val partOfDay: Float = 0.075f

  /**@value количество секунд которое Гагарин провел в космосе*/
  val seconds:UShort = 6480u

  /**@value какую часть года Гагарин провел в космосе*/
  val partOfYear:Double = 2.0547945205479453E-4

  /**@value апогей орбиты Гагарина в метрах.*/
  val apogee:UInt  = 327000u

  println(length)
  println(age)
  println(partOfDay)
  println(seconds)
  println(partOfYear)
  println(apogee)

}