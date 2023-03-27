Algoritmo sin_titulo
	
	Definir num, numMax, numMin, suma, i Como Entero
	Definir promedio Como Real
	
	suma = 0
	i = 0
	
	Hacer
		Escribir "ingrese numeros enteros"
		Escribir "al ingresar 0 terminara el programa"
		leer num
		
		si num <> 0
			suma = suma + num
			i = i + 1
			
			si i = 1
				numMax = num
				numMin = num
			FinSi
			
			SI num > numMax
				numMax = num
			FinSi
			
			SI num < numMin y num <> 0
				numMin = num
			FinSi
			
		Finsi
		
	Mientras Que num <> 0
	
	promedio = suma/(i - 1)
	Escribir "El promedio es de: ", promedio
	Escribir "El ", numMax " es el numero maximo"
	Escribir "El ", numMin " es el numero minimo"
	
FinAlgoritmo
