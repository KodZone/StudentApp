
class Student(
    val id: String,
    val name: String,
    val course: String,
    val mark: Double
) {

    override fun toString(): String {
        return "Name: $name Course: $course Mark: $mark"
    }
}