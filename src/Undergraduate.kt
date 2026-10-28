// Undergraduate.kt
// Subclass of Student. The ": Student(...)" part means "inherits from Student"
// and passes the four values up to the Student constructor.

class Undergraduate(
    id: String,
    name: String,
    course: String,
    mark: Double
) : Student(id, name, course, mark) {

    override fun studentType(): String {
        return "Undergraduate"
    }

    // Undergraduate pass mark is 40
    override fun getGrade(): String {
        return when {
            mark >= 70 -> "Distinction"
            mark >= 60 -> "Merit"
            mark >= 40 -> "Pass"
            else -> "Fail"
        }
    }
}
