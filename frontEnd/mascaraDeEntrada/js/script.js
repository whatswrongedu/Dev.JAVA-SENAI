const cpfMask = document.querySelector('#cpf');
const telefoneMask = document.querySelector('#telefone');
const cepMask = document.querySelector('#cep');
const form = document.querySelector('#form');

const btn = () => {
    let nome = document.querySelector('#nome').value;
    let cpf = document.querySelector('#cpf').value;
    let telefone = document.querySelector('#telefone').value;
    let cep = document.querySelector('#cep').value;
    let result = `nome:${nome}.<br>
                    CPF:${cpf}<br>
                    telefone:${telefone}<br>
                    CEP:${cep}.`;
    document.querySelector('#result').innerHTML = result;
}

cpfMask.addEventListener('input', function () {
    this.value = this.value
        .replace(/\D/g, '')
        .replace(/(\d{3})(\d)/, '$1.$2')
        .replace(/(\d{3})(\d)/, '$1.$2')
        .replace(/(\d{3})(\d{1,2})$/, '$1-$2');
})