Algoritmo sin_titulo
	
	Definir vector, frase, carac Como Caracter
	Definir i, posi Como Entero
	Dimension vector(20)
	
	Escribir "ingrese una frase"
	leer frase
	
	Para i<- 0 Hasta 19 Hacer
		vector(i) = Subcadena(frase,i,i)
		Escribir Sin Saltar vector(i)
	FinPara
	Escribir ""
	Escribir "ingrese un caracter"
	leer carac
	Escribir "escribir posicion"
	leer posi
	
	Para i<- 0 Hasta 19
		
		si i = posi
			Escribir Sin Saltar carac
		FinSi
		vector(i) = Subcadena(frase,i,i)
		Escribir Sin Saltar vector(i)
	FinPara
	Escribir ""
FinAlgoritmo