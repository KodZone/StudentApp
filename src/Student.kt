
abstract class Student(val id: String, val name: String, val course: String,
    markIn: Double) {
    /* markIn is an initial mark value passed to the constructor
     * to initialise the student's mark */

    var mark = 0.0
        set(newMark) {
            if (newMark in 0.0..100.0) {field = newMark}
        }
    init { mark = markIn } // This will  trigger the custom setter.

    // Abstract method – must be overridden in subclasses
    abstract fun getGrade(): String

    // Task C: didPass() method
    fun didPass(): Boolean {
        return mark >= 40
    }

    override fun toString(): String {
        return "Name: $name Course: $course Mark: $mark"
    }
}