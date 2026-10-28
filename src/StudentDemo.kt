fun main() {

    val university = University()
    var choice: String = ""

    while (choice != "4") {

        println()
        println("University Menu")
        println("---------------")
        println("1. Add a student")
        println("2. Search for student by ID")
        println("3. Search for students by name")
        println("4. Quit")
        print("Enter your choice: ")

        choice = readln()

        when (choice) {

            "1" -> {
                // Step 4 – Ask for the student type first.
                print("Enter student type (u = Undergraduate, m = Masters): ")
                val type = readln().lowercase()

                if (type == "u" || type == "m") {

                    // Step 4 – Read the common student information.
                    print("Enter student ID: ")
                    val id = readln()

                    print("Enter student name: ")
                    val name = readln()

                    print("Enter course: ")
                    val course = readln()

                    print("Enter mark (0-100): ")
                    val markInput = readln().toDouble()

                    // Step 4 – Store either subclass object
                    // in a variable of type Student (polymorphism).
                    val theStudent: Student = if (type == "u") {
                        Undergraduate(id, name, course, markInput)
                    } else {
                        Masters(id, name, course, markInput)
                    }

                    // Step 4 – Add the student to the university.
                    university.enrolStudent(theStudent)
                    println("Student enrolled successfully.")

                } else {
                    println("Invalid student type. Please enter u or m.")
                }
            }

            "2" -> {
                // Step 5 – Search for a student by ID.
                print("Enter student ID: ")
                val id = readln()

                val foundStudent = university.findStudentById(id)

                if (foundStudent != null) {
                    // Step 7 – Calls the actual subclass's toString().
                    println(foundStudent)
                } else {
                    println("Student not found.")
                }
            }

            "3" -> {
                // Step 6 – Search for students by name.
                print("Enter student name: ")
                val name = readln()

                val results = university.findStudentsByName(name)

                if (results.isEmpty()) {
                    println("No students found.")
                } else {
                    for (foundStudent in results) {
                        // Step 7 – Calls the actual subclass's toString().
                        println(foundStudent)
                        println()
                    }
                }
            }

            "4" -> {
                println("Program finished.")
            }

            else -> {
                println("Invalid choice. Please enter 1, 2, 3 or 4.")
            }
        }
    }
}