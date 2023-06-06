fun main() {
    val cars = arrayOf("jeep", "bmw", "range")
    cars[1] = "benz"
    println(cars[1])
    println(cars.size)
    if ("jeep" in cars) {
        println("iko")
    }
    else{
        println("haiko")
    }
}