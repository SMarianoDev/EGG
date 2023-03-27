Algoritmo sin_titulo
	Definir opciones Como Caracter
	Definir valid como logico
	
	valid = Verdadero
	Repetir
		valid = menu(valid)
	Mientras Que valid = Verdadero
	
FinAlgoritmo
funcion valid <- menu(valid)
	Definir opciones Como caracter
	Definir long Como Entero
	opciones = ""
	Hacer
		Escribir "ingrese la opcion que desea ejecutar"
		Escribir "A - Llenar Vector A"
		Escribir "B - Llenar Vector B"
		Escribir "C - Llenar Vector C con la suma de los vectores A y B"
		Escribir "D - Llenar Vector C con la resta de los vectores B y A"
		Escribir "E - Mostrar"
		Escribir "F - Salir"
		leer opciones
		si Mayusculas(opciones) <> "F"
			Escribir "ingrese la longitud del vector"
			leer long
		Finsi
	Mientras Que opciones = ""

	Segun Mayusculas(opciones) Hacer
		
		"A":
			vectorA(long)
		"B":
			vectorB(long)
		"C":
			vectorC(long)
		"D":
			vectorD(long)
		"E":
			vectorE(long)
		"F":
			valid = Falso
	FinSegun
	
FinSubProceso

SubProceso vectorA(long)
	Definir i, vector Como real
	Dimension vector(long)
	para i <- 0 Hasta long-1 Hacer
		vector(i) = Aleatorio(-100,100)
//		Escribir "vector ", i " es ", vector(i)
	FinPara
FinSubProceso

SubProceso vectorB(long)
	Definir i, vector Como real
	Dimension vector(long)
	para i <- 0 Hasta long-1 Hacer
		vector(i) = Aleatorio(-100,100)
//		Escribir "vector ", i " es ", vector(i)
	FinPara
FinSubProceso

SubProceso vectorC(long)
	Definir i, vA, vB, vC Como Entero
	Dimension vA(long)
	Dimension vB(long)
	Dimension vC(long)
	
	para i <- 0 Hasta long-1 Hacer
		vA(i) = Aleatorio(-100,100)
		Escribir "vector ", i " es ", vA(i)
	FinPara
	para i <- 0 Hasta long-1 Hacer
		vB(i) = Aleatorio(-100,100)
		Escribir "vector ", i " es ", vB(i)
	FinPara
	para i <- 0 Hasta long-1 Hacer
		vC(i) = vA(i) + vB(i)
		Escribir "la suma de " vA(i) " + " vB(i) " = " vC(i)
	FinPara
FinSubProceso

SubProceso vectorD(long)
	Definir i, vA, vB, vC Como Entero
	Dimension vA(long)
	Dimension vB(long)
	Dimension vC(long)
	
	para i <- 0 Hasta long-1 Hacer
		vA(i) = Aleatorio(-100,100)
		Escribir "vector ", i " es ", vA(i)
	FinPara
	para i <- 0 Hasta long-1 Hacer
		vB(i) = Aleatorio(-100,100)
		Escribir "vector ", i " es ", vB(i)
	FinPara
	para i <- 0 Hasta long-1 Hacer
		vC(i) = vA(i) + vB(i)
		Escribir "la suma de " vA(i) " + " vB(i) " = " vC(i)
	FinPara
FinSubProceso

SubProceso vectorE(long)
	Definir i Como Entero
	Definir opc Como Caracter
	
	Escribir "Que vector desea ver? A, B o C?"
	leer opc
	
	segun Mayusculas(opc)
		"A":
			vectorA(long)
		"B":
			vectorB(long)
		"C":
			vectorC(long)
	FinSegun
FinSubProceso