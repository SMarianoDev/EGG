Algoritmo sin_titulo
	
	Definir i, num, multiplo2, multiplo3 como entero
	
	multiplo2 = 0
	multiplo3 = 0
	
	para i <- 1 Hasta  100
		
		si i mod 2 = 0 Entonces
			multiplo2 = multiplo2 + 1
		FinSi
		
		si i mod 3 = 0 
			multiplo3 = multiplo3 + 1
		FinSi
		
	FinPara
	Escribir " la cantidad de multiplos de 2 es: ", multiplo2
	Escribir " la cantidad de multiplos de 3 es: ",multiplo3
FinAlgoritmo
