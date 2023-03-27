Algoritmo ejercicio_siete_dia8
	Definir num, numrandom Como Entero
	numrandom = Aleatorio (1 , 10)
	Escribir numrandom
	Escribir "ingrese el numero secreto"
	Leer num
	Hacer
		si num > numrandom Entonces
			Escribir "el numero ingresado es mayor que el numero secreto"
			leer num
		FinSi
		si num < numrandom Entonces
			Escribir "el numero ingresado es menor que el numero secreto"
			leer num
		FinSi
		
	Mientras Que num <> numrandom
	si num=numrandom Entonces
		Escribir "felicitaciones"
	FinSi
	
	
FinAlgoritmo