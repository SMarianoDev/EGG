Algoritmo sin_titulo
	
	Definir palabras, frase Como Caracter
	palabras = ""
	frase = ""
	
	Mientras  palabras <> " ."
		Escribir "ingrese varias palabras para formar una frase"
		leer palabras
		
		palabras = Concatenar(" ", palabras)
		frase = Concatenar(frase,palabras)
	FinMientras
	
	codificacion(frase)
	
FinAlgoritmo

SubProceso codificacion(frase)
	Definir i Como Entero
	
	Para i <- 0 Hasta Longitud(frase) 
		
		Segun Minusculas(Subcadena(frase,i,i))
			"a":
				Escribir Sin Saltar "@"
			"e":
				Escribir Sin Saltar "#"
			"i":
				Escribir Sin Saltar "$"
			"o":
				Escribir Sin Saltar "%"
			"u":
				Escribir Sin Saltar "*"
			De Otro Modo:
				Escribir Sin Saltar Subcadena(frase,i,i)
		FinSegun
		
	FinPara
	
FinSubProceso
	