
fun main() {

    while (true) {

        // Display prompt and read the student's ID from console input
        print("Enter student ID: ")
        val id = readln()

        // Display prompt and read the student's name from console input
        print("Enter student name (or quit to stop): ")
        val name = readln()

        // Stop the loop when the user types "quit"
        if (name == "quit") {
            break
        }

        // Display prompt and read the course from console input
        print("Enter course: ")
        val course = readln()

        // Display prompt and read the mark from console input
        print("Enter mark: ")
        val mark = readln().toDouble()

        // Construct a Student object using the entered data
        val student = Student(id, name, course, mark)

        println(student)
        println()
    }

    // After the loop ends, display "Program finished"
    println("Program finished.")
}