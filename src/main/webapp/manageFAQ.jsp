<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" href="http://localhost:8082/Transaction/MoneyTranferForm.css">
    <meta charset="ISO-8859-1">
    <title>Manage FAQ</title>
</head>

<body>

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

<div class="DTtext">
<p>Manage FAQ</p>
</div>
    <div class="transForm">
        <form name="faq" action="faqForm" method="POST">

            <div class="f1">
                <label for="sNum">Enter Question</label><br>
                <textarea class="remarks" name="question" rows="5"></textarea><br><br>

                <label for="amount">Enter Answer</label><br>
                <textarea class="remarks" name="answer" rows="50"></textarea><br><br>

                <input type="submit" class="button" value="Save">
            </div>

        </form>
        <form action="staffviewfaq" method="post">
                   <input type="submit" class="button" value="View FAQ">
        </form>
    </div>

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
    
</body>
</html>