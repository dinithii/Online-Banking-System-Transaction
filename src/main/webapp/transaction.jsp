<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>


<link rel="stylesheet" href="http://localhost:8082/Transaction/MoneyTranferForm.css">
<meta charset="ISO-8859-1">

<title>Domestic Transaction Insertion</title>

</head>
<header>
  <div class="headerbox">
   
       <div class="headeritem">
           <img src="http://localhost:8082/Transaction/images/logo2.png" width="324" height="90" class="cblogo">
      </div> 
       
     <div class="headeritem">
            <a href="http://localhost:8082/Transaction/images/pfp.png"><img src="http://localhost:8082/Transaction/images/pfp.png" width="50" height="50" class="userpic">
       </a>
       </div>
     
  </div>

      
       <div class="navbar">
        <a href="#home" class="menubtn1">View Transaction History</a>
        <a href="#home">Transfer Money</a>
        <a href="#home">Apply for a Loan</a>
        
      
      
        <div class="dropdown">
          <button class="dropbtn" onclick="myFunction()">Other Services
          <i class="fa fa-caret-down"></i>
         </button>
            <div class="dropdown-content" id="myDropdown">
              <a><form method="post" action="viewuserprofile" class="viewpro">
            <input type="submit" value="View profile" >
            </form></a>
            <a href="#">FAQ</a>
              <a href="#">Help</a>
              <a href="#">User Guide</a>
            </div>
        </div> 
       </div>
 

  
<script>

function myFunction() {
  document.getElementById("myDropdown").classList.toggle("show");
}

window.onclick = function(e) {
  if (!e.target.matches('.dropbtn')) {
  var myDropdown = document.getElementById("myDropdown");
    if (myDropdown.classList.contains('show')) {
      myDropdown.classList.remove('show');
    }
  }
}

</script>
</header>




<body>
<div class="DTtext">
	<p>Domestic Transactions</p>
</div>
    <div class="transForm">
        <form name="DomesticPayments" action="transForm" method="POST">

            <div class="f1">
                <label for="sNum">Source Account Number</label><br>
                <input type="text" name="sNum" maxLength= 8 placeholder="From" required><br><br>

                <label for="amount">Amount</label><br>
                <input type="text" name="amount" placeholder="LKR" required><br><br>

                <label for="tdate">Date</label><br>
                <input type="date" name="tdate" value=""<%= java.time.LocalDate.now() %>"><br><br>

                <label for="purPay">Purpose of Payment</label><br>
                                                              <select name="purPay">
                                                                  <option value="emty"></option>
                                                                  <option value="Advertising fees">Advertising fees</option>
                                                                  <option value="Financial services">Financial services</option>
                                                                  <option value="Legal services">Legal services</option>
                                                                  <option value="Medical reimbursement">Medical reimbursement</option>
                                                                  <option value="Trade services">Trade services</option>
                                                                  <option value="Transportation costs">Transportation costs</option>
                                                                  <option value="Payroll">Payroll</option>
                                                                  <option value="Other">Other</option>
                                                              </select>
                <br><br>

                <label for="remarks">Remarks</label><br>
                <textarea class="remarks" name="remarks" rows="4">Type any remarks you have for the receiver here</textarea>
                <br><br>

            </div>
            <hr>

            <div class="f1">
                <label for="bNum">Beneficiary Account Number</label><br>
                <input type="text" name="bNum" placeholder="To" required><br><br>

                <label for="bankName">Beneficiary Bank Name</label><br>
                <input type="text" name="bankName" placeholder="Bank Name" required><br>

                <label for="branch">Branch</label><br>
                <input type="text" name="branch" class="branchinput" placeholder="Colombo-3" required><br>
                <button class="srchBranchBtn" value="Search" target="_blank"  onclick="window.location.href = 'https://www.cbsl.gov.lk/en/authorized-financial-institutions/licensed-commercial-banks';">Search for branch</button>

                <br><br>

                <label for="bname">Beneficiary Name</label><br>
                <input type="text" name="bname" placeholder="Beneficiary Name" required><br><br>

                <label for="bemail">Beneficiary Email</label><br>
                <input type="email" name="bemail" placeholder="abc@gmail.com" required><br><br>

                <br>
                <button class="cnclBtn href="profile.jsp">Cancel</button>
                <input  class="submit" type="submit" class="button" value="Submit">
            </div>

        </form>
    </div>
</body>




<center>
<footer>
    <div class="footerbox">
    <br>
  
          <div class="footer-links">
            <a href="#">About us</a> |
            <a href="#">Help</a> |
            <a href="#">FAQ</a> |
            <a href="#">User guide</a> |
         <a href="#">Contact us</a> |
            <a href="#">Privacy policy</a>
        </div>
        
        
    <br>    
      <div class="connect">
          <p class="connect-text">Connect with us</p>
          <a target="_blank "href="https://www.facebook.com/"><img src="http://localhost:8082/Transaction/images/fb.png" alt="Facebook Logo" width="25px" height="25px" class="sm"></a>
          <a target="_blank "href="https://www.instagram.com/"><img src="http://localhost:8082/Transaction/images/insta.png" alt="Instagram Logo" width="25px" height="25px" class="sm"></a>
          <a target="_blank "href="https://www.twitter.com/"><img src="http://localhost:8082/Transaction/images/twitter.png" alt="Twitter Logo" width="25px" height="25px" class="sm"></a>
          <a target="_blank "href="https://www.youtube.com/"><img src="http://localhost:8082/Transaction/images/yt.jpg" alt="YouTube Logo" width="32px" height="23px" class="sm"></a>
      </div>
      
      <div class="footer-bottom">
          © All rights reserved - Ceylon Bank
      </div>
      
      <div class="footer-logo">
          <img src="http://localhost:8082/Transaction/images/favicon (1).png" alt="Ceylon Bank logo" width="44px" height="44px">
        </div>
   </div>
</footer>
</center>

</html>