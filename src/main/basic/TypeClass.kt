fun main() {
    val student = Stu("Valdo")
    val student2 = S("Rendy")
    println(student.firstName)
    println(student2.firstName)
}

typealias Stu = Student
typealias S = Stu

class Student(firstNameParam: String){
    var firstName : String = firstNameParam
}
