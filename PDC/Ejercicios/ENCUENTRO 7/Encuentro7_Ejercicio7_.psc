Algoritmo sin_titulo
	
	Definir nombre Como Caracter
	Definir notas, notaPrac, notaProb, notaTeo como enteros
	Definir porceNotaPrac, porceNotaProb, porceNotaTeo, promTotal como reales
	Escribir "ingrese su nombre"
	leer nombre
	
	Mientras nombre <> ""
		
		Escribir "ingrese su NOTA PRACTICA"
		leer notaPrac
		
		Mientras notaPrac < 0 o notaPrac > 10
			Escribir "la NOTA PRACTICA no es valida, vuelva a ingresarla"
			leer notaPrac
		FinMientras
		porceNotaPrac = notaPrac*0.1
		
		Escribir "ingrese su NOTA DE PROBLEMAS"
		leer notaProb
		
		Mientras notaProb < 0 o notaProb > 10
			Escribir "la NOTA DE PROBLEMAS no es valida, vuelva a ingresarla"
			leer notaProb
		FinMientras
		porceNotaProb = notaProb*0.5
		
		Escribir "ingrese su NOTA TEORICA"
		leer notaTeo
		
		Mientras notaTeo < 0 o notaTeo > 10
			Escribir "la NOTA TEORICA no es valida, vuelva a ingresarla"
			leer notaTeo
		FinMientras
		porceNotaTeo = notaTeo*0.4
		
		Escribir "El valor de las notas practicas es de: ", porceNotaPrac
		Escribir "El valor de las notas de problemas es de: ", porceNotaProb
		Escribir "El valor de las notas teoricas es de: ", porceNotaTeo
		
		promTotal = porceNotaPrac + porceNotaProb + porceNotaTeo
		Escribir "Nota final: " , promTotal
		
		Escribir "Ingrese el nombre de otro alumno"
		leer nombre
		
	FinMientras
	
	Escribir "TERMINADO"
	
FinAlgoritmo
