// Create a Gender dropdown that shows after losing focus on full name input field [10 points]
// Create a new input field named Confirm Password that shows after losing focus on the password field [10 points]
// Validate the Full Name field to not be empty [10 points]
// Validate the Email field to have correct email entry [10 points]
// Disable the Submit button as long as there are invalid inputs and the two passwords are not match [20 points]
// Display the success message upon completion of all the inputs and submit button is pressed [10 points]
// Display in console an object created from all the inputs [30 points]
let checker = false;
const fullnameInput = document.getElementById('fullname');

//create a dropdown element for gender
const genderDropdown = document.createElement('select');
      genderDropdown.id = 'gender';
      genderDropdown.name = 'gender';
//initialize value for dropdown of gender
const genderSelections = [
        { value: '', text: 'Gender', placeholder: true },
        { value: 'male', text: 'Male' },
        { value: 'female', text: 'Female' },
    ];
//display gender selection when out of focus on full name field.
fullnameInput.addEventListener('blur', checkFullname);
function checkFullname(e){
   if(e.type == "blur"){
      genderSelections.forEach(v => {
      const optionElement = document.createElement('option');
      optionElement.value = v.value;
      optionElement.textContent = v.text;
      genderDropdown.appendChild(optionElement);
      });
      fullnameInput.insertAdjacentElement('afterend', genderDropdown);

   }
}
    

/////check password if focus is out then display another field
const passwordField = document.getElementById('password');
const passwordConfirm = document.createElement('input');
passwordConfirm.type = 'password';
passwordConfirm.id = 'confirmPassword';
passwordConfirm.name = 'confirm-password';
passwordConfirm.placeholder = 'Confirm Password';

const confirmPassChecker = null;
//function to display confirm password if lost focus on password field
function checkPassword(e){
   if(e.type == "blur"){  
      passwordField.insertAdjacentElement('afterend', passwordConfirm);
   }
}
passwordField.addEventListener('blur', checkPassword);



//////validation for full name if empty and format in email
const emailInput = document.getElementById('emailField');
let emailPattern = /^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,}$/;
const signUpButton = document.querySelector('.btn-submit');
signUpButton.addEventListener('focus', checkbtn);
function signup() { 
   if(fullnameInput.value === ''){
      alert("Full Name cannot be empty!");
      checker = false;
   }
   if(!emailPattern.test(emailInput.value)){
       alert("Invalid email format");
      checker = false;
   }
   if(emailInput.value === ''){
      alert("Email Address is empty!");
      checker = false;
   }
   else{
       checkAllFields();
   }
}
signUpButton.addEventListener('click', signup);

//function for button to disable
function checkbtn(){
   if(checker == false ){
      signUpButton.style.cursor = 'not-allowed';
      signUpButton.type = '';
   }
}

//validation for checking all fields if empty or password does not match.
function checkAllFields(){
   
   if(fullnameInput.value === '' || emailInput.value === '' || passwordField.value === '' || passwordConfirm.value === ''){
      alert("Fill up all fields!");     
   }
   if(passwordConfirm.value !== passwordField.value){
      alert("Password does not match!");
   }
   if(genderDropdown.value === 'Gender' || genderDropdown.value === '')
   {
      alert("Select a gender");
   }
   else{
     const successDisplay = document.getElementById('successMessage');
     successDisplay.style.display = 'block';
     console.log(fullnameInput.value);
     console.log(genderDropdown.value);
     console.log(emailInput.value);
     console.log(passwordField.value);
     console.log(passwordConfirm.value);
     checker = false;
   }

}