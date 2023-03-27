Algoritmo notas
	
	Definir nota1, nota2, nota3 Como Entero
	Definir nota1Logico,nota2Logico, nota3Logico como logico
	Definir notatotal Como Logico
	Escribir "ingrese 3 notas"
	leer nota1, nota2, nota3
	
	si nota1 >= 1 y nota1 <= 10 Entonces
		nota1Logico = Verdadero
	SiNo
		nota1Logico = Falso
	FinSi
	Escribir nota1Logico
	
	si nota2 >= 1 y nota2 <= 10 Entonces
		nota2Logico = Verdadero
	SiNo
		nota2Logico = Falso
	FinSi
	Escribir nota2Logico
	
	si nota3 >= 1 y nota3 <= 10 Entonces
		nota3Logico = Verdadero
	SiNo
		nota3Logico = Falso
	FinSi
	Escribir nota3Logico
	
	notatotal = nota1Logico y nota2Logico y nota3Logico
	
	si notatotal Entonces
		Escribir "CORRECTO"
	SiNo
		Escribir "FALSO"
	FinSi
	
FinAlgoritmo
