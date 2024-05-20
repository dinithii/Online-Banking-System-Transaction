<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
   <link rel="stylesheet" href="http://localhost:8082/Transaction/MoneyTranferForm.css">
   
<head>

	<meta charset="ISO-8859-1">
	<title>Validate user to check the transaction history</title>

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
 
</header>


<body>

<div class="DTtext">
	<h3>Enter account number to check the transaction history</h3>
</div>
    <hr class="hr1">
    
    <div class="successtrns">
    <div class="dtransH1">
        <form name="tHistoryCheck" action="checkDomesticTForm" method="POST">
        <div class="f1">
                <label class="lb1" for="sNum">Account Number</label><br>
                <input type="text" name="sNum" maxLength= 8 required><br><br>
                <input class=tHlogin type="submit" class="button" value="submit">
                </div>
        </form>
        </div>
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