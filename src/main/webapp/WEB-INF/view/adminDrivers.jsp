<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>

<html>
<head>
    <c:import url="head-part.jsp"/>
    <title>AutoPark management system</title>

</head>
<body>

<h1>List of drivers</h1>


<table class="table table-primary table-striped-variant-1">
<thead>
    <tr>
        <th>
            First name
        </th>
        <th>
            Last name
        </th>
        <th>
            Bus Name
        </th>
        <th>
            Route
        </th>
    </tr>
</thead>
<tbody>
    <c:forEach items="${drivers}" var="driver">
        <tr>
            <td>${driver.firstName}</td>
            <td>${driver.lastName}</td>
            <td>${driver.bus.name}</td>
            <td>${driver.bus.route.name}</td>
        </tr>
    </c:forEach>
</tbody>
</table>

<%@include file="/WEB-INF/view/template/footer.jsp" %>