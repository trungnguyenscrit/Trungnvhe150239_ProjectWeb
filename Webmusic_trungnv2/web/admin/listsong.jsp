
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <!--         Favicon icon -->
        <link rel="icon" type="image/png" sizes="16x16" href="${pageContext.request.contextPath}/admin/images/mi.png">
        <!--Pignose Calender--> 
        <link href="${pageContext.request.contextPath}/admin/plugins/pg-calendar/css/pignose.calendar.min.css" rel="stylesheet">
        <!--Chartist--> 
        <link rel="stylesheet" href="${pageContext.request.contextPath}/admin/plugins/chartist/css/chartist.min.css">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/admin/plugins/chartist-plugin-tooltips/css/chartist-plugin-tooltip.css">
        <!--Custom Stylesheet--> 
        <link href="${pageContext.request.contextPath}/admin/css/style.css" rel="stylesheet">
        <script>
            function doUpdate(id_song)
            {
                window.location.href = "update?id_song=" + id_song;
            }
            function doDelete(id_song)
            {
                var c = confirm("are you sure?");
                if (c)
                {
                    window.location.href = "delete?id_song=" + id_song;
                }
            }

        </script>
    </head>
    <body>
        <!--        *******************
                    Preloader start
                ********************-->
        <div id="preloader">
            <div class="loader">
                <svg class="circular" viewBox="25 25 50 50">
                <circle class="path" cx="50" cy="50" r="20" fill="none" stroke-width="3" stroke-miterlimit="10" />
                </svg>
            </div>
        </div>
        <!--        *******************
                    Preloader end
                ********************
            
            
                **********************************
                Main wrapper start
            ***********************************-->
        <div id="main-wrapper">
            <!--
                    **********************************
                        Nav header start
                    ***********************************-->
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
            <!--        **********************************
                        Nav header end
                    ***********************************
            
                    **********************************
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
                                            <li><a href="${pageContext.request.contextPath}/music/logout"><i class="icon-key"></i> <span>Logout</span></a></li>
                                        </ul>
                                    </div>
                                </div>
                            </li>
                        </ul>
                    </div>
                </div>
            </div>
            <!--        **********************************
                        Header end ti-comment-alt
                    ***********************************
            
                    **********************************
                        Sidebar start
                    ***********************************-->
            <div class="nk-sidebar">
                <div class="nk-nav-scroll">
                    <ul class="metismenu" id="menu">
                        <li class="nav-label">T???ng quan</li>
                        <li class="nav-label">B??i H??t </li>
                        <li>
                            <a class="has-arrow" href="javascript:void()" aria-expanded="false">
                                <i class="icon-note menu-icon"></i><span class="nav-text">B??i H??t</span>
                            </a>
                            <ul aria-expanded="false">
                                <li><a href="${pageContext.request.contextPath}/music/song/list">Danh s??ch b??i h??t</a></li>
                                <li><a href="${pageContext.request.contextPath}/music/song/insert">Th??m m???i</a></li>
                                <li><a href="${pageContext.request.contextPath}/music/song/update">C???p nh???t</a></li>
                            </ul>
                        </li>
                        <li class="nav-label">TH??? LO???I</li>
                        <li>
                            <a class="has-arrow" href="javascript:void()" aria-expanded="false">
                                <i class="icon-menu menu-icon"></i><span class="nav-text">Th??? Lo???i</span>
                            </a>
                            <ul aria-expanded="false">
                                <li><a href="${pageContext.request.contextPath}/music/genre/list" aria-expanded="false">Danh s??ch th??? lo???i</a></li>
                                <li><a href="${pageContext.request.contextPath}/music/genre/insert">Th??m m???i</a></li>
                                <li><a href="${pageContext.request.contextPath}/music/genre/update">C???p nh???t</a></li>
                            </ul>
                        </li>
                        <li class="nav-label">CA S?? </li>
                        <li>
                            <a class="has-arrow" href="javascript:void()" aria-expanded="false">
                                <i class="icon-notebook menu-icon"></i><span class="nav-text">Ca S??</span>
                            </a>
                            <ul aria-expanded="false">
                                <li><a href="${pageContext.request.contextPath}/music/singer/list">Danh s??ch ca s??</a></li>
                                <li><a href="${pageContext.request.contextPath}/music/singer/insert">Th??m m???i</a></li> 
                                <li><a href="${pageContext.request.contextPath}/music/singer/update">C???p nh???t</a></li>
                            </ul>
                        </li>
                        <li class="nav-label">ALBUM</li>
                        <li>
                            <a class="has-arrow" href="javascript:void()" aria-expanded="false">
                                <i class="icon-notebook menu-icon"></i><span class="nav-text">Album</span>
                            </a>
                            <ul aria-expanded="false">
                                <li><a href="${pageContext.request.contextPath}/music/songwithalbum/list">Danh s??ch Album</a></li>
                                <li><a href="${pageContext.request.contextPath}/music/songwithalbum/insert">Th??m m???i</a></li> 
                                <li><a href="${pageContext.request.contextPath}/music/songwithalbum/update">C???p nh???t</a></li>
                            </ul>
                        </li>
                        <li class="nav-label">User</li>
                        <li>
                            <a class="has-arrow" href="javascript:void()" aria-expanded="false">
                                <i class="icon-notebook menu-icon"></i><span class="nav-text">User</span>
                            </a>
                            <ul aria-expanded="false">
                                <li><a href="${pageContext.request.contextPath}/music/user/list">Danh s??ch User</a></li>
                                <li><a href="${pageContext.request.contextPath}/music/user/insert">Th??m m???i</a></li> 
                            </ul>
                        </li>
                        <li>
                            <a class="has-arrow" href="javascript:void()" aria-expanded="false">
                                <i class="icon-notebook menu-icon"></i><span class="nav-text">Playlist</span>
                            </a>
                            <ul aria-expanded="false">
                                <li><a href="${pageContext.request.contextPath}/music/playlist/list">Danh s??ch Playlist</a></li>
                                <li><a href="${pageContext.request.contextPath}/music/playlist/insert">Th??m m???i</a></li> 
                                <li><a href="${pageContext.request.contextPath}/music/playlist/update">C???p nh???t</a></li>
                            </ul>
                        </li>


                </div>
            </div>
            <!--        **********************************
                        Sidebar end
                    ***********************************
                    **********************************
                        Content body start
                    ***********************************-->
            <div class="content-body">

                <div class="row page-titles mx-0">
                    <div class="col p-md-0">
                        <ol class="breadcrumb">
                            <li class="breadcrumb-item"><a href="index.html">T???ng quan</a></li>
                            <li class="breadcrumb-item active"><a href="product-list.html">Danh s??ch b??i h??t</a></li>
                        </ol>
                    </div>
                </div>


                <div class="container-fluid">
                    <div class="row">
                        <div class="col-12">
                            <div class="card">
                                <div class="card-body">
                                    <h4 class="card-title">Qu???n l?? b??i h??t</h4>
                                    <div class="table-responsive">
                                        <table class="table table-striped table-bordered zero-configuration">
                                            <thead>
                                                <tr>
                                                    <th>ID_Song</th>
                                                    <th>NAME</th>
                                                    <th>Poster</th>
                                                    <th>LinkSong</th>
                                                    <th>Description</th>
                                                    <th>Singer</th>
                                                    <th>Genre</th>
                                                    <td></td>
                                                    <td></td>
                                                </tr>
                                            </thead>

                                            <tbody>
                                                <c:forEach items="${requestScope.songs}" var="s">
                                                    <tr>
                                                        <th>${s.id_song}</th>
                                                        <th>${s.name}</th>
                                                        <th><img style="width: 80px;height: 80px;  " 
                                                                 src="${pageContext.request.contextPath}/image/postersinger/${s.poster}" alt=""></th>
                                                        <th>${s.linksong}</th>
                                                        <th>${s.description}</th>
                                                        <th><c:forEach items="${s.singers}" var="si">
                                                                ${si.name} <br/>
                                                            </c:forEach>   </th>
                                                        <th><c:forEach items="${s.genres}" var="g">
                                                                ${g.name_genre} <br/>
                                                            </c:forEach> </th>
                                                        <td>
                                                            <input type="button" onclick="doUpdate('${s.id_song}');" value="Update"/>
                                                        </td>
                                                        <td>
                                                            <input type="button" onclick="doDelete('${s.id_song}');" value="Delete"/>
                                                        </td>
                                                    </tr>
                                                </c:forEach>
                                            </tbody>
                                            <!--                                            add sp 
                                                                                     foot -->
                                        </table>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <!--             #/ container -->
            </div>
            <!--        **********************************
                        Content body end
                    ***********************************
                    
                    
                    **********************************
                        Footer start
                    ***********************************-->
            <div class="footer">
                <div class="copyright">
                    <p>Copyright &copy; Designed & Developed by Trung Nguy???n . Thanks to <a href="https://themeforest.net/user/quixlab">Quixlab</a></p>
                </div>
            </div>
            <!--        **********************************
                        Footer end
                    ***********************************-->
        </div>
        <!--    **********************************
                Main wrapper end
            ***********************************
        
            **********************************
                Scripts
            ***********************************-->
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
