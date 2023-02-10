import kotlin.math.PI

fun square(h: Int, w: Int){
    var area = h.times(w)
    println("The area of your square is $area")
    println("Would you like to find the area of another shape? (y/n): ")
    var ans = readLine()
    if (ans == "y"){
        main()
    }else{
        println("Thank you, goodbye!")
    }
}

fun triangle(b: Int, h: Int){
    var area = .5.times(b * h)
    println("The area of your triangle is $area")
    println("Would you like to find the area of another shape? (y/n): ")
    var ans = readLine()
    if (ans == "y"){
        main()
    }else{
        println("Thank you, goodbye!")
    }
}

fun circle(r: Int){
    var area = PI * r
    println("The area of your circle is $area")
    println("Would you like to find the area of another shape? (y/n): ")
    var ans = readLine()
    if (ans == "y"){
        main()
    }else{
        println("Thank you, goodbye!")
    }
}

fun parallelogram(b: Int, h: Int){
    var area = b.times(h)
    println("The area of your parallelogram is $area")
    println("Would you like to find the area of another shape? (y/n): ")
    var ans = readLine()
    if (ans == "y"){
        main()
    }else{
        println("Thank you, goodbye!")
    }
}

fun main(){
    val circle = "1"
    val triangle = "2"
    val square = "3"
    val parallelogram = "4"
    println("1. Circle")
    println("2. Triangle")
    println("3. Square")
    println("4. Parallelogram")
    var option = println("Please enter a number from the list of a shape you would like to find the area of: ").toString()
    option = readLine().toString()
    if (option == circle){
        println("Enter the radius of your circle: ")
        var r: Int = Integer.valueOf(readLine())
        circle(r)
    }else if (option == triangle){
        println("Enter the base of the square: ")
        var b: Int = Integer.valueOf(readLine())
        println("Enter the height of the square: ")
        var h: Int = Integer.valueOf(readLine())
        triangle(b, h)
    }else if (option == square){
        println("Enter the height of the square: ")
        var h: Int = Integer.valueOf(readLine())
        println("Enter the width of the square: ")
        var w: Int = Integer.valueOf(readLine())
        square(h, w)
    }else{
        println("Enter the base of the square: ")
        var b: Int = Integer.valueOf(readLine())
        println("Enter the height of the square: ")
        var h: Int = Integer.valueOf(readLine())
        parallelogram(b, h)
    }

}