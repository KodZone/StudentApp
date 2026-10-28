class Masters(
    id: String,
    name: String,
    course: String,
    markIn: Double
) : Student(id, name, course, markIn) {

    override fun getGrade(): String {
        return when {
            mark >= 70 -> "Distinction"
            mark >= 60 -> "Merit"
            mark >= 40 -> "Pass"
            else -> "Fail"
        }
    }

    // Step 3 – Override toString() to show Masters details.
    override fun toString(): String {
        return "Masters Student\n" +
                super.toString() +
                "\nGrade: ${getGrade()} Passed: ${didPass()}"
    }
}

