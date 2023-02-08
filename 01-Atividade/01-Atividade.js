/*
    Descrição da atividade:

    Escreva um algoritmo que armazene o valor 10 em uma variável A e o valor 20 em uma variável B. A seguir (utilizando apenas atribuições entre variáveis) troque os seus conteúdos fazendo com que o valor que está em A passe para B e vice-versa. Ao final, escrever os valores que ficaram armazenados nas variáveis e exibi-los na tela.
*/

let valorDeA = 10;
let valorDeB = 20;

let substValores = valorDeA;
valorDeA = valorDeB;
valorDeB = substValores;

console.log(`O valor de A é: ${valorDeA}`);
console.log(`O valor de B é: ${valorDeB}`)