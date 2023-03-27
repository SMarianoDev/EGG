Algoritmo sin_titulo
	
	Definir num, i, numPar, sumaPar, numImp, sumaImp Como Entero
	
	i = 0
	numPar = 0
	sumaPar = 0
	numImp = 0
	sumaImp = 0
	
	Hacer
		
		Escribir "ingrese un numero"
		leer num
		i = i + 1
		
		Mientras num mod 2 = 0
			sumaPar = sumaPar+num
			numPar = numPar + 1
			num = -1
		FinMientras
		
		Mientras  num mod 2 = 1 
			sumaImp = sumaImp+num
			numImp = numImp + 1
			num = -1
		FinMientras
		
	Mientras Que i < 10
	Escribir "se ingresaron: ", i " numeros"
	Escribir "La cantidad de impares es de: ",numImp
	Escribir "La cantidad de pares es de: ", numPar
	Escribir "La media de impares es de: ", sumaImp/numImp
	Escribir "La media de pares es de: ", sumaPar/numPar
	
FinAlgoritmo
