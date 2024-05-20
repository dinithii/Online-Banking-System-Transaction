<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>

    <link rel="stylesheet" href="http://localhost:8082/Transaction/MoneyTranferForm.css">
    <meta charset="utf-8" />
    <title>Staff View</title> 
</head>

<body>
<div class="rcpt1">
	<table class="tableT1">
	
			<tr class="trT1">
        	<th >FAQ Number</th>
            <th >Question</th>
            <th >Answer</th>
         </tr>
	
	
           <tr class="trT1">
      		 <td><%= request.getAttribute("fid") %></td>
       		 <td><%= request.getAttribute("fQuestion") %></td>
      		 <td><%= request.getAttribute("fAnswer") %></td>
       		 <td><button class="sbfaq"><a href="http://localhost:8082/Transaction/faqValidate.jsp">Update</a></button></td>
          </tr>
    </table>
</div>
</body>

</html>



