class Undergraduate(
    id: String,
    name: String,
    course: String,
    markIn: Double
) : Student(id, name, course, markIn) {

    // Override grading scheme for Undergraduate students
    override fun getGrade(): String {
        return when {
            mark >= 70 -> "First"
            mark >= 60 -> "2/1"
            mark >= 50 -> "2/2"
            mark >= 40 -> "Third"
            else -> "Fail"
        }
    }
}

