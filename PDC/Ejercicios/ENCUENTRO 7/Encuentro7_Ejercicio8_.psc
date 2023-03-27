Algoritmo sin_titulo
	
	Definir num,  i Como Entero
	Definir suma Como Real
	
	num = 0
	suma = 0.1
	i = 0
	
	Escribir "ingrese un numero entero positivo"
	leer num
	Mientras suma <> 0
		suma = trunc (num/10)
		i = i + 1
		
		mientras suma <> 0
			i = i + 1
			suma = trunc (suma/10)
			Escribir  suma
		FinMientras
	FinMientras
	
	Escribir "el numero es de: " , i , " digitos."
	
FinAlgoritmo
