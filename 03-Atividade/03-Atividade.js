const inputNumDaSorte = document.querySelector('.input-numero-sorte');
const btnEnviar = document.querySelector('.btn-enviar');
const mensagem = document.querySelector('.mensagem')

/*Código que escuta os eventos*/
btnEnviar.addEventListener('click', function() {
    /*Verificação do input*/
    if(!inputNumDaSorte.value) return;
    /*Leva o valor para função*/
    resultadoNumero(inputNumDaSorte.value);
})

inputNumDaSorte.addEventListener('keypress', function(e) {
    /*Evento de tecla pressionada utilizada para enviar o valor do input com o (13 = Enter))*/
    if(e.keyCode === 13) {
        /*Verificação do input*/
        if(!inputNumDaSorte.value) return;
        /*Leva o valor para função*/
        resultadoNumero(inputNumDaSorte.value);
    }
});

/*Faz a verificação do valor recebido e aplica a mensagem no html com estilização*/
function resultadoNumero(numeroInput) {
    if(numeroInput < 7) {
        const p = criarMensagem();
        p.innerHTML = `<b>A entrada ${numeroInput} é menor que o número da sorte</b>`;
        mensagem.appendChild(p).style.color="Red";
        limpaInput();
    } else if(numeroInput > 7 && numeroInput < 11) {
        const p = criarMensagem();
        p.innerHTML = `<b>A entrada ${numeroInput} é maior do que o número da sorte</b>`;
        mensagem.appendChild(p).style.color="orange";
        limpaInput();
    } else if (numeroInput > 10){
        const p = criarMensagem();
        p.innerHTML = `<b>O número da sorte deve ser entre 0 a 10</b>`;
        mensagem.appendChild(p).style.color="white";
        limpaInput();
    } else if (numeroInput == 7) {
        const p = criarMensagem();
        p.innerHTML = `<b>Você ACERTOU! O número da sorte é:</b> ${numeroInput}`;
        mensagem.appendChild(p).style.color="green";
        limpaInput();
    }
}

/*Cria o elemento P no html*/
function criarMensagem() {
    const p = document.createElement('p');
    return p;
}

/*Limpa Input*/
function limpaInput() {
    inputNumDaSorte.value ="";
    inputNumDaSorte.focus();
}

