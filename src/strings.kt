fun main() {
    akir()
    println(person("Juliet", 21))
    println(long("The power of a Vision Board"))
    condition("Beth")
}

fun akir() {
    var word = "Akirachix"
    var a = word[0]
    var b = word[2]
    var c = word[3]
    println("$a$b$c")
}

fun person(name: String, age: Int): String {
    return "Hi my name is $name and I am $age years old ."
}

fun long(word: String): Int {
    return word.length
}

fun condition(jina: String) {
    if (jina == "Juliet") {
        println("That's me!")
    } else {
        println("I dont know who that is.")
    }
}