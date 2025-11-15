const nameInput = document.querySelector('input[name="name"]');
const emailInput = document.querySelector('input[name="email"]');
const password = document.querySelector('input[name="password"]');
const confirmHolder = document.getElementById("confirmPassword");
const genderBox = document.getElementById("genderBox");
const btn = document.querySelector(".btn-submit");
const successMessage = document.getElementById("successMessage");
const errorBox = document.getElementById("errorMessage");

btn.disabled = true;
successMessage.style.display = "none";

let confirmPassInput = null;
let confirmAdded = false;
let genderDropdownAdded = false;

const emailPattern = /^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,}$/;

function checkForm() {
    let valid = true;

    if (!nameInput.value || /^\s*$/.test(nameInput.value)) valid = false;
    if (!emailInput.value || !emailPattern.test(emailInput.value)) valid = false;
    if (!password.value || /^\s*$/.test(password.value)) valid = false;
    if (!confirmPassInput || !confirmPassInput.value || /^\s*$/.test(confirmPassInput.value)) valid = false;
    if (confirmPassInput && confirmPassInput.value !== password.value) valid = false;

    if (genderDropdownAdded) {
        const gender = document.getElementById("myDropdown");
        if (!gender || !gender.value) valid = false;
    }

    btn.disabled = !valid;
}

//Create Gender dropdown after full name blur [10 points]

nameInput.addEventListener("blur", () => {
    if (!genderDropdownAdded && /\S/.test(nameInput.value)) {
        const select = document.createElement("select");
        select.id = "myDropdown";

        const optionsData = [
            { value: '', text: 'Gender' },
            { value: 'male', text: 'Male' },
            { value: 'female', text: 'Female' },
        ];

        optionsData.forEach(option => {
            const o = document.createElement("option");
            o.value = option.value;
            o.textContent = option.text;
            select.appendChild(o);
        });

        genderBox.appendChild(select);
        genderDropdownAdded = true;

        select.addEventListener("change", checkForm);
    }
    checkForm();
});

//Create a new input field named Confirm Password that shows after losing focus on the password field [10 points]

password.addEventListener("blur", () => {
    if (!confirmAdded && /\S/.test(password.value)) {
        const wrap = document.createElement("div");
        wrap.className = "input-group";

        confirmPassInput = document.createElement("input");
        confirmPassInput.type = "password";
        confirmPassInput.placeholder = "Confirm Password";
        confirmPassInput.name = "confirmPassword";

        wrap.appendChild(confirmPassInput);
        confirmHolder.appendChild(wrap);

        confirmAdded = true;

        confirmPassInput.addEventListener("input", checkForm);
    }
    checkForm();
});

//Validate Full Name is not empty [10 points]

nameInput.addEventListener("blur", () => {
    if (!nameInput.value || /^\s*$/.test(nameInput.value)) {
        errorBox.textContent = "Please Fill out this field.";
        errorBox.style.color = "red";
    } else {
        errorBox.textContent = "";
    }
});

//Disable the Submit button as long as there are invalid inputs and the two passwords are not match [20 points]
//Display the success message upon completion of all the inputs and submit button is pressed [10 points]


//Display object in console when submitting [30 points]
btn.addEventListener("click", function(e) {
    e.preventDefault();

    const data = {
        fullName: nameInput.value,
        email: emailInput.value,
        password: password.value,
        confirmPassword: confirmPassInput ? confirmPassInput.value : "",
        gender: document.getElementById("myDropdown")
            ? document.getElementById("myDropdown").value
            : ""
    };

    console.log(data);
});


nameInput.addEventListener("input", checkForm);
emailInput.addEventListener("input", checkForm);
password.addEventListener("input", checkForm);
