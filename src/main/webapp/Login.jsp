<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: hsenid
  Date: 3/31/17
  Time: 9:07 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" Content="text/html;charset=UTF-8">
    <title>Login Form</title>
</head>
<body>
    <form action ="/login" method="POST">
        <div align="center">
             <table>
                 <tr>
                     <td>User Name</td>
                     <td><input type="text" name="userName"></td>
                 </tr>
                 <tr>
                     <td>Password</td>
                     <td><input type="password" name="password"/></td>
                 </tr>
                 <tr>
                     <td></td>
                     <td><input type="submit" value="submit"/></td>
                 </tr>
             </table>
            </div>
    </form>
</body>
</html>
