package furhatos.app.ca_project.util

object Utilities {
    fun map(x: Double, in_min: Double, in_max: Double, out_min: Double, out_max: Double): Double {
        return (x - in_min) * (out_max - out_min) / (in_max - in_min) + out_min
    }
}