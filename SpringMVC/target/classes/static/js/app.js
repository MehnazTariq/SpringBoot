function validate() {
	var name = document.getElementById("name").value;
	var age = document.getElementById("age").value;
	if (name == '') {
		alert('Please enter a valid name.');
		return false;
	} else {
		return true;
	}
	if (age == '') {
		alert('Please enter age.');
		return false;
	} else {
		return true;
	}
}
