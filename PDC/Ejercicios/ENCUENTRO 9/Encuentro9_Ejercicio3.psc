Algoritmo sin_titulo
	
	Definir cantidadAlumnos,i, nota1, nota2, nota3 Como Entero
	Definir notaPrac, notaExp, notaParc Como real
	Definir promNotaExp, promNotaParc, promNotaPrac, promTotal Como Real
	Definir notaMax, nota, k, j Como Entero
	
	Escribir "ingrese la cantidad de alumnos"
	leer cantidadAlumnos
	
	notaMax = 0
	k = 0
	j = 0
	
	para i <- 1 Hasta cantidadAlumnos
		escribir "ALUMNO ", i " "
		
		notaPrac = Aleatorio(1,10)
		Escribir "Obtuvo un ", notaPrac " en PRACTICA INTEGRADORA"
		notaExp = Aleatorio(1,10)
		Escribir "Obtuvo un ", notaExp " en EXPOSICION"
		notaParc = Aleatorio(1,10)
		Escribir "Obtuvo un ", notaParc " en PARCIAL"
		
		promNotaPrac = notaPrac*0.35
		promNotaExp = notaExp*0.25
		promNotaParc = notaParc+0.4
		
		promTotal = promNotaExp + promNotaPrac + promNotaParc
		
		si promTotal > 6.5 Entonces
			Escribir "---------APROBADO"
		SiNo
			Escribir Sin Saltar "---------DESAPROBADO "
			Escribir "Su promedio fue de: ", promTotal
		FinSi
		
		si notaPrac > 8 Entonces
			k = k + 1
		FinSi
		
		si notaExp > notaMax Entonces
			notaMax = notaExp
		FinSi
		
		si notaParc >= 4 y notaParc <= 7.5 Entonces
			j = j + 1
		FinSi
		
	FinPara
	
	Escribir "Porcentaje de alumnos con INTEGRADOR mayor a 7.5: " , (k * 100) / cantidadAlumnos "%"
	Escribir "La mayor nota obtenida en las exposiciones :",notaMax
	Escribir "Total de estudiantes que obtuvieron en el Parcial entre 4.0 y 7.5 :" j
	
FinAlgoritmo
