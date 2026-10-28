fun main() {

    // Exercise 1 Step 3 – Create a mutable list to store all Student objects.
    // The list can hold both Undergraduate and Masters objects.
    val students = mutableListOf<Student>()

    while (true) {

        print("Enter student ID: ")
        val id = readln()

        print("Enter student name (or type 'quit' to stop): ")
        val name = readln()

        // Stop entering students when the user types quit.
        if (name.lowercase() == "quit") {
            break
        }

        print("Enter course: ")
        val course = readln()

        print("Enter mark (0-100): ")
        val markInput = readln().toDouble()

        print("Enter student type (u = Undergraduate, m = Masters): ")
        val type = readln().lowercase()

        // Exercise 1 Step 4 – Create the appropriate student object.
        val student: Student = when (type) {
            "u" -> Undergraduate(id, name, course, markInput)
            "m" -> Masters(id, name, course, markInput)
            else -> {
                println("Invalid student type. Defaulting to Undergraduate.")
                Undergraduate(id, name, course, markInput)
            }
        }

        // Exercise 1 Step 4 – Immediately add the new student to the list.
        students.add(student)

        println("Student added.")
        println()
    }

    // Exercise 1 Step 5 – Display all students after data entry finishes.
    println()
    println("All Student Records")
    println("-------------------")

    // Step 5 – Use a second loop to go through the list.
    for (student in students) {

        // Automatically calls the Student class's toString() method.
        println(student)

        // Calls the grading method for the actual student type.
        println("Grade: ${student.getGrade()}")
        println("Passed: ${student.didPass()}")
        println()
    }

    println("Program finished.")
}