Algoritmo sin_titulo
	
	Definir frase, letra, letraFrase Como Caracter
	Definir cantidad, i, suma Como Entero
	Definir pepito, verificacion1 Como Logico
	Escribir "ingrese una frase"
	Leer frase
	Escribir "ingrese una letra para contar"
	leer letra
	
	cantidad = Longitud(frase)
	suma = 0
	
	para i <- 0 Hasta cantidad
		
		letraFrase = Subcadena(frase,i,i)
		pepito = contador(letraFrase,letra)
		
		si pepito = Verdadero
			suma = suma + 1
		FinSi
	FinPara
	
	Escribir "la cantidad de letras ..." Mayusculas(letra) "... es de: " , suma
	
FinAlgoritmo

Funcion verificacion <- contador (letraFrase por valor, letra Por Valor)
	Definir verificacion Como Logico
	si letraFrase = letra
		verificacion = Verdadero
	SiNo
		verificacion = Falso
	FinSi
	
FinFuncion
	