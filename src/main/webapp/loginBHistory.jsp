<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<link rel="stylesheet" href="http://localhost:8082/Transaction/MoneyTranferForm.css">
<head>
<meta charset="ISO-8859-1">
<title>Bill Payment History Check</title>
</head>
<body>
	<h3 >Enter account number to check your bill payment history</h3>
    <hr class="hr1">
    <div class="transForm">
        <form name="tHistoryCheck" action="checkBillForm" method="POST">

            <div class="f1">
                <label for="sNum">Account Number</label><br>
                <input type="text" name="sNum" maxLength= 8 required><br><br>

                <input type="submit" class="button" value="submit">
            </div>
        </form>
    </div>
</body>
</html>