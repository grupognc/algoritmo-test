print("Olá, Digite um número da sorte:")
a = int(input())
 
if (a < 7):
   print("A entrada é menor do que o número de sorte.")
  
elif (a > 7 and a < 11):
   print("A entrada é maior do que o número de sorte.")
 
elif (a == 7):
   print("Você acertou!")
  
else:
   print("O número de sorte deve ser de 0 a 10.")

## fim do algoritmo