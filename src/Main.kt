// Main.kt - EXERCISE 1 STARTER
// Goal: store every student the user enters in a list, then display them all.
//
// Student, Undergraduate and Masters are already written (from Week 2).
// Complete the TODOs below. Run the program after each TODO.

fun main() {

    // TODO 1: Create a mutable list that will store Student objects.
    //         The list type must be Student, even though we will put
    //         Undergraduate and Masters objects into it. Why does that work?
    //         Hint: think about where this line must go - inside or outside the loop?

    val students = mutableListOf<Student>()

    while (true) {

        // Display prompt and read the student's ID
        print("Enter student ID (or quit to stop): ")
        val id = readln()

        // Stop the loop when the user types "quit"
        if (id == "quit") {
            break
        }

        print("Enter student name: ")
        val name = readln()

        print("Enter course: ")
        val course = readln()

        print("Enter mark: ")
        val mark = readln().toDouble()

        print("Is the student Undergraduate or Masters? (U/M): ")
        val type = readln().trim().uppercase()

        // TODO 2: Create the appropriate object.
        //         "U" -> an Undergraduate, "M" -> a Masters.
        //         Store it in a variable declared as type Student.
        //         Anything else: print "Invalid type - student not added."
        //         and skip to the next loop (hint: continue).
        //         Hint: Student is abstract - you cannot write Student(...)

        val student: Student = when (type) {
            "U" -> Undergraduate(id, name, course, mark)
            "M" -> Masters(id, name, course, mark)
            else -> {
                println("Invalid type - student not added.")
                continue
            }
        }

        // TODO 3: Immediately add the new object to the list.

        students.add(student)

        println("Student added.")
        println()
    }

    // TODO 4: Write a SECOND loop that goes through the list
    //         and prints each student with println(student).
    //         Question: which toString() gets called - and why?

    for (student in students) {
        println(student)
    }

    println("Program finished.")
}