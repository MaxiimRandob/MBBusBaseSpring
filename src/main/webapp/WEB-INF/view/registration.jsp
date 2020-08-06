<%@include file="/WEB-INF/view/template/header.jsp"%>

<div class="container-wrapper">
    <div class="container">
        <div id="login-box">


            <h2> Registration page </h2>



            <form:form class="text-left" action="registration" method="post" modelAttribute="registrationForm">
            											<div class="form-group">
                                                            <label for="first_name" class="form-label-outside"><spring:message code="first.name"/></label>
                                                            <form:input  path="first_name" type="text" name="first-name" data-constraints="@Required" class="form-control"/>
                                                            <form:errors path="first_name" />
            											</div>
            											<div class="form-group">
                                                            <label for="second_name" class="form-label-outside"><spring:message code="second.name"/></label>
                                                            <form:input path="last_name" type="text" name="last-name" data-constraints="@Required" class="form-control"/>
                                                            <form:errors path="last_name" />
            											</div>
            											<div class="form-group offset-top-18">
                                                            <label for="login" class="form-label-outside"><spring:message code="email"/></label>
                                                            <form:input path="login" type="text" name="login" data-constraints="@Required" class="form-control"/>
                                                            <form:errors path="login" />
                                                        </div>
                                                        <div class="form-group offset-top-18">
                                                            <label for="email" class="form-label-outside"><spring:message code="email"/></label>
                                                            <form:input path="email" type="text" name="email" data-constraints="@Email @Required" class="form-control"/>
                                                            <form:errors path="email" />
                                                        </div>
                                                        <div class="form-group offset-top-18">
                                                            <label for="password" class="form-label-outside"><spring:message code="password"/></label>
                                                            <form:input type="password" path="password" name="password" data-constraints="@Required" class="form-control"/>
                                                            <form:errors path="password" />
                                                        </div>
            											<div class="form-group offset-top-18">
                                                            <label for="password_confirm" class="form-label-outside"><spring:message code="confirm.password"/></label>
                                                            <form:input  path="password_confirm" type="password" name="password" data-constraints="@Required" class="form-control"/>
                                                            <form:errors path="password_confirm" />
            											</div>
                                                        <div class="offset-top-18 text-center">
                                                            <button type="submit" class="btn btn-primary"><spring:message code="register"/></button>
                                                        </div>
                                                    </form:form>
 </div>
    </div>
</div>


<%@include file="/WEB-INF/view/template/footer.jsp" %>