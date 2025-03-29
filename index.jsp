<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Software developer & HR</title>

<style type="text/css">

@media(min-width:768px)
{

}
body
{
background: #fefedf;
}
.desc_h1
{
text-align: center;
}
.title
{
border:none;
width:100%;
height:100px;
background-color:#fff6ff;
text-align:center;
padding: 20px;
margin: 15px;
font-size: 50px;
}

.reg
{
  width: 500px;
  margin: 25px auto;
  padding: 10px;
}
label
{
display:block; 
margin: 5px;
padding: 10px;
}

li
{
margin:10px;
padding: 5px;

}
</style>
<script  type="text/javascript">
        // Initialize the intl-tel-input plugin
        var input = document.querySelector("#mobile");
        var iti = window.intlTelInput(input, {
            initialCountry: "in",  // Default country (India)
            separateDialCode: true, // Show country code separately
            preferredCountries: ["in", "us", "gb"], // Preferred countries
            utilsScript: "https://cdnjs.cloudflare.com/ajax/libs/intl-tel-input/17.0.19/js/utils.min.js" // Utility script for validation
        });

        // Function to get full phone number
        input.addEventListener("change", function() {
            console.log("Full Number:", iti.getNumber());
        });
    </script>

</head>
<body>

<div class="title"><hi>MGS INFOTECH</hi></div>

<div class="description">
<div class="desc_h1"><h1>Software Developer & Content/Technical Writer</h1>

<h1>Role: Software developer</h1>
</div>
<h2>Years of Experience: 0 to 2 years</h2>

<h2><b>Skillset:</b> C, C++ & Java</h2>

<h3><b>Year of Graduation:</b> Upto 2025 (2026 students are not eligible for this test process)</h3>

<h3>Job Description:</h3>

<div class="li">

<ul class="ul"> 
<li class="li">Design and develop high-volume, low-latency applications for mission-critical systems, delivering high-availability and performance.</li>

 <li>Contribute in all phases of the product development life cycle.</li>

<li> Write well-designed, testable</li>

<li> Contribute in all phases of the product development life cycle.</li>

 <li>Write well-designed, testable and efficient code.</li>

 <li>Ensure designs are in compliance with specifications.</li>

 <li>Prepare and produce releases of software components.</li>

 <li>Support continuous improvement by investigating alternatives and technologies and presenting these for architectural review.</li>


</ul>
</div>

</div>
<div class="reg">
<form action="Registerservlet" method="post">
<div class="name-container">
<label for="name">Name <span style="color: red;">*</span></label>
<input type="text" name="name" required>
</div>
<div class="mail-container">
<label for="email">Email <span style="color: red;">*</span></label>
<input type="text" name="email" required>
</div>
<div class="mobile-container">
<label for="mobile">Mobile <span style="color: red;">*</span></label>
<input type="tel" id="mobile" name="mobile" required>
</div>
<div class="clg-name-container">
<label for="clgname">College Name <span style="color: red;">*</span></label>
<input type="text" name="clgname" required>
</div>
<div class="degree-container">
<label for="degree">Degree <span style="color: red;">*</span></label>
<input type="text" name="degree" required>
</div>
<div class="yog-container">
<label for="yog">Year of Graduation <span style="color: red;">*</span></label>
<input type="text" name="yog" required>
</div>
<div class="app-role-container">
<label for="role">Applying Role <span style="color: red;">*</span></label>
<input type="text" name="role" required>
</div>
<div class="exp-container">
<label for="exp">Total Years of Experience  <span style="color: red;">*</span></label>
<input type="text" name="exp" required>
</div>
<div class="ctc-container">
<label for="ctc">Current CTC (LPA)  <span style="color: red;">*</span></label>
<input type="text" name="ctc" required>
</div>
<div class="exp-ctc-container">
<label for="expctc">Expected CTC (LPA)  <span style="color: red;">*</span></label>
<input type="text" name="expctc" required>
</div>
<div class="nop-container">
<label for="nop">Notice Period <span style="color: red;">*</span></label>
<input type="text" name="nop" required>
</div>
<div class="skill-container">
<label for="skill">Skill Set <span style="color: red;">*</span></label>
<input type="text" name="skill" required>
</div>
<div class="address-container">
<label for="add">Address  <span style="color: red;">*</span></label>
<input type="text" name="add" required>
</div>
<div class="nat-d-container">
<label for="natd">Native District <span style="color: red;">*</span></label>
<input type="text" name="natd" required>
</div>
<div class="stat-container">
<label for="stat">State <span style="color: red;">*</span></label>
<input type="text" name="stat" required>
</div>
<div class="nat-container">
<label for="nation">Nationality  <span style="color: red;">*</span></label>
<input type="text" name="nation" required>
</div>
<div class="btn-container">
<input type ="submit" value="Register">
</div>
</form>

</div>

</body>
</html>