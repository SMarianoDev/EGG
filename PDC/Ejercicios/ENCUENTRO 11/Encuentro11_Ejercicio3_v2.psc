Algoritmo sin_titulo
	
	Definir usuarioU, claveU, usuarioR, claveR, opciones, operacion Como Caracter
	definir login Como Logico
	Definir i, j, botellas, pesoDeBotella, precioDeBotella, saldo Como Entero
	
	usuarioR = "Albus_D"
	claveR = "caramelosDeLimon"
	
	i = 0
	login = Falso
	saldo = 0
	
	Repetir
	Escribir "ingrese el nombre de usuario"
	leer usuarioU
	si usuarioU <> usuarioR Entonces
		Escribir "usuario incorrecto"
	SiNo
		Escribir "ingrese contraseña"
		Leer claveU
		si claveU <> claveR Entonces
			mientras i < 2 y claveU <> claveR
				Escribir "contraseña incorrecta"
				leer claveU
				i = i + 1
			FinMientras
			Escribir "contraseña correcta"
			login = Verdadero
		SiNo
			Escribir "contraseña correcta"
			login = Verdadero
		FinSi
	FinSi
Mientras Que login <> Verdadero

Repetir
	Escribir ""
	Escribir "MENU"
	Escribir "A - Ingresar botellas"
	Escribir "B - Consultar saldo"
	Escribir "C - Salir"
	leer opciones
	
	segun Mayusculas(opciones) Hacer
		"A" :
			Escribir "Cuantas botellas desea ingresar"
			leer botellas
			i = 0
			precioDeBotella = 0
			para i <- 1 Hasta botellas
				pesoDeBotella = Aleatorio(100,3000)
				
				si pesoDeBotella <= 500
					precioDeBotella = precioDeBotella + 50
				SiNo
					si pesoDeBotella >= 501 y pesoDeBotella <= 1500
						precioDeBotella = precioDeBotella + 125
					SiNo
						si pesoDeBotella >= 1501
							precioDeBotella = precioDeBotella + 200
						FinSi
					FinSi
				FinSi
			FinPara
			
			Escribir "El precio total es de: $", precioDeBotella
			Escribir "Aceptar operacion? ingrese SI/NO"
			leer operacion
			si Minusculas(operacion) = "si"
				Escribir "Depositando: $", precioDeBotella
				saldo = saldo + precioDeBotella
				Escribir "apriete enter para continuar"
				Leer operacion
			SiNo
				Escribir "Devolviendo: ", botellas " botellas"
				Escribir "apriete enter para continuar"
				Leer operacion
			FinSi
		"B":
			Escribir "Su saldo es de: $", saldo
			Escribir "apriete enter para continuar"
			Leer operacion
		"C":
			login = Falso
	FinSegun
	
Mientras Que login = Verdadero


	
FinAlgoritmo
