Algoritmo sin_titulo
	Definir altura Como Entero
	
	Repetir		
	
	Escribir "ingrese altura de escalera"
	leer altura
	
	escalera(altura)
	
Mientras Que altura <> 0

FinAlgoritmo

SubProceso escalera(altura)
	definir i Como Entero
	Definir conjunto Como Caracter
	
	i = 0
	conjunto = ""
	
	para i <- 1 Hasta altura
		
		si altura <> 0
			conjunto = Concatenar(conjunto,ConvertirATexto(i))
			Escribir conjunto
		SiNo
		FinSi
	
	FinPara
	
FinSubProceso
	