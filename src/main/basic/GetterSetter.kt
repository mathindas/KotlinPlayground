fun main() {
    val note = Note("Notes")
    note.title = ""
    println(note.title)

    val upperCaseNote = UpperCaseNote("Notes")
    println(upperCaseNote.title)
}

class Note(title: String){
    var title: String = title
        get() = field
        set(value){
            if(value.isNotBlank()){
                field = value
            }
        }
}

class UpperCaseNote(val titleParam: String){
    val title : String
        get() = titleParam.uppercase()
}

