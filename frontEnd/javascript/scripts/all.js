// variável do formulário
const form = document.querySelector('form');

// arrow function
const msg = () => {
    let nome = document.querySelector('#nome').value;
    let idade = document.querySelector('#idade').value;
}

// verificar idade
const msg = () => {
    if (idade >= 18) {
        alert('$(nome) é maior de idade.');
    } else {
        alert('$(nome) é menor de idade.');
    }
}

// evento
form.addEventListener('submit', function(event) {
    event.preventDefault();
}

)