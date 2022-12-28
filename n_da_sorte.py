n = 0
while n != 7:
    n = int(input('Digite um número: '))
    if n < 7:
        print('menor que o número da sorte.')
    if n > 7 and n < 11:
        print('maior que o número da sorte.')
    if n > 10:
        print('O número da sorte deve ser entre 0 a 10.')
    if n == 7:
        print('Parabéns este é o número da sorte!')
