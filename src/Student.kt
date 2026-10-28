// Student.kt
// Abstract superclass - you cannot create a plain Student object.
// Every real student is either an Undergraduate or a Masters student.

abstract class Student(
    val id: String,
    val name: String,
    val course: String,
    val mark: Double
) {

    // Abstract functions: no body here, every subclass MUST provide its own version
    abstract fun studentType(): String

    abstract fun getGrade(): String

    override fun toString(): String {
        return "${studentType()} - ID: $id Name: $name Course: $course Mark: $mark Grade: ${getGrade()}"
    }
}