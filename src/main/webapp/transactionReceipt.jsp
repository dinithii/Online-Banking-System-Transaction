<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" href="http://localhost:8082/Transaction/MoneyTranferForm.css">
    <title>Transaction History</title>
</head>

<body>

<div class="rcpt">
    <table class="tableT">
        
        <tr class="trT">
        	<th >Receipt Number</th>
            <th >Source Account</th>
            <th >Amount</th>
            <th >Date</th>
            <th >Purpose</th>
            <th >Remarks</th>
            <th >Receiver Number</th>
            <th >Bank</th>
            <th >Branch</th>
            <th >Receiver Name</th>
            <th >Receiver Email</th>
         </tr>
        
            <tr class="trT2">
            	<td><%= request.getAttribute("tid")%></td>
                <td><%= request.getAttribute("sNumber")%></td>
                <td><%= request.getAttribute("tAmount")%></td>
                <td><%= request.getAttribute("tDate")%></td>
                <td><%= request.getAttribute("tPurpose")%></td>
                <td><%= request.getAttribute("tRemarks")%></td>
                <td><%= request.getAttribute("bNumber")%></td>
                <td><%= request.getAttribute("bBank")%></td>
                <td><%= request.getAttribute("bBranch")%></td>
                <td><%= request.getAttribute("bName")%></td>
                <td><%= request.getAttribute("bEmail")%></td>
            </tr>
            
            <tr class="lastrow1">
            <td><button class="sbd"><a href="http://localhost:8082/Transaction/validateDeleteReceipt.jsp">Delete</a></button></td>
            </tr>
            
    </table>
    <br>
</div>    
 
</body>
</html>

























