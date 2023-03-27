Algoritmo sin_titulo
	
	Definir tornillosDef, tornillosSinDef Como Entero
	Definir logicoDefect, logicoSinDef Como Logico
	tornillosDef = azar(300)
	Escribir tornillosDef
	
	tornillosSinDef = azar(25000)
	Escribir tornillosSinDef
	
	logicoDefect = tornillosDef < 200
	logicoSinDef = tornillosSinDef >= 10000
	
	Escribir logicoDefect
	Escribir logicoSinDef
	
	si logicoDefect = Falso y logicoSinDef = Falso Entonces
		Escribir "El operario es de GRADO 5"
	SiNo
		si logicoDefect = Verdadero y logicoSinDef = Falso Entonces
			Escribir "El operario es de GRADO 6"
		SiNo
			si logicoDefect = Falso y logicoSinDef = Verdadero Entonces
				Escribir "El operario es de GRADO 7"
			sino
				si logicoDefect = Verdadero y logicoSinDef = Verdadero Entonces
					Escribir "El operario es de GRADO 8"
				FinSi
			FinSi
		FinSi
	FinSi
	
	
FinAlgoritmo
