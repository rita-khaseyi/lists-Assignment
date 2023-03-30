fun main() {
   var gets= given(listOf("ree","ray","ryan","rick","roy","rakeem","riri","riya","reyna","roro"))
    println(gets)
    val people =listOf(1.7,1.6,1.9,1.8,2.7,3.7)
    val (x,y) = personHeight(people)
    println("Total  $x")
    println("Average $y")
    human()
    var cars = listOf(
            Car("KDC234R",12000.0),
            Car("KBA224T",2489.0),
            Car("KRX456Y",3546.9),
            Car("GKB245D",3245.9)
    )
    var averageMileage = calculate(cars)
    println("The average mileage is :$averageMileage")


}
fun given(str:List<String>):List<String>{
    var get= mutableListOf<String>()
    for (i in str){
        if(str.indexOf(i)%2==0)
            get+=i
    }
    return get
}


// 2 Given a list of people’s heights in metres. Write a function that returns
//the average height and the total height
fun personHeight (height:List<Double>):Pair<Double,Double>{
    val x = height.sum()
    val y = height.average()
    return Pair(x,y)
}


// 3 Given a list of Person objects, each with the attributes, name, age,
//height and weight. Sort the list in order of descending age
data class Person(val name: String, val age: Int, val height: Double, val weight:Double)
fun human() {
    val persons1 = Person("kira", 2, 145.5, 87.8)
    val persons2 = Person("Keyla", 18, 160.8, 30.6)
    val persons3 = Person("kylie", 10, 200.5, 90.8)
    val humans = mutableListOf(persons1,persons2,persons3)
    val man = humans.sortedByDescending { Person -> Person.age }
    println(man)

}
//Given a list similar to the one above, write a function in which you will
//create 2 more people objects and add them to the list at one go.


data class Car(var registration:String,var mileage:Double)
fun calculate(cars:List<Car>):Double{
    var totalmileage = 0.0
    for(car in cars){
        totalmileage+=car.mileage
    }
    return totalmileage/cars.size
}



