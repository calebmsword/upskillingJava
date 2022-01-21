<%--
  Created by IntelliJ IDEA.
  User: Bigmo
  Date: 1/21/2022
  Time: 2:27 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
    <title>empreg</title>
</head>
<body>
    <h2>Enter Employee Details</h2>
<%--    <form action="empreg" method="post">--%>
<%--        Id: <input type="text" name="id"><br><br>--%>
<%--        Name: <input type="text" name="name"><br><br>--%>
<%--        Department No: <input type="text" name="deptno"><br><br>--%>
<%--        <input type="submit" value="Register">--%>
<%--        <input type="reset" value="Cancel">--%>
<%--    </form>--%>
    <form:form action="empreg" method="post">
        <table>
            <tr>
                <td><form:label path="id"></form:label></td>
                <td><form:input path="id" /></td>
            </tr>
            <tr>
                <td><form:label path="name"></form:label></td>
                <td><form:input path="name" /></td>
            </tr>
            <tr>
                <td><form:label path="deptno"></form:label></td>
                <td><form:input path="deptno" /></td>
            </tr>
            <tr>
                <input type="submit" value="Register" />
                <input type="reset" value="Cancel" />
            </tr>
        </table>
    </form:form>
</body>
</html>
