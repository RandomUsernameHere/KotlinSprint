package lesson1

fun main() {
  /**@value Количество секунд которое Гагарин провел в космосе*/
  val seconds: UShort = 6480u

  /**@value Число секунд в часе*/
  val secondsInHour: UShort = 3600u

  /**@value Число секунд в минуте*/
  val secondsInMinute: UShort = 60u

  /**@value Число минут полета*/
  var minutes: UShort = 0u

  /**@value Число часов полета*/
  var hours: UShort = 0u

  /**@value Остаток от деления минут*/
  var minutesDivisionReminder: UShort = 0u

  /**Остаток от деления часов*/
  var hoursDivisionReminder: UShort = 0u

  hours = (seconds / secondsInHour).toUShort()
  hoursDivisionReminder = (seconds - (hours * secondsInHour)).toUShort()

  minutes = (hoursDivisionReminder / secondsInMinute).toUShort()
  minutesDivisionReminder = (hoursDivisionReminder - (minutes * secondsInMinute)).toUShort()

  println(getPrintString(hours, minutes, minutesDivisionReminder))

}

/**
 * Функция преобразовывает число в строку и добивает слева нулями
 *
 * @param number Число для форматирования
 * @param length До такой длины добивается строка
 *
 * @return строку-результат
 * */
fun padLeft(number: UShort, length: Int = 2): String {
  return number.toString().padStart(length, '0')
}

/**
 * Функция собирает строку для печати формата HH:MM:SS
 *
 * @param hours количество часов
 * @param minutes количество минут
 * @param seconds количество секунд
 *
 * @return Строка-результат
 * */
fun getPrintString(hours: UShort, minutes: UShort, seconds: UShort): String {
  return padLeft(hours) + ":" + padLeft(minutes) + ":" + padLeft(seconds)
}