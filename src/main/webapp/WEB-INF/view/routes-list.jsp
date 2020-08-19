<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>

<html>

<head>
  <c:import url="head-part.jsp" />
  <title>AutoPark management system</title>

</head>

<body>

  <div class="page">
    <section class="section-top-20 section-sm-top-40 section-sm-bottom-110">
      <div class="shell">
        <div class="range">
          <div class="cell-md-10 cell-lg-12">


            <div class="offset-top-32">
              <div data-type="accordion" class="responsive-tabs responsive-tabs-horizontal">
                <div class="resp-tabs-container">
                  <div class="animated fadeIn">
                    <section class="section-top-20 section-sm-top-20">
                      <div class="shell">
                        <div class="range">
                          <div class="cell-md-10 cell-lg-12">
                            <div class="offset-top-32">
                              <div class="table-mobile">
                                <table class="table table-primary table-striped-variant-1">
                                  <thead>
                                    <tr>
                                      <th>
                                        Name
                                      </th>
                                      <th>
                                        Attached buses
                                      </th>
                                    </tr>
                                  </thead>
                                  <tbody>
                                    <c:forEach items="${routes}" var="route">
                                      <tr>
                                        <td>${route.name}</td>
                                        <td>${route.workLoad}</td>
                                      </tr>
                                    </c:forEach>
                                  </tbody>
                                </table>
                              </div>
                            </div>
                          </div>
                        </div>
                      </div>
                    </section>
                  </div>
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
    </section>

  </div>


  <%@include file="/WEB-INF/view/template/footer.jsp" %>