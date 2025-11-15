// Create a Gender dropdown that shows after losing focus on full name input field [10 points]
// Create a new input field named Confirm Password that shows after losing focus on the password field [10 points]
// Validate the Full Name field to not be empty [10 points]
// Validate the Email field to have correct email entry [10 points]
// Disable the Submit button as long as there are invalid inputs and the two passwords are not match [20 points]
// Display the success message upon completion of all the inputs and submit button is pressed [10 points]
// Display in console an object created from all the inputs [30 points]

const nameInput = document.getElementById('nameinput');
const genderContainer = document.getElementById('dropdown-container');

nameInput.addEventListener("blur", function(e) {

    if (e.target.value.trim() === "") return;

    if (document.getElementById('myDropdown')) return;

    const selectElement = document.createElement('select');
    selectElement.id = 'myDropdown'; 
    selectElement.name = 'myDropdown';
    selectElement.setAttribute('required', true); 

    const optionsData = [
        { value: '', text: 'Gender', placeholder: true },
        { value: 'male', text: 'Male' },
        { value: 'female', text: 'Female' },
        { value: 'other', text: 'Other' },
        { value: 'rathernotdisclose', text: 'Rather Not Disclose' }
    ];

    optionsData.forEach(option => {
        const optionElement = document.createElement('option');
        optionElement.value = option.value;
        optionElement.textContent = option.text;

        if (option.placeholder) {
            optionElement.disabled = true; 
            optionElement.selected = true;  
            optionElement.hidden = true;
        }

        selectElement.appendChild(optionElement);
    });

    genderContainer.appendChild(selectElement);

});

const passwordInput = document.getElementById('passwordinput');
const passwordContainer = document.getElementById('password-container');

passwordInput.addEventListener("blur", function(e) {

    if (e.target.value.trim() === "") return;

    if (document.getElementById('confirmPassword')) return;

    const confirmInput = document.createElement('input');
    confirmInput.type = 'password';
    confirmInput.id = 'confirmPassword';
    confirmInput.name = 'confirmPassword';
    confirmInput.placeholder = 'Confirm Password';
    confirmInput.required = true;

    passwordContainer.appendChild(confirmInput);

});

//ADDITIONAL ERROR LABEL FOR PASSWORD PO HEHE

document.addEventListener('input', () => {
    const confirmInput = document.getElementById('confirmPassword');
    if (!confirmInput) return;

    const oldError = document.getElementById('confirm-error');
    if (oldError) oldError.remove();

    if (confirmInput.value !== passwordInput.value) {
        const errorLabel = document.createElement('label');
        errorLabel.id = 'confirm-error';
        errorLabel.style.color = 'red';
        errorLabel.textContent = 'Passwords do not match';

        passwordContainer.appendChild(errorLabel);
    }

    checkFormValidity();
});


const fullNameContainer = nameInput.parentElement;
 nameInput.addEventListener('input', () => {
    const oldError = document.getElementById('name-error');
    if (oldError) oldError.remove();

    if  (nameInput.value.trim() === '') {
        const errorLabel = document.createElement('label');
        errorLabel.id = 'name-error';
        errorLabel.style.color = 'red';
        errorLabel.textContent = 'Full Name cannot be empty';
        fullNameContainer.appendChild(errorLabel);
    }
});

const emailInput = document.getElementById('email');
const emailContainer = emailInput.parentElement;
const emailPattern = /^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,}$/;

emailInput.addEventListener('input', () => {
    
    const oldError = document.getElementById('email-error');
    if (oldError) oldError.remove();

    if (!emailPattern.test(emailInput.value)) {
        const errorLabel = document.createElement('label');
        errorLabel.id = 'email-error';
        errorLabel.style.color = 'red';
        errorLabel.textContent = 'Invalid email';
        emailContainer.appendChild(errorLabel);
    }
});


const submitBtn = document.querySelector('.btn-submit');
submitBtn.disabled = true; 

function checkFormValidity() {
    const fullNameValid = nameInput.value.trim() !== '' && !document.getElementById('name-error')?.textContent;
    const emailValid = emailPattern.test(emailInput.value.trim()) && !document.getElementById('email-error')?.textContent;
    const passwordValid = passwordInput.value.trim() !== '';
    const confirmInput = document.getElementById('confirmPassword');
    const confirmValid = confirmInput ? passwordInput.value === confirmInput.value && confirmInput.value.trim() !== '' : false;
    const genderValid = document.getElementById('myDropdown')?.value;

    const allValid = fullNameValid && emailValid && passwordValid && confirmValid && genderValid;
    submitBtn.disabled = !allValid;
    submitBtn.style.backgroundColor = allValid ? '#20c997' : '#ccc';
}

[nameInput, emailInput, passwordInput].forEach(input => input.addEventListener('input', checkFormValidity));
document.addEventListener('input', e => {
    if (e.target.id === 'confirmPassword' || e.target.id === 'myDropdown') {
        checkFormValidity();
    }
});

const successMessage = document.getElementById('successMessage');
successMessage.style.display = 'none'; 

submitBtn.addEventListener('click', (e) => {
    e.preventDefault(); 

    checkFormValidity();
    if (!submitBtn.disabled) {
        successMessage.style.display = 'block';

        const data = {
            fullName: nameInput.value.trim(),
            gender: document.getElementById('myDropdown')?.value || '',
            email: emailInput.value.trim(),
            password: passwordInput.value
        };

        console.log(data);
    }
});
