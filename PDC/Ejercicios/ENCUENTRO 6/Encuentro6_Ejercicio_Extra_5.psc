Algoritmo bisiesto
	
	Definir ano Como Entero
	Escribir "indique un a�o"
	leer ano 
	
	si ano mod 4 = 0  Entonces
		si ano mod 100 <> 0	Entonces
			Escribir "El a�o es bisiesto"
		SiNo
			si ano mod 100 = 0 y ano mod 400 = 0 Entonces
				Escribir "El a�o es bisiesto"
			SiNo
				Escribir "El a�o no es bisiesto"
			FinSi
		FinSi
	SiNo
		Escribir "El a�o no es bisiesto"
	FinSi
FinAlgoritmo
