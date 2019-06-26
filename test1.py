print(str("\nSuma de numeros pares entre 1 y n.\nPor favor ") , str( "ingrese un valor para n: "))
n = input()
suma = 0
for k in range(int(2), int(n)+1, int(2)):
	suma = suma + k
print(str("\nLa suma es ") , str( suma))