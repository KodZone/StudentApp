// Masters.kt
// Subclass of Student with its own grading rules.

class Masters(
    id: String,
    name: String,
    course: String,
    mark: Double
) : Student(id, name, course, mark) {

    override fun studentType(): String {
        return "Masters"
    }

    // Masters pass mark is 50
    override fun getGrade(): String {
        return when {
            mark >= 70 -> "Distinction"
            mark >= 60 -> "Merit"
            mark >= 50 -> "Pass"
            else -> "Fail"
        }
    }
}
