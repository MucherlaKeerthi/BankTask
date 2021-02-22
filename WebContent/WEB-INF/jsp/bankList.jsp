<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>List Of Transactions</title>
</head>
<body>
<div class="dropdown">
		<button class="dropbtn">
			<c:choose>
				<c:when test="${empty checkBank.name}">
					<a href="<c:url value='index.jsp'/>">${"Login"}</a>
				</c:when>
				<c:otherwise>
					<h3>Hi, ${checkBank.name}</h3>
				</c:otherwise>
			</c:choose>
		</button>
		
	</div>

<div class="main" align="center">
    
    <h3>Bank Account Details </h3>
    <c:if test="${!empty bankList}">
    <table class="AccountTable">
    <tr>
        <th width="40">Name</th>
        <th width="80">Card Number</th>
        <th width="80">Gender</th>
        <th width="100">Age</th>
        <th width="80">Bank Name</th>
        <th width="80">Credit Limit</th>
        <!-- <th width="100">Transaction Date</th>
        <th width="80">Amount</th> -->
     
       
    </tr>
 <c:forEach items="${bankList}" per="bankAcc">
        <tr>
                <td>${banks.name}</td>
                <td>${banks.cardNumber}</td>
                <td>${banks.gender}</td>
                <td>${banks.age}</td>
                <td>${banks.bank}</td>
                <td>${banks.creditLimit}</td>
                <%-- <td>${banks.transactionDate}</td>
                <td>${banks.amount}</td>   --%>                                         
              
        </tr>
    </c:forEach>
    </table>
</c:if>

</body>
</html>