fun main(){
    var Sapien= Human("Moon",4, 30)
    Sapien.eat(40)
    println(Sapien.weight)
    Sapien.speak("Dinner is ready")
   println(Sapien.birthday())
    var customer = User("lily","Gikuku","lily@mail.com",7655,"imnc78")
    println(customer.email)
    println(customer.phoneNumber)




}

class Human(var name:String,var age: Int, var weight: Int){
    fun eat(foodWeight:Int):Int{
        weight+=foodWeight
        println("I am eating $foodWeight kg of food")
        return weight

    }
    fun speak(speech:String){
        println(speech)

    }
    fun birthday():Int{
        age++
        return age

    }
}
data class User(var firstName: String,var lastName:String,var email:String,var phoneNumber: Int,var passWord:String){

}