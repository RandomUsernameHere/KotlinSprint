package lesson1

fun main() {
  val seconds: Short = 6480
  val secondsInHour: Short = 3600
  val secondsInMinute: Short = 60
  var minutes: Short = 0
  var hours: Short = 0
  var minutesDivisionReminder: Short = 0
  var hoursDivisionReminder: Short = 0

  hours = (seconds / secondsInHour).toShort()
  hoursDivisionReminder = (seconds - (hours * secondsInHour)).toShort()

  minutes = (hoursDivisionReminder / secondsInMinute).toShort()
  minutesDivisionReminder = (hoursDivisionReminder - (minutes * secondsInMinute)).toShort()

  println(String.format("%02d:%02d:%02d", hours.toInt(), minutes.toInt(), minutesDivisionReminder.toInt()))

}
