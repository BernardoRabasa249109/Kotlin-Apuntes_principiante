package com.berny.kotlinparaprincipiantes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Leccion 1
        //variablesYConstantes()
        //Leccion 2
        //tipoDeDatos()
        //Leccion 3
        //sentenciaIf()
        //Leccion 4
        //sentenciaWhen()
        //Leccion 5
        //arrays()
        //Leccion 6
        //maps()
        //Leccion 7
        //loops()
        //Leccion 8
        //nullSafety()

        //Leccion 9
        //funciones()

        //Leccion 10
        classes()


    }
    /*
    Aqui hablaremos de variables (var) y constantes (val)
     */

    private fun variablesYConstantes(){

        //variables
        var myFistVariable = "Hola Bernardo"
        var myFirstNumber = 1

        println(myFistVariable)

        myFistVariable = "Bienvenidos a Kotlin"
        println(myFistVariable)

        // No posemos asignar un tipo Int a un tipo String cadena de texto
        // mymyFistVariable = 1

        var mySecondVariable = "Aprendiendo el arte de programar"

        println(mySecondVariable)

        mySecondVariable = myFistVariable

        println(mySecondVariable)

        myFistVariable = "Esto es un arte"
        println(myFistVariable)

        //constantes (val)

        val myFirstConstant = "Te ha gustado el tutorial?"

        println(myFirstConstant)

        //Una constante no puede modificar su valor

        val mySecondConstant = myFistVariable
        println(mySecondConstant)


    }
    //Data Types
    private fun tipoDeDatos(){

        val myString = "Bernardo"
        val myStringDos = "Flores"
        val myStringTres = "Rabasa"

        val myStringCuatro = myString + " " + myStringDos + " " + myStringTres
        println(myStringCuatro)

        // Enteros (Byte, short, Int, Long)

        val myInt = 1
        val myInt2 = 2
        val myInt3 = myInt + myInt2
        println(myInt3)

        //Decimales Float duoble

        val myFloat = 1.5f
        val myDouble = 1.5
        val myDouble2 = 3.3
        val myDouble3 = 1
        val myDouble4 = myDouble + myDouble2 + myDouble3
        println(myDouble4)

        //Boolean Bool

        val myBool = true
        val myBool2 = false
        println(myBool == myBool2)
        println(myBool && myBool2)
    }

    /*
    Aqui hablaremos de sentencia if
     */

    //operadores condicionales
    // > mayor que
    // < menor que
    // >= mayor o igual que ( > = )
    // <= menor o igual que ( > = )
    // == igualdad          ( = = )
    // != desigualdad       ( ! = )

    //Operadores logicos
    // && operador "y"
    // || operador "o"
    // ! operador "no"

    private fun sentenciaIf () {
        val myNumber = 71

        if (!(myNumber <= 10 && myNumber > 5) || myNumber == 50) {
            println("$myNumber es menor o igual que 10 y mayor que 5 o es igual a 50")


        } else if (myNumber == 60) {
            println("$myNumber es igual a 60")

        } else if (myNumber != 70) {
            println("$myNumber es igual a 70")

        } else {
            println("$myNumber es mayor que 10 o menor o igual que 5 y no es igual a 50")
        }

    }

    /*
    Aqui hablaremos de sentencia when
     */
    private fun sentenciaWhen(){
        //when con string

        val country = "Mexico"
        when (country) {
            "Mexico", "España", "Colombia", "Argentina" -> {
                println("El idioma es español")
            } "EEUU" -> {
                println("El idioma es Ingles")
            }"Francia" -> {
                println("El idioma es Frances")
            } else -> {
                println("No conocemos el idioma")
            }
        }

        //When con Int
        val age = 10

        when (age) {
              in 0..2 -> {
                println("Eres in bebe")
            } in 3..10 -> {
                println("Eres un niño")
            } in 11..17 -> {
            println("Eres un adolescente")
            }in 18..69 -> {
            println("Eres un adulto")
            } in 70..99 -> {
            println("Eres un niño")
            }else -> {
                println("No estas vivo")
            }
        }
    }
    /*
     Aqui hablaremos de arrays o arreglos
    */

    fun arrays () {
        val name = "Bernardo"
        val surname = "Rabasa"
        val company = "Lego"
        val age = "31"

        //creacion de array

        val myArray = arrayListOf<String>()

        //Añadir datos de uno en uno

        myArray.add(name)
        myArray.add(surname)
        myArray.add(company)
        myArray.add(age)

        println(myArray)

        //Añadir un conjunto de datos

        myArray.addAll(listOf("Hola", "Aprendiendo a programar"))

        println(myArray)

        //Accediendo a Datos del Array
        val myCompany = myArray[2]
        println(myCompany)

        //Modificando datos del Array

        myArray[5] = "Programar es un arte"

        //Eliminar Datos

        myArray.removeAt(4)
        println(myArray)

        //Recorrer datos

        myArray.forEach{ dato ->
            println(dato)
        }

        //otras operaciones

        println(myArray.count())
        myArray.clear()
        println(myArray.count())

        myArray.first()
        myArray.last()
        myArray.sort()
    }
    /*
     Aqui hablaremos de mapas o diccionarios
    */

    //sintaxis

    fun maps(){
        var myMap: MutableMap<String, Int> = mutableMapOf()
        println(myMap)

        //añadir elementos

        myMap = mutableMapOf("Bernardo" to 31, "Paulina" to 44, "Juan" to 33)
        println(myMap)

        // Añadir un solo valor
        myMap["Ana"] = 7
        myMap.put("Ricardo", 8)

        println(myMap)

        //Acceso a un dato

        println(myMap["Bernardo"])

        //Actualizar un dato

        myMap.put("Bernardo", 88)
        println(myMap)

        myMap.put("Enrrique", 88)
        println(myMap)

        //Eliminar datos

        myMap.remove("Bernardo")
        println(myMap)

    }

    /*
     Aqui hablaremos de mapas o diccionarios
    */

    private fun loops(){

        //Bucles
        val myArray = listOf<String>("Hola", "Aprendiendo a programar","Pepe")
        val myMap = mutableMapOf<String, Int>("Bernardo" to 31, "Paulina" to 44, "Juan" to 33)

        //For (para)

        for (myString in myArray){
            println(myString)
        }

        for (myElement in myMap) {
            println("${myElement.key}-${myElement.value}")
        }

        for (x in 0..10){
            println(x)
        }

        for (x in 0 until 10){
            println(x)
        }

        for (x in 0..10 step 2){
            println(x)
        }

        for (x in 10 downTo 0 step 2){
            println(x)
        }

        val myNumericArray = (0..20)
        for (myNum in myNumericArray) {
            println(myNum)
        }

        //while (mientras)

        var x = 0

        while (x < 10) {
            println(x)
            x += 2
        }

    }

    /*
     Aqui hablaremos de null safety
    */

    fun nullSafety(){
        var myString = "Bernardo"
        //myString = null esto daria un error de compilacion
        println(myString)

        //variable null safety

        var mySafetyString: String? = "Bernardo null safety"
        mySafetyString = null
        println(mySafetyString)

        mySafetyString = "HOLA BER"
        //println(mySafetyString) ANTES ASI SE COMPRBABA SI ERAN NULAS CON UN IF

        /*if (mySafetyString != null){
            println(mySafetyString!!)
        }else {
            println(mySafetyString)
        }*/

        //Safe call
        println(mySafetyString?.length)

        mySafetyString?.let {
            println(it)
        } ?: run {
            println(mySafetyString)
        }
    }

    /*
     Aqui hablaremos de funciones
    */

    fun funciones(){

        sayHellow()
        sayHellow()
        sayHellow()

        sayMyName("Bernardo")
        sayMyName("Roberto")
        sayMyName("Rafael")

        sayMyNameAndAge("Bernardo", 31)
        sayMyNameAndAge("Roberto", 23)
        sayMyNameAndAge("Rafael", 42)

        val sumResult = sumTowNumbers(40, 50)
        println(sumResult)

        println(sumTowNumbers(40, 45))

        println(sumTowNumbers(10, sumTowNumbers(5, 5)))
    }
    // Funcion simple
    fun sayHellow(){
        println("Hola!")
    }

    //Funciones con parametro de entrada
    fun sayMyName(name: String){
        println("Hola mi nombre es $name")
    }
    fun sayMyNameAndAge(name: String, age: Int){
        println("Hola mi nombre es $name y mi edad es $age")
    }

    //Funciones con un valor de retorno
    fun sumTowNumbers(firstNumber: Int, secondNumber: Int) : Int {
        val sum = firstNumber + secondNumber
        return sum

    }

    /*
     Aqui hablaremos de clases
    */

    fun classes(){
        val bernardo = Programmer("Bernardo", 31, arrayOf(Programmer.Language.KOTLIN, Programmer.Language.SWIFT))
        println(bernardo.name)

        bernardo.age = 40
        bernardo.code()

        val paulina = Programmer("Paulina", 28, arrayOf(Programmer.Language.JAVASCRIPT, Programmer.Language.JAVA), arrayOf(bernardo))
        paulina.code()

        println("${paulina.friends?.first()?.name} es amigo de ${paulina.name}")
    }


}

