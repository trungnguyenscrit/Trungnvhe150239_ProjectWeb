 
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <!-- Favicon icon -->
        <link rel="icon" type="image/png" sizes="16x16" href="${pageContext.request.contextPath}/admin/images/mi.png">
        <!-- Custom Stylesheet -->
        <link href="${pageContext.request.contextPath}/admin/css/style.css" rel="stylesheet">

    </head>
    <body>

        <!--*******************
            Preloader start
        ********************-->
        <div id="preloader">
            <div class="loader">
                <svg class="circular" viewBox="25 25 50 50">
                <circle class="path" cx="50" cy="50" r="20" fill="none" stroke-width="3" stroke-miterlimit="10" />
                </svg>
            </div>
        </div>
        <!--*******************
            Preloader end
        ********************-->


        <!--**********************************
           Main wrapper start
       ***********************************-->
        <div id="main-wrapper">

            <!--**********************************
                Nav header start
            ***********************************-->
            <div class="nav-header">
                <div class="brand-logo">
                    <a href="index.html">
                        <b class="logo-abbr"><img src="${pageContext.request.contextPath}/admin/images/logo.png" alt=""> </b>
                        <span class="logo-compact"><img src="${pageContext.request.contextPath}/admin/images/logo-compact.png" alt=""></span>
                        <span class="brand-title">
                            <img src="${pageContext.request.contextPath}/admin/images/mi.png" alt="">
                        </span>
                    </a>
                </div>
            </div>
            <!--**********************************
                Nav header end
            ***********************************-->

            <!--**********************************
                Header start
            ***********************************-->
            <div class="header">
                <div class="header-content clearfix">

                    <div class="nav-control">
                        <div class="hamburger">
                            <span class="toggle-icon"><i class="icon-menu"></i></span>
                        </div>
                    </div>
                    <div class="header-left">
                    </div>
                    <div class="header-right">
                        <ul class="clearfix">
                            <li class="icons dropdown">
                                <div class="user-img c-pointer position-relative" data-toggle="dropdown">
                                    <span class="activity active"></span>
                                    <img src="${pageContext.request.contextPath}/admin/images/users/trung.jpg" height="40" width="40" alt="">
                                </div>
                                <div class="drop-down dropdown-profile animated fadeIn dropdown-menu">
                                    <div class="dropdown-content-body">
                                        <ul>
                                            <li><a href="${pageContext.request.contextPath}/admin/login.html"><i class="icon-key"></i> <span>Logout</span></a>
                                            </li>
                                        </ul>
                                    </div>
                                </div>
                            </li>
                        </ul>
                    </div>
                </div>
            </div>
            <!--**********************************
                Header end ti-comment-alt
            ***********************************-->

            <!--**********************************
                Sidebar start
            ***********************************-->
            <div class="nk-sidebar">
                <div class="nk-nav-scroll">
                    <ul class="metismenu" id="menu">
                        <li class="nav-label">Tổng quan</li>
                        <li class="nav-label">Bài Hát </li>
                        <li>
                            <a class="has-arrow" href="javascript:void()" aria-expanded="false">
                                <i class="icon-note menu-icon"></i><span class="nav-text">Bài Hát</span>
                            </a>
                            <ul aria-expanded="false">
                                <li><a href="${pageContext.request.contextPath}/music/song/list">Danh sách bài hát</a></li>
                                <li><a href="${pageContext.request.contextPath}/admin/newsong.jsp">Thêm mới</a></li>
                                <li><a href="${pageContext.request.contextPath}/music/song/update">Cập nhật</a></li>
                            </ul>
                        </li>
                        <li class="nav-label">THỂ LOẠI</li>
                        <li>
                            <a class="has-arrow" href="javascript:void()" aria-expanded="false">
                                <i class="icon-menu menu-icon"></i><span class="nav-text">Thể Loại</span>
                            </a>
                            <ul aria-expanded="false">
                                <li><a href="${pageContext.request.contextPath}/music/genre/list" aria-expanded="false">Danh sách thể loại</a></li>
                                <li><a href="${pageContext.request.contextPath}/music/genre/insert">Thêm mới</a></li>
                                <li><a href="${pageContext.request.contextPath}/music/genre/update">Cập nhật</a></li>
                            </ul>
                        </li>
                        <li class="nav-label">CA SĨ</li>
                        <li>
                            <a class="has-arrow" href="javascript:void()" aria-expanded="false">
                                <i class="icon-notebook menu-icon"></i><span class="nav-text">Ca Sĩ</span>
                            </a>
                            <ul aria-expanded="false">
                                <li><a href="${pageContext.request.contextPath}/music/singer/list">Danh sách ca sĩ</a></li>
                             <li><a href="${pageContext.request.contextPath}/music/singer/insert">Thêm mới</a></li> 
                             <li><a href="${pageContext.request.contextPath}/music/singer/update">Cập nhật</a></li>
                            </ul>
                        </li>
                        <li>
                            <a class="has-arrow" href="javascript:void()" aria-expanded="false">
                                <i class="icon-notebook menu-icon"></i><span class="nav-text">User</span>
                            </a>
                            <ul aria-expanded="false">
                                <li><a href="./staff-list.html">Danh sách User</a></li>
                                <!-- <li><a href="./page-register.html">Thêm danh sách User mới</a></li> -->
                            </ul>
                        </li>


                </div>
            </div>
            <!--**********************************
                Sidebar end
            ***********************************-->

            <!--**********************************
                Content body start
            ***********************************-->
            <div class="content-body">

                <div class="row page-titles mx-0">
                    <div class="col p-md-0">
                        <ol class="breadcrumb">
                            <li class="breadcrumb-item"><a href="javascript:void(0)">Tổng quan</a></li>
                            <li class="breadcrumb-item active"><a href="javascript:void(0)">Thêm mới</a></li>
                        </ol>
                    </div>
                </div>
                <!-- row -->

                <div class="container-fluid">
                    <div class="row justify-content-center">
                        <div class="col-lg-12">
                            <div class="card">
                                <div class="card-body">
                                    <div class="form-validation">
                                        <form class="form-valide" action="insert" method="POST" runat="server">
                                            <div class="form-group row">
                                                <label class="col-lg-4 col-form-label" for="val-username">ID_Genre <span class="text-danger">*</span>
                                                </label>
                                                <div class="col-lg-6">
                                                    <input type="text" class="form-control" id="val-username" name="id_genre" >
                                                </div>
                                            </div>
                                            <div class="form-group row">
                                                <label class="col-lg-4 col-form-label" for="val-username">Name <span class="text-danger">*</span>
                                                </label>
                                                <div class="col-lg-6">
                                                    <input type="text" class="form-control" id="val-username" name="name_genre" >
                                                </div>
                                            </div>

                                            <div class="form-group row">
                                                <div class="col-lg-8 ml-auto">
                                                    <button type="submit" class="btn btn-primary">SAVE</button>
                                                </div>
                                            </div>
                                        </form>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <!-- #/ container -->
            </div>
            <!--**********************************
                Content body end
            ***********************************-->


            <!--**********************************
                Footer start
            ***********************************-->
            <div class="footer">
                <div class="copyright">
                    <p>Copyright &copy; Designed & Developed by <a href="https://themeforest.net/user/quixlab">Quixlab</a> 2018</p>
                </div>
            </div>
            <!--**********************************
                Footer end
            ***********************************-->
        </div>
        <!--**********************************
            Main wrapper end
        ***********************************-->

        <!--**********************************
            Scripts
        ***********************************-->
        <script src="${pageContext.request.contextPath}/admin/plugins/common/common.min.js"></script>
        <!--image code show-->
        <!------>
        <script src="${pageContext.request.contextPath}/admin/js/custom.min.js"></script>
        <script src="${pageContext.request.contextPath}/admin/js/settings.js"></script>
        <script src="${pageContext.request.contextPath}/admin/js/gleek.js"></script>
        <script src="${pageContext.request.contextPath}/admin/js/styleSwitcher.js"></script>

        <script src="${pageContext.request.contextPath}/admin/plugins/validation/jquery.validate.min.js"></script>
        <script src="${pageContext.request.contextPath}/admin/plugins/validation/jquery.validate-init.js"></script>

    </body>
</html>