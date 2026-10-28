
abstract class Student(
    val id: String,
    val name: String,
    val course: String,
    markIn: Double
) {

    var mark = 0.0
        set(newMark) {
            if (newMark in 0.0..100.0) {
                field = newMark
            }
        }

    init {
        mark = markIn
    }

    abstract fun getGrade(): String

    fun didPass(): Boolean {
        return mark >= 40
    }

    // Step 3 – Superclass provides the common student details.
    override fun toString(): String {
        return "ID: $id Name: $name Course: $course Mark: $mark"
    }
}