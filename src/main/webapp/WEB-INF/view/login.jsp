<%@include file="/WEB-INF/view/template/header.jsp"%>

<div class="container-wrapper">
    <div class="container">
        <div id="login-box">


            <h2> Login page </h2>

            <c:if test="${not empty msg}">
                <div class="msg">${msg}</div>
            </c:if>

            <form name="loginForm" action="${pageContext.request.contextPath}/login"  method="post">

                  <c:if test="${param.error != null}">
                      <div class="error" style="color: #ff0000"><fmt:message key = "login.error.bad.cre dentials"/></div>
                  </c:if>


                 <div class="form-group">
                     <label for="username"> user login </label>
                     <input type="text" id="username" name="username" class="form-control" />
                 </div>

                <div class="form-group">
                    <label for="password"> password </label>
                    <input type="password" id="password" name="password" class="form-control" />
                </div>

                <input type="submit" value=Submit button class="btn btn-default">


                </form>
 </div>
    </div>
</div>


<%@include file="/WEB-INF/view/template/footer.jsp" %>