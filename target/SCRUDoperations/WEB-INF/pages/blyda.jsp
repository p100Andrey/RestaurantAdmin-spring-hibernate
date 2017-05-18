<%@ page import="java.util.ArrayList" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib prefix="from" uri="http://www.springframework.org/tags/form" %>
<%@ page session="false" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%
    // Create an ArrayList with test data
    ArrayList<String> list = new ArrayList();
    list.add("Zakuski");
    list.add("Pervie Blyuda");
    list.add("Vtorie Blyuda");
    list.add("Desert");
    pageContext.setAttribute("razdely", list);
%>

<html>

<head>
    <title>Books Page</title>

    <style type="text/css">
        .tg {
            width: 1200px;
            border-collapse: collapse;
            border-spacing: 0;
            border-color: #ccc;
        }

        .tg td {
            font-family: Arial, sans-serif;
            font-size: 14px;
            padding: 10px 5px;
            border-style: solid;
            border-width: 1px;
            overflow: hidden;
            word-break: normal;
            border-color: #ccc;
            color: #333;
            background-color: #fff;
        }

        .tg th {
            font-family: Arial, sans-serif;
            font-size: 14px;
            font-weight: normal;
            padding: 10px 5px;
            border-style: solid;
            border-width: 1px;
            overflow: hidden;
            word-break: normal;
            border-color: #ccc;
            color: #333;
            background-color: #f0f0f0;
        }

        .tg .tg-4eph {
            background-color: #f9f9f9
        }
    </style>
</head>
<body style="background: url(/№1.jpg)">
<%--<table style="background: white;">--%>
<%--&lt;%&ndash;<a href="../../index.jsp">Back to main menu</a>&ndash;%&gt;--%>
<c:import url="/WEB-INF/pages/header.jsp"></c:import>
<%--&lt;%&ndash;<table style="background: url(/WEB-INF/texture3.jpg)">&ndash;%&gt;--%>
<%--</table>--%>
<table style="background: url(/texture3.jpg); width:1200px" align="center">

    <br/>
    <br/>
    <table class="tg">

        <h1>Menu</h1>

        <c:if test="${!empty listBlyd}">

            <tr>
                <th width="80">ID</th>
                <th width="120">Nazvznie</th>
                <th width="120">Kategoriya</th>
                <th width="120">Stoimost</th>
                <th width="60">Ves</th>
                <th width="60">Edit</th>
                <th width="60">Delete</th>
            </tr>
            <c:forEach items="${listBlyd}" var="blydo">
                <tr>
                    <td>${blydo.idblydo}</td>
                    <td><a href="/blydodata/${blydo.idblydo}" target="_blank">${blydo.nazvanie}</a></td>
                    <td>${blydo.kategoriya}</td>
                        <%--<td>${blydo.stoimost/100}${blydo.stoimost%100}</td>--%>
                    <td>${blydo.stoimost}</td>
                    <td>${blydo.ves}</td>
                    <td><a href="<c:url value='/blydoedit/${blydo.idblydo}'/>">Edit</a></td>
                    <td><a href="<c:url value='/blydoremove/${blydo.idblydo}'/>">Delete</a></td>
                </tr>
            </c:forEach>
        </c:if>
    </table>


    <%--<h1>Add a Book</h1>--%>

    <%--<c:url var="addAction" value="/books/add"/>--%>

    <%--<form:form action="${addAction}" commandName="book">--%>
    <%--<table>--%>
    <%--<c:if test="${!empty book.bookTitle}">--%>
    <%--<tr>--%>
    <%--<td>--%>
    <%--<form:label path="id">--%>
    <%--<spring:message text="ID"/>--%>
    <%--</form:label>--%>
    <%--</td>--%>
    <%--<td>--%>
    <%--<form:input path="id" readonly="true" size="8" disabled="true"/>--%>
    <%--<form:hidden path="id"/>--%>
    <%--</td>--%>
    <%--</tr>--%>
    <%--</c:if>--%>
    <%--<tr>--%>
    <%--<td>--%>
    <%--<form:label path="bookTitle">--%>
    <%--<spring:message text="Title"/>--%>
    <%--</form:label>--%>
    <%--</td>--%>
    <%--<td>--%>
    <%--<form:input path="bookTitle"/>--%>
    <%--</td>--%>
    <%--</tr>--%>
    <%--<tr>--%>
    <%--<td>--%>
    <%--<form:label path="bookAuthor">--%>
    <%--<spring:message text="Author"/>--%>
    <%--</form:label>--%>
    <%--</td>--%>
    <%--<td>--%>
    <%--<form:input path="bookAuthor"/>--%>
    <%--</td>--%>
    <%--</tr>--%>
    <%--<tr>--%>
    <%--<td>--%>
    <%--<form:label path="price">--%>
    <%--<spring:message text="Price"/>--%>
    <%--</form:label>--%>
    <%--</td>--%>
    <%--<td>--%>
    <%--<form:input path="price"/>--%>
    <%--</td>--%>
    <%--</tr>--%>
    <%--<tr>--%>
    <%--<td colspan="2">--%>
    <%--<c:if test="${!empty book.bookTitle}">--%>
    <%--<input type="submit"--%>
    <%--value="<spring:message text="Edit Book"/>"/>--%>
    <%--</c:if>--%>
    <%--<c:if test="${empty book.bookTitle}">--%>
    <%--<input type="submit"--%>
    <%--value="<spring:message text="Add Book"/>"/>--%>
    <%--</c:if>--%>
    <%--</td>--%>
    <%--</tr>--%>
    <%--</table>--%>
    <%--</form:form>--%>
</table>
</body>
</html>