// Create a Gender dropdown that shows after losing focus on full name input field [10 points]
// Create a new input field named Confirm Password that shows after losing focus on the password field [10 points]
// Validate the Full Name field to not be empty [10 points]
// Validate the Email field to have correct email entry [10 points]
// Disable the Submit button as long as there are invalid inputs and the two passwords are not match [20 points]
// Display the success message upon completion of all the inputs and submit button is pressed [10 points]
// Display in console an object created from all the inputs [30 points]


const genderSelect = document.createElement("select");
genderSelect.innerHTML = `
    <option value="">Select Gender</option>
    <option value="Male">Male</option>
    <option value="Female">Female</option>
    <option value="Transformer">Transformer</option>
`;

const fullNameInput = document.getElementById("input-name");
const form = document.getElementById("registerForm");
const successMessage = document.getElementById("successMessage");
const submitButton = form.querySelector("button[type='submit']");

const emailInput = form.querySelector("input[type='email']");
const passwordInput = form.querySelector("input[type='password']");


const genderDiv = document.createElement("div");
genderDiv.classList.add("input-group");
genderDiv.style.display = "none";
genderDiv.appendChild(genderSelect);


const fullNameGroup = fullNameInput.parentElement;
fullNameGroup.insertAdjacentElement("afterend", genderDiv);


const confirmDiv = document.createElement("div");
confirmDiv.classList.add("input-group");
confirmDiv.style.display = "none";

const confirmInput = document.createElement("input");
confirmInput.type = "password";
confirmInput.placeholder = "Confirm Password";
confirmDiv.appendChild(confirmInput);

form.insertBefore(confirmDiv, submitButton);


function isValidFullName() {
    return fullNameInput.value.trim() !== "";
}

function isValidEmail() {
    return emailInput.value.includes("@") && emailInput.value.includes(".");
}

function doPasswordsMatch() {
    if (confirmDiv.style.display === "none") return true;
    return passwordInput.value === confirmInput.value;
}

function updateSubmitButton() {
    const valid =
        isValidFullName() &&
        isValidEmail() &&
        passwordInput.value.length > 0 &&
        doPasswordsMatch();

    submitButton.disabled = !valid;
}


fullNameInput.addEventListener("blur", () => {
    genderDiv.style.display = "block";
    updateSubmitButton();
});


passwordInput.addEventListener("blur", () => {
    confirmDiv.style.display = "block";
    updateSubmitButton();
});


fullNameInput.addEventListener("input", updateSubmitButton);
emailInput.addEventListener("input", updateSubmitButton);
passwordInput.addEventListener("input", updateSubmitButton);
confirmInput.addEventListener("input", updateSubmitButton);


form.addEventListener("submit", (e) => {
    e.preventDefault();
    if (submitButton.disabled) return;

    const data = {
        fullName: fullNameInput.value.trim(),
        email: emailInput.value.trim(),
        gender: genderSelect.value,
        password: passwordInput.value,
        confirmPassword: confirmInput.value
    };

    console.log("Submitted Object:", data);

    successMessage.style.display = "block";

   
    form.reset();
    genderDiv.style.display = "none";
    confirmDiv.style.display = "none";
    submitButton.disabled = true;
});
