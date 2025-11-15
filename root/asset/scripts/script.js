// Create a Gender dropdown that shows after losing focus on full name input field [10 points]
// Create a new input field named Confirm Password that shows after losing focus on the password field [10 points]
// Validate the Full Name field to not be empty [10 points]
// Validate the Email field to have correct email entry [10 points]
// Disable the Submit button as long as there are invalid inputs and the two passwords are not match [20 points]
// Display the success message upon completion of all the inputs and submit button is pressed [10 points]
// Display in console an object created from all the inputs [30]

function validation() {
  let valid =true;
  const fullName = document.getElementById('full_name');
  if (fullName.value.trim() === ''){
    document.getElementById('error').innerHTML = 'Please enter a valid name.';
    valid =false;
  } else {
    document.getElementById('error').innerHTML = '';
  }
  
  const emailAddress = document.getElementById('email_address');
  if (emailAddress.value.trim() === '' || !/^[^\s@]+@[^\s@]+\.[^\s@]+$/.test(emailAddress.value)) {
    document.getElementById('emailError').innerHTML = 'Please enter a valid email';
    valid = false;
  } else {
    document.getElementById('emailError').innerHTML = '';
  }

  
  var password = document.getElementById('password');
  const password2 = document.getElementById('password2')
  const passwordError2 = document.getElementById('passwordError2');
  var pass = document.getElementById('password2');

  if (password.value.trim() === '' ) {
    document.getElementById('passwordError').innerHTML = "Password cannot be empty.";
    valid = false;
  } else if (password.value !== password2.value) {
          passwordError2.innerHTML = 'Password do not match.';
          valid = false;
        } else {
          passwordError2.innerHTML = '';
        }

        if (valid) {
          const allInput = {
          fullName: document.getElementById('full_name').value.trim(),
          email: document.getElementById('email_address').value.trim(),
          password: document.getElementById('password').value.trim()
        };
        console.log(allInput);
        alert('Sucessfully Registered!');
        }
      }