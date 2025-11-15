
// Create a Gender dropdown that shows after losing focus on full name input field [10 points]
function showGender()
{
    const existingSelect = document.getElementById("nameCon").querySelector("select");
  
  // para hindi mag double double 
    if(existingSelect)
    {
        return;
    }
    else 
    {
        const select = document.createElement("select");
        select.style.backgroundColor = "#2c2c2c";
        select.style.marginTop = "15px";
        select.style.width = "338px";
        select.style.border = "normal";
        select.style.borderRadius = "5px";


        const optionMale = document.createElement("option");
        optionMale.value = "male";
        optionMale.textContent = "Male";

        const optionFemale = document.createElement("option");
        optionFemale.value = "female";
        optionFemale.textContent = "Female";

        select.appendChild(optionMale);
        select.appendChild(optionFemale);

        document.getElementById("nameCon").appendChild(select);
    }
}


// Create a new input field named Confirm Password that shows after losing focus on the password field [10 points]
function confirmPassword()
{
    const existingInput = document.getElementById("confirm-password");

    if(existingInput) // ganon lang rin yung ginawa ko katulad sa select gender
    {
        return;
    }
    else
    {
        const input = document.createElement("input");
        input.type = "password"; 
        input.id = "confirm-password"; // ginawa ko dito ay nag look siya para sa id if meron magkatulad
        input.placeholder = "confirmPassword";  
        input.style.marginTop = "20px";
        document.getElementById("pass").appendChild(input);
    }
}


// Validate the Full Name field to not be empty [10 points]
// Validate the Email field to have correct email entry [10 points]
function checkvalue()
{
 const gmailRegex = /^[a-zA-Z0-9._%+-]+@gmail\.com$/;
  const nameInput = document.getElementById("input-name");
  const passwordInput = document.getElementById("password-input");
  const confirmPasswordInput = document.getElementById("confirm-password");
  const emailInput = document.getElementById("email-input");
  const submitButton = document.getElementById("btn-submit");

 
  if (nameInput.value === "")
  {
    console.log("Full Name is empty");
    nameInput.placeholder = "* Full Name is required";
    alert("not a full name ");
    return;
  }
  if (!gmailRegex.test(emailInput.value) || emailInput.value === "") 
  {
    console.log("Invalid email");
    emailInput.placeholder = "* Valid Gmail Address is required";
     alert("invalid gmail");
     return;
  }
  if (passwordInput.value === "")
  {
    console.log("Password is empty");
    passwordInput.placeholder = "* Password is required";
     alert("empty password ");
     return;
  }
  if (confirmPasswordInput.value !== passwordInput.value)
  {
    console.log("Passwords do not match");
    confirmPasswordInput.placeholder = "* Confirm Password must match Password";
     alert("password dont match");
     return;
  }

  success();
  
}


// Disable the Submit button as long as there are invalid inputs and the two passwords are not match [20 points]


// Display the success message upon completion of all the inputs and submit button is pressed [10 points]
function success()
{
    const successfull = document.getElementById("Message");
    successfull.style.width = "200px"
    successfull.style.height = "200px"
    successfull.style.backgroundColor = "#2c2c2c";

    document.getElementsByClassName("form-container").appendChild(successfull);
}


// Display in console an object created from all the inputs [30 point]
