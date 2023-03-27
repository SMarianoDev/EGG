Algoritmo sin_titulo
	
	Definir usuario, clave Como Caracter
	
	usuario = "usuario1"
	clave = "asdasd"
	
	Escribir datos(usuario,clave)
	
FinAlgoritmo

Funcion login <- datos (usuario Por Valor , clave Por Valor)
	Definir login Como Logico
	Definir  usuarioU, claveU Como Caracter
	Definir contador Como Entero
	contador = 0
	
	usuarioU = ""
	claveU = ""
	
	Mientras usuarioU <> usuario 
		Escribir "ingrese su usuario"
		leer usuarioU
		Mientras usuario = usuarioU y clave <> claveU y contador < 3
			Escribir "ingrese su clave"
			leer claveU
			contador = contador + 1
			si clave = claveU
				login = Verdadero
			FinSi
		FinMientras
		
	FinMientras

FinFuncion

