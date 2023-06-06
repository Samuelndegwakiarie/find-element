fun main() {
    val cars = arrayOf("jeep", "bmw", "range")
    cars[1] = "benz"
    println(cars[1])
    println(cars.size)
    //checks if jeep is i n the array
    if ("jeep" in cars) {
        println("found")
    }
    else{
        println(" not found")
    }
    // prints all elements in the array
    for (x in cars){
        println(x)
    }
}


