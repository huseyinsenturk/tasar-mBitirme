<!DOCTYPE html>
<html xmlns:c="http://www.w3.org/1999/XSL/Transform">
<%@include file="head.jsp"%>

<body>
<!-- Form area -->
<div class="admin-form">
    <div class="container">

        <div class="row">
            <div class="col-md-12">
                <!-- Widget starts -->
                <div class="widget worange">
                    <!-- Widget head -->
                    <div class="widget-head">
                        <i class="fa fa-lock"></i> Login
                    </div>

                    <div class="widget-content">
                        <div class="padd">
                            <!-- Login form -->
                            <form class="form-horizontal" method="post" action="/login">
                                <!-- Email -->
                                <div class="form-group">
                                    <label class="control-label col-lg-3" for="inputEmail">Login</label>
                                    <div class="col-lg-9">
                                        <input name="username" type="text" class="form-control" id="inputEmail" placeholder="Login">
                                    </div>
                                </div>
                                <!-- Password -->
                                <div class="form-group">
                                    <label class="control-label col-lg-3" for="inputPassword">Password</label>
                                    <div class="col-lg-9">
                                        <input name="password" type="password" class="form-control" id="inputPassword" placeholder="Password">
                                    </div>
                                </div>
                                <!-- Remember me checkbox and sign in button -->
                                <div class="form-group">
                                    <div class="col-lg-9 col-lg-offset-3">
                                        <div class="checkbox">
                                            <label>
                                                <input name="remember-me" type="checkbox"> Remember Me
                                            </label>
                                        </div>
                                    </div>
                                </div>

                                <c:if test="${not empty param.error}">
                                    <div class="form-group">
                                        <div class="alert-danger aligncenter text-center">
                                            Invalid Login or Password
                                        </div>
                                    </div>
                                </c:if>
                                <c:if test="${not empty param.logout}">
                                    <div class="form-group">
                                        <div class="alert-success aligncenter text-center">
                                            You have successfully logged out
                                        </div>
                                    </div>
                                </c:if>

                                <div class="col-lg-9 col-lg-offset-3">
                                    <button id="loginSubmitBtn" type="submit" class="btn btn-info btn-sm">Log In</button>
                                    <button type="reset" class="btn btn-default btn-sm">Reset</button>
                                </div>
                                <br />
                            </form>

                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<%@include file="scripts.jsp"%>
</body>
</html>