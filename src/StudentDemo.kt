fun main() {

    // Exercise 2 Step 4 – Create one University object to store and manage students.
    val university = University()

    // Exercise 2 Step 6 – Create a String variable for the user's menu choice.
    var choice: String = ""

    // Exercise 2 Step 6 – Repeat the menu until the user chooses "4".
    while (choice != "4") {

        // Exercise 2 Step 5 – Display the menu.
        println()
        println("University Menu")
        println("---------------")
        println("1. Add a student")
        println("2. Search for student by ID")
        println("3. Search for students by name")
        println("4. Quit")
        print("Enter your choice: ")

        choice = readln()

        // Exercise 2 Step 7 – Handle the selected menu option.
        when (choice) {

            "1" -> {
                // Option 1 – Read the student's details.
                print("Enter student ID: ")
                val id = readln()

                print("Enter student name: ")
                val name = readln()

                print("Enter course: ")
                val course = readln()

                print("Enter mark (0-100): ")
                val markInput = readln().toDouble()

                print("Enter student type (u = Undergraduate, m = Masters): ")
                val type = readln().lowercase()

                // Create the appropriate student object.
                val student: Student = when (type) {
                    "u" -> Undergraduate(id, name, course, markInput)
                    "m" -> Masters(id, name, course, markInput)
                    else -> {
                        println("Invalid type. Defaulting to Undergraduate.")
                        Undergraduate(id, name, course, markInput)
                    }
                }

                // Enrol the student through the University object.
                university.enrolStudent(student)
                println("Student enrolled successfully.")
            }

            "2" -> {
                // Option 2 – Search for a student by ID.
                print("Enter student ID: ")
                val id = readln()

                val student = university.findStudentById(id)

                // Check whether a matching student was found.
                if (student != null) {
                    println(student)
                    println("Grade: ${student.getGrade()}")
                    println("Passed: ${student.didPass()}")
                } else {
                    println("No student found with this ID.")
                }
            }

            "3" -> {
                // Option 3 – Search for all students with the given name.
                print("Enter student name: ")
                val name = readln()

                val results = university.findStudentsByName(name)

                if (results.isEmpty()) {
                    println("No students found with this name.")
                } else {
                    // Display every matching student.
                    for (student in results) {
                        println(student)
                        println("Grade: ${student.getGrade()}")
                        println("Passed: ${student.didPass()}")
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