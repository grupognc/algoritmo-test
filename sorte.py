num_sorte = int(input("Escreva o número da sorte: "))

if num_sorte < 7:
    print("O número inserido é menor do que o número da sorte.")

elif num_sorte > 7:
    print("O número inserido é maior do que o número da sorte.")   

elif num_sorte == 7:
    print("Você acertou!")

elif num_sorte > 10:
    print("O número de sorte deve ser de 0 a 10.")
    