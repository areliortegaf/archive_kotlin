class Validador { 
	fun identifierValido(s: String): Boolean {
    var cont = 0;
    if(!s.isNullOrEmpty()){
        //Ya verificamos que no esta vacio
	    val primerCharacter: Char = s.get(0)
	        if(primerCharacter in 'a' .. 'z' || primerCharacter in 'A' .. 'Z' || primerCharacter == '_'){
	            //Separamos por letra
	            var cont = 0;
	            val list = s.toCharArray()
	            val tamano = s.length
	            for(x in 0 until tamano){
	                val primerCharacter2: Char = s.get(x)
	                //Aqui solo comparamos el caracter con letras numeros y underscore
	                if(primerCharacter2 in 'a' .. 'z' || primerCharacter2 in 'A' .. 'Z' || primerCharacter2 == '_' ||
	                  primerCharacter2.isDigit()){
	                    cont++
	                    if(cont == tamano){
	                        return true
	                    }
	                }
	            }
	        }
	  }
	    return false
	}

	fun main(args: Array<String>) {
	    println(identifierValido("nombre"))   // true
	    println(identifierValido("_nombre"))  // true
	    println(identifierValido("_12"))    // true
	    println(identifierValido(""))       // false
	    println(identifierValido("012"))    // false
	    println(identifierValido("no$"))    // false
	}

}