<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>

<html>
<head>
    <c:import url="head-part.jsp"/>
    <title>AutoPark management system</title>

</head>

<div class="container-wrapper">
    <div class="container">
        <div id="login-box">


            <h2> Registration page </h2>
            <section class="section-10 section-sm-top-10">
                <div class="shell">
                    <div class="range range-sm-center">
                        <div class="cell-sm-6 cell-md-5 cell-lg-4">
                            <div class="responsive-tabs responsive-tabs-default responsive-tabs-horizontal responsive-tabs-silver-chalice">

                                <div class="resp-tabs-container offset-top-40">

                                    <div class="resp-tabs-container offset-top-40">

                                        <div class="offset-top-25">

                                            <form:form class="text-left" action="registration" method="post" modelAttribute="registrationForm">
                                                <div class="form-group">
                                                    <label for="first_name" class="form-label-outside">First Name</label>
                                                    <form:input path="first_name" type="text" name="first-name"
                                                        data-constraints="@Required" class="form-control" />
                                                    <form:errors path="first_name" />
                                                </div>
                                                <div class="form-group">
                                                    <label for="second_name" class="form-label-outside">Last Name</label>
                                                    <form:input path="second_name" type="text" name="second_name-name"
                                                        data-constraints="@Required" class="form-control" />
                                                    <form:errors path="second_name" />
                                                </div>
                                                <div class="form-group offset-top-18">
                                                    <label for="login" class="form-label-outside">Login</label>
                                                    <form:input path="login" type="text" name="login"
                                                        data-constraints="@Required" class="form-control" />
                                                    <form:errors path="login" />
                                                </div>
                                                <div class="form-group offset-top-18">
                                                    <label for="email" class="form-label-outside">Email</label>
                                                    <form:input path="email" type="text" name="email"
                                                        data-constraints="@Email @Required" class="form-control" />
                                                    <form:errors path="email" />
                                                </div>
                                                <div class="form-group offset-top-18">
                                                    <label for="password" class="form-label-outside">Password</label>
                                                    <form:input type="password" path="password" name="password"
                                                        data-constraints="@Required" class="form-control" />
                                                    <form:errors path="password" />
                                                </div>
                                                <div class="form-group offset-top-18">
                                                    <label for="password_confirm" class="form-label-outside">Confirm password</label>
                                                    <form:input path="password_confirm" type="password" name="password"
                                                        data-constraints="@Required" class="form-control" />
                                                    <form:errors path="password_confirm" />
                                                </div>
                                                <div class="offset-top-18 text-center">
                                                    <button type="submit" class="btn btn-primary">Register </button>
                                                </div>
                                            </form:form>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </section>
        </div>
    </div>
</div>

<%@include file="/WEB-INF/view/template/footer.jsp" %>