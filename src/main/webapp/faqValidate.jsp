<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<link rel="stylesheet" href="http://localhost:8082/Transaction/MoneyTranferForm.css">
<head>
<meta charset="ISO-8859-1">
<title>validate faq</title>
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
</header>



<body>
     <hr class="hr1">
    <div class="successtrns">
    <div class="dtransH1">
        <form name="tHistoryCheck" action="faqValidation" method="POST">

            <div class="f1">
            	 <label class="lb1" for="sNum">Enter FID</label><br>
                <input type="text" name="tid" maxLength= 8 required><br><br>
                <input type="submit" class="button" value="Update">
            </div>
        </form>
    </div>
    </div>
</body>

    
    <center>
<footer>
    <div class="footerbox">
    <br>
  
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





