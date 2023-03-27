Algoritmo sin_titulo
	Definir vector,frase,carac Como caracter
	Definir i, posi Como entero
		
	Dimension vector(20)
	
	Escribir "ingrese una frase"
	leer frase
	
	para i <- 0 Hasta 19 Hacer
		vector(i) = Subcadena(frase,i,i)
		Escribir " posicion ", i ": ", vector(i)
	FinPara
	
	Escribir "ingrese un caracter cualquiera"
	leer carac
	Escribir "ingrese una posicion"
	leer posi
	
	si vector(posi) = " " Entonces
		
		para i <- 0 Hasta 19 Hacer
			si i <> posi Entonces
			vector(i) = Subcadena(frase,i,i)
			Escribir " posicion ", i ": ", vector(i)
		SiNo
			vector(posi) = carac
			Escribir " posicion ", i ": ", carac
		FinSi
		FinPara
	SiNo
		Escribir "El espacio no esta vacio"
	FinSi
	
FinAlgoritmo


	