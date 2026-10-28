// Exercise 2 Step 3 – Create a University class to manage students.
class University {

    // Private mutable list stores Undergraduate and Masters objects.
    private val students = mutableListOf<Student>()

    // Add a student to the list.
    fun enrolStudent(student: Student) {
        students.add(student)
    }

    // Return the matching student, or null if no student is found.
    fun findStudentById(id: String): Student? {
        for (student in students) {
            if (student.id == id) {
                return student
            }
        }

        return null
    }

    // Return all students whose names match, ignoring letter case.
    fun findStudentsByName(name: String): MutableList<Student> {
        val results = mutableListOf<Student>()

        for (student in students) {
            if (student.name.equals(name, ignoreCase = true)) {
                results.add(student)
            }
        }

        return results
    }
}