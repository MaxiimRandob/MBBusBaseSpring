<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>

<html>

<head>
    <c:import url="head-part.jsp" />
    <title>AutoPark management system</title>

</head>

<body>

    <h1>ASSIGNMENT DETAILS</h1>

    <c:url var="Delete" value="assignmentAdminDetails/delete">
        <c:param name="assignmentId" value="${assignment.id}" />
    </c:url>
    <c:url var="Confirm" value="assignmentAdminDetails/confirm">

       <c:param name="assignmentId" value="${assignment.id}" />
    </c:url>

    <table class="table table-primary table-striped-variant-1">
        <thead>
            <tr>
                <th>
                    Driver login
                </th>
                <th>
                    Bus
                </th>
                <th>
                    Route
                </th>
                <th>
                    Status
                </th>
            </tr>
        </thead>
        <tbody>

            <tr>
                <td>${assignment.driver.login}</td>
                <td>${assignment.bus.name}</td>
                <td>${assignment.route.name}</td>
                <td>${assignment.status}</td>
            </tr>

        </tbody>
    </table>

    <a href="${Delete}">Delete</a>
    <br>
    <a href="${Confirm}">Confirm</a>

    <%@include file="/WEB-INF/view/template/footer.jsp" %>