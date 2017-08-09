<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: k4j4n
  Date: 8/9/17
  Time: 6:03 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add Goal</title>
</head>
<body>
    <form:form commandName="goal">
        <table>
            <tr>
                <td></td>
                <td><form:input path="minutes"/></td>
            </tr>

            <tr>
                <td colspan="2">
                    <input type="submit" value="Enter Goal Minutes">
                </td>
            </tr>
        </table>
    </form:form>



</body>
</html>
