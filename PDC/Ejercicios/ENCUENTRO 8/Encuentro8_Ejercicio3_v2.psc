Algoritmo sin_titulo
	
	Definir usuarioR, usuarioU, claveU, claveR, ingreso Como Entero
	
	usuarioR = 1024
	claveR = 4567
	ingreso = 0
	Hacer
		Escribir "ingrese usuario numerico"
		leer usuarioU
		Escribir "ingrese clave numerica"
		leer claveU
		
		Mientras claveU <> claveR y usuarioU <> usuarioR 
			Escribir "Datos erroneos"
			Escribir "ingrese usuario numerico"
			leer usuarioU
			Escribir "ingrese clave numerica"
			leer claveU
		FinMientras
		
		Mientras claveU = claveR y usuarioU = usuarioR y ingreso = 0
			Escribir "ingreso satisfactorio"
			ingreso = 1
		FinMientras
		
		
	Mientras Que usuarioU <> usuarioR y claveU <> claveR y ingreso = 0
	
FinAlgoritmo
