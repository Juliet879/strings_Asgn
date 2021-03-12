fun main() {
    println(person("Juliet",21))
    println(long("The power of a Vision Board"))
    print(condition())
}
//fun akir() {
//    var word = "Akirachix"
//    var a = word[0]
//    var b = word[3]
//    var c = word[4]
//

fun person(name:String,age:Int):String {
    return "Hi my name is $name and I am $age years old ."
}

fun long(word:String):Int {
    return word.length
}

fun condition(jina:String) {
    if (jina == "mine"){
        print("That's me ! ")
    }else{
        print("I dont know who that is")
    }
}