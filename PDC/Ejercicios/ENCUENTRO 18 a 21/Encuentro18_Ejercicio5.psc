Algoritmo sin_titulo
	Definir vector, i, long Como Entero
	Escribir "ingrese Longitud del vector"
	leer long 
	Dimension vector(long)
	
	para i <- 0 Hasta long-1
		Escribir "ingrese valor", i
		leer vector(i)
	FinPara
	
	resultado(vector,long)
FinAlgoritmo

SubProceso resultado(vector,long)
	Definir i,numMax Como Entero
	numMax = 0
	
	para i <- 0 Hasta long-1
		si vector(i) > numMax
			numMax = vector(i)
		FinSi
	FinPara
	Escribir "el numero mayor es: " , numMax
	FinFuncion
	