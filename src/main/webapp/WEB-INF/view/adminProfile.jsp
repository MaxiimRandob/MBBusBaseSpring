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

<h1>ADMIN PROFILE</h1>


                    <h5>Edit profile</h5>
                    <hr>
                    <form:form data-form-output="form-output-global" data-form-type="contact" method="post" action="profile" modelAttribute="profileForm">
                          <div class="range">
                            <div class="cell-sm-6">
                              <div class="form-group offset-top-18">
                                <label for="first_name" class="form-label-outside"></label>
                                <form:input  path="first_name" value="${currentUser.firstName}" type="text" name="first-name" data-constraints="@Required" class="form-control"/>
                                <form:errors path="first_name" />
                              </div>
                            </div>
                            <div class="cell-sm-6 offset-top-18 offset-sm-top-0">
                              <div class="form-group offset-top-18">
                                <label for="last_name" class="form-label-outside"></label>
                                <form:input path="last_name" value="${currentUser.lastName}" type="text" name="last-name" data-constraints="@Required" class="form-control"/>
                                <form:errors path="last_name" />
                              </div>
                            </div>
                            <div class="cell-sm-6 offset-top-18">
                              <div class="form-group offset-top-18">
                                <label for="login" class="form-label-outside"></label>
                                <form:input path="login" value="${currentUser.login}" type="text" name="login" data-constraints="@Required @Email" class="form-control"/>
                                <form:errors path="login" />
                              </div>
                            </div>

                              <div class="offset-top-18 text-center">
                                <button type="submit" class="btn btn-primary"></button>
                              </div>
                            </div>
                          </div>
                    </form:form>



<a href = "route-list"> Routes </a>
<br>
<a href = "adminDrivers"> Drivers </a>


<%@include file="/WEB-INF/view/template/footer.jsp" %>