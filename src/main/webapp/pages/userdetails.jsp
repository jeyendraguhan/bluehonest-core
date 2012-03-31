<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
</head>
 
<body>
<h1>Struts 2 + Spring + Hibernate integration example</h1>
 
<h2>Add Customer</h2>
<s:form action="addUserAction" >
  <s:textfield name="userName" label="Name" value="" />
  <s:textfield name="addressId" label="Address" value="" />
  <s:textfield name="phoneNo" label="Phone" value="" />
  <s:submit />
</s:form>
 
<h2>All Customers</h2>
 
<s:if test="userDetailsList.size() > 0">
<table border="1px" cellpadding="8px">
	<tr>
		<th>User Id</th>
		<th>User Name</th>
		<th>Address Id</th>
		<th>Created Date</th>
	</tr>
	<s:iterator value="userDetailsList" status="userStatus">
		<tr>
			<td><s:property value="userId" /></td>
			<td><s:property value="userName" /></td>
			<td><s:property value="addressId" /></td>
			<td><s:date name="regDate" format="dd/MM/yyyy" /></td>
		</tr>
	</s:iterator>
</table>
</s:if>
<br/>
<br/>
 
</body>
</html>