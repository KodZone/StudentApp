
fun main() {

    while (true) {

        print("Enter student ID: ")
        val id = readln()

        print("Enter student name (or type 'quit' to stop): ")
        val name = readln()

        // Stop the program if the user enters quit
        if (name.lowercase() == "quit") {
            break
        }

        print("Enter course: ")
        val course = readln()

        print("Enter mark (0-100): ")
        val markInput = readln().toDouble()

        print("Enter student type (u = Undergraduate, m = Masters): ")
        val type = readln().lowercase()

        // Create the correct type of student
        val student: Student = when (type) {
            "u" -> Undergraduate(id, name, course, markInput)
            "m" -> Masters(id, name, course, markInput)
            else -> {
                println("Invalid student type. Defaulting to Undergraduate.")
                Undergraduate(id, name, course, markInput)
            }
        }

        println()
        println("Student Record")
        println("--------------")
        println(student)
        println("Grade: ${student.getGrade()}")
        println("Passed: ${student.didPass()}")
        println()
    }

    println("Program finished.")
}