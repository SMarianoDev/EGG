Algoritmo sin_titulo
	
	Definir i,vector, long, resultado Como entero
	Escribir "ingrese la longitud del vector"
	leer long
	Dimension vector(long)
	
	
	resultado = diferencia(vector,long)
	
	
FinAlgoritmo

Funcion resultado <- diferencia(vector,long)
	Definir resultado, numMax, numMin, i Como Entero
	numMax = 0
	numMin = 10
	para i <- 0 Hasta long-1
		vector(i) = Aleatorio(1,10)
		Escribir Sin Saltar vector(i)
		Escribir ""
		
		si vector(i) > numMax
			numMax = vector(i)
		FinSi
		si vector(i) < numMin
			numMin = vector(i)
		FinSi
	FinPara
	
	resultado = numMax - nummin
	Escribir "la diferencia entre el " , numMax " y " nummin " es de: ", resultado
	
FinFuncion
