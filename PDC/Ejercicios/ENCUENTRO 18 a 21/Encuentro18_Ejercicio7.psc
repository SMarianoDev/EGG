Algoritmo sin_titulo
	Definir long, v1, v2 Como Entero
	Definir retorno Como Logico
	
	retorno = Falso
	Escribir "ingrese el tamaño del vector"
	leer long
	
	Dimension v1(long),v2(long)
	
	vector1(long,v1)
	vector2(long,v2)
	
	retorno = iguales(v1, v2, long)
	Escribir Sin Saltar "los vectores son iguales? : "
	Escribir retorno
	
FinAlgoritmo

SubProceso vector1(long,v1)
	Definir i Como Entero
	para i<- 0 Hasta long-1
		v1(i) = Aleatorio(1,10)
		Escribir Sin Saltar v1(i)
	FinPara
	Escribir ""
FinSubProceso

SubProceso vector2(long,v2)
	Definir i Como Entero
	Definir valid Como Logico
	valid = Falso
	para i<- 0 Hasta long-1
		v2(i) = Aleatorio(1,10)
		Escribir Sin Saltar v2(i)
	FinPara
	Escribir ""
FinSubProceso

Funcion retorno <- iguales(v1 Por Referencia, v2 Por Referencia,long Por Referencia)
	Definir retorno como logico
	Definir  i,vec1,vec2 Como Entero
	
	retorno = Falso
	vec1 = v1(long-1)
	vec2 = v2(long-1)
	
	si vec1 = vec2
		retorno = Verdadero
	FinSi
	
	FinFuncion
	