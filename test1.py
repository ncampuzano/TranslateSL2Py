MAX_ALUMNOS = 20
notas = [0]*MAX_ALUMNOS
suma_notas = 0
prom = 0
cnb = 0
k = 0

for k in range(int(1), int(MAX_ALUMNOS)):
	print(str("\nIngrese nota para alumno numero ") , str( k) , str( ":"))
	notas[k] = input()
	suma_notas = int(suma_notas) + int(notas[k])
prom = suma_notas / MAX_ALUMNOS
cnb = 0
for k in range(int(1), int(MAX_ALUMNOS)):
	if int(notas[k]) < prom:
		cnb = int(cnb) + int(1)
print(str("\nExisten ") , str( cnb) , str( " alumnos con notas inferiores") , str( " al promedio del curso, que es ") , str( prom))