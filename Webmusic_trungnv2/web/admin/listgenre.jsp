 
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="${pageContext.request.contextPath}/admin/css/style.css" rel="stylesheet">
        <script> 
            function doUpdate(id_genre)
            {
                window.location.href = "update?id_genre=" + id_genre;
            }
            function doDelete(id_genre)
            {
                var c = confirm("are you sure?");
                if(c)
                {
                    window.location.href = "delete?id_genre=" + id_genre;
                }
            }
        
        </script>
    </head>
    <body>
        <div id="preloader">
            <div class="loader">
                <svg class="circular" viewBox="25 25 50 50">
                    <circle class="path" cx="50" cy="50" r="20" fill="none" stroke-width="3" stroke-miterlimit="10" />
                </svg>
            </div>
        </div>
    <div id="main-wrapper">

        <div class="nav-header">
            <div class="brand-logo">
                <a href="index.html">
                    <b class="logo-abbr"><img src="images/logo.png" alt=""> </b>
                    <span class="logo-compact"><img src="./images/logo-compact.png" alt=""></span>
                    <span class="brand-title">
                        <img src="${pageContext.request.contextPath}/admin/images/mi.png" alt="">
                    </span>
                </a>
            </div>
        </div>
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
                                        <li><a href="login.html"><i class="icon-key"></i> <span>Logout</span></a></li>
                                    </ul>
                                </div>
                            </div>
                        </li>
                    </ul>
                </div>
            </div>
        </div>
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
                            <li><a href="${pageContext.request.contextPath}/music/song/insert">Thêm mới</a></li>
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
                    <li class="nav-label">ALBUM</li>
                    <li>
                        <a class="has-arrow" href="javascript:void()" aria-expanded="false">
                            <i class="icon-notebook menu-icon"></i><span class="nav-text">Album</span>
                        </a>
                        <ul aria-expanded="false">
                            <li><a href="${pageContext.request.contextPath}/music/songwithalbum/list">Danh sách Album</a></li>
                             <li><a href="${pageContext.request.contextPath}/music/songwithalbum/insert">Thêm mới</a></li> 
                             <li><a href="${pageContext.request.contextPath}/music/songwithalbum/update">Cập nhật</a></li>
                        </ul>
                    </li>
                    <li class="nav-label">User</li>
                    <li>
                        <a class="has-arrow" href="javascript:void()" aria-expanded="false">
                            <i class="icon-notebook menu-icon"></i><span class="nav-text">User</span>
                        </a>
                        <ul aria-expanded="false">
                            <li><a href="${pageContext.request.contextPath}/music/user/list">Danh sách User</a></li>
                             <li><a href="${pageContext.request.contextPath}/music/user/insert">Thêm mới</a></li> 
                        </ul>
                    </li>


            </div>
        </div>
        <div class="content-body">

            <div class="row page-titles mx-0">
                <div class="col p-md-0">
                    <ol class="breadcrumb">
                        <li class="breadcrumb-item"><a href="index.html">Tổng quan</a></li>
                        <li class="breadcrumb-item active"><a href="bill-list.html">Danh sách thể loại</a></li>
                    </ol>
                </div>
            </div>
            <!-- row -->

            <div class="container-fluid">
                <div class="row">
                    <div class="col-12">
                        <div class="card">
                            <div class="card-body">
                                <h4 class="card-title">Quản lý Thể Loại Nhạc</h4>
                                <div class="table-responsive">
                                    <table class="table table-striped table-bordered zero-configuration">
                                        <thead>
                                            <tr>
                                                <th>id_genre</th>
                                                <th>name_genre</th>
                                                <th></th>
                                                <th></th>
                                            </tr>
                                        </thead>
                                        <tbody>
                                            <c:forEach items="${requestScope.genres}" var="g">
                                            <tr>
                                               <!-- Nhập thông tin hóa đơn -->
                                               <th>${g.id_genre}</th>
                                                <th>${g.name_genre}</th>
                                                <th>
                                                    <input type="button" onclick="doUpdate('${g.id_genre}');" value="Update"/>
                                                </th>
                                                <th>
                                                    <input type="button" onclick="doDelete('${g.id_genre}');" value="Delete"/>
                                                </th>
                                            </tr>
                                            </c:forEach>
                                        </tbody>
                                    </table>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <div class="footer">
            <div class="copyright">
                <p>Copyright &copy; Designed & Developed by Trung Nguyễn</p>
            </div>
        </div>
    </div>
    <script src="${pageContext.request.contextPath}/admin/plugins/common/common.min.js"></script>
    <script src="${pageContext.request.contextPath}/admin/js/custom.min.js"></script>
    <script src="${pageContext.request.contextPath}/admin/js/settings.js"></script>
    <script src="${pageContext.request.contextPath}/admin/js/gleek.js"></script>
    <script src="${pageContext.request.contextPath}/admin/js/styleSwitcher.js"></script>

    <script src="${pageContext.request.contextPath}/admin/plugins/tables/js/jquery.dataTables.min.js"></script>
    <script src="${pageContext.request.contextPath}/admin/plugins/tables/js/datatable/dataTables.bootstrap4.min.js"></script>
    <script src="${pageContext.request.contextPath}/admin/plugins/tables/js/datatable-init/datatable-basic.min.js"></script>

</body>
</html>
