<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib prefix="from" uri="http://www.springframework.org/tags/form" %>
<%@ page session="false" %>
<html>

<body>
<%--<a href="../../index.jsp">Back to main menu</a>--%>

<br/>
<br/>

<h1>Book List</h1>

<c:forEach items="${listBooks}" var="book">
    <tr>
        <td>${book.idbook}</td>
        <td>${book.bookname}</td>
        <td>${book.bookautor}</td>
    </tr>
</c:forEach>

</body>
</html>