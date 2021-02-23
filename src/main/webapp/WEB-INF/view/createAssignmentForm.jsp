<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>

<html class="wide wow-animation">

<head>
    <c:import url="head-part.jsp" />
    <title>AutoPark management system</title>

</head>

<body>

    <div class="container-wrapper">
        <div class="container">
            <section class="section-10 section-sm-top-10">
                <div class="shell">
                    <div class="range range-sm-center">
                        <div class="cell-sm-6 cell-md-5 cell-lg-4">
                            <div
                                class="responsive-tabs responsive-tabs-default responsive-tabs-horizontal responsive-tabs-silver-chalice">

                                <div class="resp-tabs-container offset-top-40">

                                    <div class="resp-tabs-container offset-top-40">

                                        <div class="offset-top-25">

                                            <form:form class="text-left" action="createAssignmentForm" method="post"
                                                modelAttribute="createAssignmentForm">

                                               <div class="form-group offset-top-18">
                                                    <label for="driverId" class="form-label-outside">Driver</label>
                                                    <form:select path="driverId" type="text" name="driverId"
                                                        data-constraints="@Required" class="form-control">
                                                        <c:forEach items="${drivers}" var="driver">
                                                            <form:option value="${driver.id}">${driver.login}</form:option>
                                                        </c:forEach>
                                                    </form:select>

                                                </div>
                                                <div class="form-group offset-top-18">
                                                    <label for="busId" class="form-label-outside">Bus</label>
                                                    <form:select path="busId" type="text" name="busId"
                                                        data-constraints="@Required" class="form-control">
                                                        <c:forEach items="${buses}" var="bus">
                                                            <form:option value="${bus.id}">${bus.name}</form:option>
                                                        </c:forEach>
                                                    </form:select>

                                                </div>
                                                <div class="form-group offset-top-18">
                                                    <label for="routeId" class="form-label-outside">Route</label>
                                                    <form:select path="routeId" type="text" name="routeId"
                                                        data-constraints="@Required" class="form-control">
                                                        <c:forEach items="${routes}" var="route">
                                                            <form:option value="${route.id}">${route.name}</form:option>
                                                        </c:forEach>
                                                    </form:select>

                                                </div>

                                                <div class="offset-top-18 text-center">
                                                    <button type="submit" class="btn btn-primary">Create</button>
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


    <%@include file="/WEB-INF/view/template/footer.jsp" %>