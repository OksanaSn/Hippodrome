class Horse(private val number: Int){


    var speed = (1..100).random()


    override fun toString(): String {
        return "Лошадь №$number Скорость - $speed"
    }


    fun generateNewSpeed(): Int {
        speed = (1..100).random()
        return speed
    }

}