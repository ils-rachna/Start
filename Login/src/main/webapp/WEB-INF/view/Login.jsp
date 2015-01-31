<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
 

<h2>Login Form</h2>
<form:form method="GET" action="Welcome.html">
 
    <table>
    <tr>
        <td></td>
    		<td><input type=text name="username"></td>
    </tr>
    <tr>
    				<td></td>
          			<td><input type=password name="password"></td>
    </tr>
    <tr>
        <td colspan="2">
            <input type="submit" value="Login">
        </td>
    </tr>
</table>    
     
</form:form>