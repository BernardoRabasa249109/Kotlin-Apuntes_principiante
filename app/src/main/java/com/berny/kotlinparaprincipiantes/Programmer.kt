package com.berny.kotlinparaprincipiantes

class Programmer(val name: String,
                 var age: Int,
                 val languages: Array<Language>,
                 val friends: Array<Programmer>? = null) {


    //Enum classs

    enum class Language {
        KOTLIN,
        SWIFT,
        JAVA,
        JAVASCRIPT
    }

    fun code() {
        for (language in languages) {
            println("Estoy Programando en $language")
        }
    }

}