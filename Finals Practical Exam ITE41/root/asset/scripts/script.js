    // Create a Gender dropdown that shows after losing focus on full name input field [10 points]
    // Create a new input field named Confirm Password that shows after losing focus on the password field [10 points]
    // Validate the Full Name field to not be empty [10 points]
    // Validate the Email field to have correct email entry [10 points]
    // Disable the Submit button as long as there are invalid inputs and the two passwords are not match [20 points]
    // Display the success message upon completion of all the inputs and submit button is pressed [10 points]
    // Display in console an object created from all the inputs [30 points]
document.addEventListener("DOMContentLoaded", function() {

	const fullNameInput = document.getElementById("fullName");
	const emailInput = document.querySelector('input[name="email"]');
	const passwordInput = document.querySelector('input[name="password"]');
	const confirmPasswordInput = document.getElementById("confirmPassword");
	const genderContainer = document.getElementById("genderContainer");
	const submitButton = document.querySelector(".btn-submit");
	const successMessage = document.getElementById("successMessage");
	const fullNameError = document.getElementById("fullNameError");
	const emailError = document.getElementById("emailError");
	const passwordError = document.getElementById("passwordError");
	const confirmError = document.getElementById("confirmError");
	const passwordEye = document.getElementById("passwordEye");
	const confirmEye = document.getElementById("confirmEye");

	let registeredUsers = [];
	submitButton.disabled = true;
	successMessage.style.display = "none";

	function isFullNameValid(value){
		let parts = value.trim().split(/\s+/);
		let firstValid = parts[0] && parts[0].length>=2;
		let lastValid = parts[parts.length-1] && parts[parts.length-1].length>=2;
		if(parts.length >= 2 && firstValid && lastValid){
	 		return true;
		    } else{
			return false;
            }
        }

	const isEmailValid = function(value){
		const atPos = value.indexOf("@");
	  	const dotPos = value.lastIndexOf(".");
            if(value.length <= 5) return false;
                if(atPos < 1 || dotPos < atPos + 1) return false;
            return true;
	};
 
	const createGenderDropdown = () => {
		 let existing = document.getElementById("gender");
		if(existing) return;

            let select = document.createElement("select");
                select.id = "gender";
            select.name = "gender";

		let options = ["", "Male", "Female", "Other", "Prefer not to say"];
		for(let i=0; i<options.length; i++){
                let opt = document.createElement("option");
                  opt.value = options[i];
                    opt.textContent = options[i] || "Select Gender";
                  select.appendChild(opt);
            }

		fullNameInput.after(select);

		select.addEventListener("change", function(){ validateForm(); });
	};

          fullNameInput.addEventListener("blur", function(){
            if(!isFullNameValid(fullNameInput.value)){
                  fullNameError.textContent = "Please enter a valid full name (first & last)";
                fullNameError.style.opacity = 1;
                setTimeout(()=> fullNameError.style.opacity=0, 5000);

			let oldDropdown = document.getElementById("gender");
			if(oldDropdown) oldDropdown.remove();
		}else{
			fullNameError.style.opacity = 0;
		 	createGenderDropdown();
		}
	    	validateForm();
	});

        passwordInput.addEventListener("blur", function(){
            let showConfirm = passwordInput.value.length >= 8;
            if(!showConfirm){
                passwordError.textContent = "Password must be at least 8 characters";
                 passwordError.style.opacity = 1;
                    setTimeout(()=> passwordError.style.opacity = 0, 5000);

			confirmPasswordInput.style.display = "none";
			    confirmEye.style.display = "none";
		}else{
			passwordError.style.opacity = 0;
			confirmPasswordInput.style.display = "block";
			confirmEye.style.display = "block";
	  	}
		validateForm();
	});
        confirmPasswordInput.addEventListener("blur", function(){
            let mismatch = confirmPasswordInput.value && confirmPasswordInput.value !== passwordInput.value;
            if(mismatch){
                confirmError.textContent = "Passwords do not match";
                confirmError.style.opacity = 1;
                setTimeout(()=> confirmError.style.opacity=0, 5000);
                }else{
                    confirmError.style.opacity = 0;
                }
		validateForm();
	});

	emailInput.addEventListener("blur", function(){
		let validEmail = isEmailValid(emailInput.value);
		if(!validEmail){
			emailError.textContent = "Please enter a valid email";
			emailError.style.opacity = 1;
			setTimeout(()=> emailError.style.opacity = 0, 5000);
		}else{
			emailError.style.opacity = 0;
		}
		validateForm();
	});
	[fullNameInput, emailInput, passwordInput, confirmPasswordInput].forEach(function(inputField){
		inputField.addEventListener("input", function(){

			if(inputField === passwordInput){
				let canShow = passwordInput.value.length >= 8;
				if(canShow){
					confirmPasswordInput.style.display = "block";
					confirmEye.style.display = "block";
				}else{
					confirmPasswordInput.style.display = "none";
					confirmEye.style.display = "none";
					confirmPasswordInput.value = "";
				}
			}
			validateForm();
		});
	});
	    passwordEye.addEventListener("click", ()=> passwordInput.type = passwordInput.type==="password"?"text":"password");
	 confirmEye.addEventListener("click", ()=> confirmPasswordInput.type = confirmPasswordInput.type==="password"?"text":"password");

	function validateForm(){
		let genderSelect = document.getElementById("gender");
		let genderValid = false;
		    if(genderSelect && genderSelect.value !== "") genderValid = true;

		    let validForm = isFullNameValid(fullNameInput.value) &&
					isEmailValid(emailInput.value) &&
					passwordInput.value.length >= 8 &&
					passwordInput.value === confirmPasswordInput.value &&
					genderValid;

		submitButton.disabled = !validForm;
	}
      submitButton.addEventListener("click", function(e){
            e.preventDefault();

        let emailLower = emailInput.value.trim().toLowerCase();
 
		if(registeredUsers.includes(emailLower)){
			emailError.textContent = "User already registered";
			emailError.style.opacity = 1;
			setTimeout(()=> emailError.style.opacity=0, 5000);
			return;
		 }
 
		if(submitButton.disabled) return;

		registeredUsers.push(emailLower);

		successMessage.style.display = "block";
	 successMessage.style.opacity = 1;
 
		setTimeout(function(){
			successMessage.style.opacity = 0;
			setTimeout(()=> successMessage.style.display="none", 500);
		}, 5000);

            let userObject = {
                fullName: fullNameInput.value,
                gender: document.getElementById("gender").value,
                  email: emailInput.value,
                   password: passwordInput.value
            };

		 console.log(userObject);
	});
});