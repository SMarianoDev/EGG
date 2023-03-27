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
		
		si vector(posi) = " " Entonces
			
			si i = posi
				Escribir Sin Saltar carac
			SiNo
			vector(i) = Subcadena(frase,i,i)
			Escribir Sin Saltar vector(i)
			
		FinSi
		
		SiNo
			Escribir "no está vacio"
		FinSi
		
	FinPara
	Escribir ""
FinAlgoritmo