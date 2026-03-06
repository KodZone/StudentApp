
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

        // Create the Student object
        // markInput will be validated by the custom setter
        val student = Student(id, name, course, markInput)

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