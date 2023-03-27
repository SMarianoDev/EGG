Algoritmo claves
	
	definir clave Como Caracter
	Definir i Como Entero
	
	i = 0
	
	Hacer
		Escribir "ingrese clave" 
		leer clave
		i = i+1
	Mientras Que clave <> "eureka" y i < 3
	
	
	si clave = "eureka" Entonces
		Escribir "clave correcta"
		
	SiNo
		si i = 3
			Escribir "agotaste los intentos"
		FinSi
	FinSi
	
	
FinAlgoritmo
