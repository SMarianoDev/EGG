Algoritmo sin_titulo
	Definir i, vector, deficiente, regulares, buenos, excelentes Como Entero
	Dimension vector(100)
	deficiente = 0
	regulares = 0
	buenos = 0
	excelentes = 0
	
	para i <- 0 Hasta 99
		vector(i) = Aleatorio(0,20)
		
		si vector(i) >= 0 y vector(i) <= 5
			deficiente = deficiente + 1
		FinSi
		si vector(i) >= 6 y vector(i) <= 10
			regulares = regulares + 1
		FinSi
		si vector(i) >= 11 y vector(i) <= 15
			buenos = buenos + 1
		FinSi
		si vector(i) >= 16 y vector(i) <= 20
			excelentes = excelentes + 1
		FinSi
		
	FinPara
	
	Escribir " los estudiantes con DEFICIENTE es de: " , deficiente
	Escribir " los estudiantes con REGULARES es de: " , regulares
	Escribir " los estudiantes con BUENOS es de: " , buenos
	Escribir " los estudiantes con EXCELENTES es de: " , excelentes
	
FinAlgoritmo
