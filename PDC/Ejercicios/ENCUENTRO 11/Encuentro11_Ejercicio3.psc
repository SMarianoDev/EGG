Algoritmo tresdia11
	Definir usuario, contrasena, usuarioR, contrasenaR, opcioon Como Caracter
	Definir  login Como Logico
	Definir saldo,i, botellas, j, peso_botella, precio_botellas Como Entero
	Escribir "ingrese su usuario"
	Leer usuario
	usuarioR = "Albus_D"
	contrasenaR = "caramelosDeLimon"
	i=0
	login= Falso
	precio_botellas = 0
	Si usuario <> usuarioR Entonces
		Escribir "usuario ingresado es incorrecto"
		Mientras usuario <> usuarioR Hacer
			Escribir "ingrese el usuario nuevamente"
			Leer usuario
		FinMientras
	Finsi
	Escribir "usuario ingresado correctamente"
	Si usuario = usuarioR Entonces
		Escribir "ingrese contrasena"
		leer contrasena
		Mientras contrasena <> contrasenaR y i<2 Hacer
			Escribir "ingrese la contrasena nuevamente"
			Leer contrasena
			i= i+1
		FinMientras
		si contrasena <> contrasenaR y i = 2 Entonces //3 numeros de intentos
			Escribir " intentos agotados el programa no puede proceder"
		sino 
			Escribir "contrasena correcta"
			login = Verdadero
		Finsi
	FinSi
	Si login = Verdadero Entonces
		Repetir
			Escribir "A. Ingresar botellas"
			Escribir "B. Consultar saldo"
			Escribir "C. Salir"
			Leer opcioon
			Segun opcioon
				"A": Escribir "Cuantas botellas desea reciclar"
					Leer botellas
					Para j <- 1 Hasta botellas Hacer
						peso_botella = Aleatorio(100,3000)
						
						si peso_botella >= 100 y peso_botella <= 500
							precio_botellas = precio_botellas + 50
						FinSi
						si peso_botella > 500 y peso_botella <= 1500
							precio_botellas = precio_botellas + 125
						FinSi
						si peso_botella > 1500 
							precio_botellas = precio_botellas + 200
						FinSi
						
					FinPara
					Escribir precio_botellas
					
			FinSegun
		Mientras Que login = Falso
	FinSi
FinAlgoritmo