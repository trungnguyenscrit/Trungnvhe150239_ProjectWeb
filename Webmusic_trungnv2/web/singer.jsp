 
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/functions" prefix = "fn" %>
<!DOCTYPE html>

<!--[if IE 8]> <html lang="en" class="ie8 no-js"> <![endif]-->
<!--[if IE 9]> <html lang="en" class="ie9 no-js"> <![endif]-->
<!--[if !IE]><!-->
<html lang="en">
    <!--<![endif]-->
    <!-- Begin Head -->


    <head>
        <title>Miraculous - Online Music Store Html Template</title>
        <meta charset="utf-8">
        <meta content="width=device-width, initial-scale=1.0" name="viewport">
        <meta name="description" content="Music">
        <meta name="keywords" content="">
        <meta name="author" content="kamleshyadav">
        <meta name="MobileOptimized" content="320">
        <!--Start Style -->
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/fonts.css">
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/bootstrap.css">
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/font-awesome.min.css">
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/js/plugins/swiper/css/swiper.min.css">
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/js/plugins/nice_select/nice-select.css">
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/js/plugins/player/volume.css">
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/js/plugins/scroll/jquery.mCustomScrollbar.css">
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/style.css">
        <!-- Favicon Link -->
        <link rel="shortcut icon" type="image/png" href="${pageContext.request.contextPath}/images/favicon.png">
    </head>
    <body>
        <!----Loader---->
        <div class="ms_inner_loader">
            <div class="ms_loader">
                <div class="ms_bars">
                    <div class="bar"></div>				
                    <div class="bar"></div>
                    <div class="bar"></div>
                    <div class="bar"></div>
                    <div class="bar"></div>
                    <div class="bar"></div>
                    <div class="bar"></div>
                    <div class="bar"></div>
                    <div class="bar"></div>
                    <div class="bar"></div>
                </div>
            </div>
        </div>
        <!----Main Wrapper Start---->
        <div class="ms_main_wrapper">
            <!---Side Menu Start--->
            <div class="ms_sidemenu_wrapper">
                <div class="ms_nav_close">
                    <i class="fa fa-angle-right" aria-hidden="true"></i>
                </div>
                <div class="ms_sidemenu_inner">
                    <div class="ms_logo_inner">
                        <div class="ms_logo">
                            <a href="${pageContext.request.contextPath}/home"><img src="${pageContext.request.contextPath}/images/logo.png" alt="" class="img-fluid"/></a>
                        </div>
                        <div class="ms_logo_open">
                            <a href="${pageContext.request.contextPath}/home"><img src="${pageContext.request.contextPath}/images/open_logo.png" alt="" class="img-fluid"/></a>
                        </div>
                    </div>
                    <div class="ms_nav_wrapper">
                        <ul>
                            <li><a href="${pageContext.request.contextPath}/home"  title="Discover">
                                    <span class="nav_icon">
                                        <span class="icon icon_discover"></span>
                                    </span>
                                    <span class="nav_text">
                                        discover
                                    </span>
                                </a>
                            </li>
                            <li><a href="${pageContext.request.contextPath}/album/list" title="Albums">
                                    <span class="nav_icon">
                                        <span class="icon icon_albums"></span>
                                    </span>
                                    <span class="nav_text">
                                        albums
                                    </span>
                                </a>
                            </li>
                            <li><a href="${pageContext.request.contextPath}/singer/list" title="Singers" class="active">
                                    <span class="nav_icon">
                                        <span class="icon icon_artists"></span>
                                    </span>
                                    <span class="nav_text">
                                        Singers
                                    </span>
                                </a>
                            </li>
                            <li><a href="${pageContext.request.contextPath}/genre/list" title="Genres">
                                    <span class="nav_icon">
                                        <span class="icon icon_genres"></span>
                                    </span>
                                    <span class="nav_text">
                                        genres
                                    </span>
                                </a>
                            </li>
                            <li><a href="${pageContext.request.contextPath}/playlist/list" title="Playlists"  >
                                    <span class="nav_icon">
                                        <span class="icon icon_music"></span>
                                    </span>
                                    <span class="nav_text">
                                        Playlists
                                    </span>
                                </a>
                            </li>

                        </ul>
 
                    </div>
                </div>
            </div>
            <!---Main Content Start--->
            <div class="ms_content_wrapper padder_top90">
                <!---Header--->
                <div class="ms_header">
                     
                    <div class="ms_top_right">
                        <div class="ms_top_lang">
                            <c:if test="${sessionScope.user!=null}">
                                <span data-toggle="modal" data-target="#lang_modal"> Hello ${sessionScope.user.email}</span>
                            </c:if>
                        </div>
                        <div class="ms_top_btn">
                            <c:if test="${sessionScope.user!=null}">
                                <a href="user?action=logout" class="ms_btn reg_btn" ><span>Logout</span></a>
                            </c:if>
                            <!---<c:if test="${sessionScope.user==null}">
                            <a href="javascript:;" class="ms_btn reg_btn" data-toggle="modal" data-target="#myModal"><span>register</span></a>
                            <a href="javascript:;" class="ms_btn login_btn" data-toggle="modal" data-target="#myModal1"><span>login</span></a>
                            </c:if>--->
                            ${fn}
                            <c:if test="${fn:toUpperCase(sessionScope.user.role) == 'TRUE'}">
                                <a href="${pageContext.request.contextPath}/admin" class="ms_btn login_btn" ><span>Manager</span></a>
                            </c:if>

                        </div>
                    </div>
                </div>

                <!----Top Singer Section---->
                <div class="ms_top_artist">
                    <div class="container-fluid">
                        <div class="row">
                            <div class="col-lg-12">
                                <div class="ms_heading">
                                    <h1>All Singers</h1>
                                </div>
                            </div>
                            <c:forEach items="${requestScope.singers}" var="si">
                                <div class="col-lg-2 col-md-6">
                                    <div class="ms_rcnt_box marger_bottom30">
                                        <div class="ms_rcnt_box_img">
                                            <img src="${pageContext.request.contextPath}/${si.poster}" alt="" class="img-fluid">

                                        </div>
                                        <div class="ms_rcnt_box_text">
                                            <h3>${si.name}</h3>
                                        </div>
                                    </div>
                                </div>
                            </c:forEach>
                        </div>
                    </div>
                </div>

                <!----Main div close---->
            </div>
            <!----Footer Start---->
            <div class="ms_footer_wrapper">
                <div class="ms_footer_logo">
                </div>
                <div class="ms_footer_wrapper">

                    <div class="ms_footer_inner">
                        <div class="row">
                            <div class="col-lg-3 col-md-6">
                                <div class="footer_box">
                                    <h1 class="footer_title">Milano music stations</h1>
                                    <p>Milano Music l?? web nh???c do Trung Nguy???n t???o tr??n n???n nh???c mp3 mi???n ph?? c???a Youtube, ch??ng t??i t???o ra nh???m m???c ????nh g???i g???m ?????n c??c b???n nh???ng b??i nh???c hay ????? gi??p b???n c???m th???y tho???i m??i sau khi l??m vi???c</p>
                                </div>
                            </div>

                            <div class="col-lg-3 col-md-6">

                            </div>
                            <div class="col-lg-3 col-md-6">
                                <div class="footer_box footer_contacts">
                                    <h1 class="footer_title">contact us</h1>
                                    <ul class="foo_con_info">
                                        <li>
                                            <div class="foo_con_icon">
                                                <img src="${pageContext.request.contextPath}/images/svg/phone.svg" alt="">
                                            </div>
                                            <div class="foo_con_data">
                                                <span class="con-title">Call us :</span>
                                                <span>0986054843</span>
                                            </div>
                                        </li>
                                        <li>
                                            <div class="foo_con_icon">
                                                <img src="${pageContext.request.contextPath}/images/svg/message.svg" alt="">
                                            </div>
                                            <div class="foo_con_data">
                                                <span class="con-title">email us :</span>
                                                <span><a href="#">trungpiano2507@gmail.com</a>, <a href="#">trungnguyenscrit@gmail.com</a></span>
                                            </div>
                                        </li>
                                        <li>
                                            <div class="foo_con_icon">
                                                <img src="${pageContext.request.contextPath}/images/svg/add.svg" alt="">
                                            </div>
                                            <div class="foo_con_data">
                                                <span class="con-title">walk in :</span>
                                                <span>H??a L???c, Th???ch Th???t, H?? N???i</span>
                                            </div>
                                        </li>
                                    </ul>
                                    <div class="foo_sharing">
                                        <div class="share_title">follow us :</div>
                                        <ul>
                                            <li><a href="https://www.facebook.com/profile.php?id=100013239997750"><i class="fa fa-facebook" aria-hidden="true"></i></a></li>
                                            <li><a href="https://twitter.com/Trungpaofast"><i class="fa fa-twitter" aria-hidden="true"></i></a></li>
                                        </ul>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>

                </div>-->
                <!----Audio Player Section---->

            </div>

        </div>
        <!----Register Modal Start---->
        <!-- Modal -->

        <!----Language Selection Modal---->

        <!----Queue Clear Model ---->

        <!----Queue Save Modal---->

        <!--Main js file Style-->
        <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.js"></script>
        <script type="text/javascript" src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
        <script type="text/javascript" src="${pageContext.request.contextPath}/js/plugins/swiper/js/swiper.min.js"></script>
        <script type="text/javascript" src="${pageContext.request.contextPath}/js/plugins/player/jplayer.playlist.min.js"></script>
        <script type="text/javascript" src="${pageContext.request.contextPath}/js/plugins/player/jquery.jplayer.min.js"></script>
        <script type="text/javascript" src="${pageContext.request.contextPath}/js/plugins/player/audio-player.js"></script>
        <script type="text/javascript" src="${pageContext.request.contextPath}/js/plugins/player/volume.js"></script>
        <script type="text/javascript" src="${pageContext.request.contextPath}/js/plugins/nice_select/jquery.nice-select.min.js"></script>
        <script type="text/javascript" src="${pageContext.request.contextPath}/js/plugins/scroll/jquery.mCustomScrollbar.js"></script>
        <script type="text/javascript" src="${pageContext.request.contextPath}/js/custom.js"></script>
    </body>

</html>
