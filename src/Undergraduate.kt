class Undergraduate(
    id: String,
    name: String,
    course: String,
    markIn: Double
) : Student(id, name, course, markIn) {

    override fun getGrade(): String {
        return when {
            mark >= 70 -> "First"
            mark >= 60 -> "2/1"
            mark >= 50 -> "2/2"
            mark >= 40 -> "Third"
            else -> "Fail"
        }
    }

    // Step 3 – Override toString() to show Undergraduate details.
    override fun toString(): String {
        return "Undergraduate Student\n" +
                super.toString() +
                "\nGrade: ${getGrade()} Passed: ${didPass()}"
    }
}