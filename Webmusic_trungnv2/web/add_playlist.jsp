 

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
        <link rel="stylesheet" type="text/css" href="css/fonts.css">
        <link rel="stylesheet" type="text/css" href="css/bootstrap.css">
        <link rel="stylesheet" type="text/css" href="css/font-awesome.min.css">
        <link rel="stylesheet" type="text/css" href="js/plugins/swiper/css/swiper.min.css">
        <link rel="stylesheet" type="text/css" href="js/plugins/nice_select/nice-select.css">
        <link rel="stylesheet" type="text/css" href="js/plugins/player/volume.css">
        <link rel="stylesheet" type="text/css" href="js/plugins/scroll/jquery.mCustomScrollbar.css">
        <link rel="stylesheet" type="text/css" href="css/style.css">
        <!-- Favicon Link -->
        <link rel="shortcut icon" type="image/png" href="images/favicon.png">
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
                            <a href="${pageContext.request.contextPath}/home"><img src="images/logo.png" alt="" class="img-fluid"/></a>
                        </div>
                        <div class="ms_logo_open">
                            <a href="${pageContext.request.contextPath}/home"><img src="images/open_logo.png" alt="" class="img-fluid"/></a>
                        </div>
                    </div>
                    <div class="ms_nav_wrapper">
                        <ul>
                            <li><a href="${pageContext.request.contextPath}/home">
                                    <span class="nav_icon">
                                        <span class="icon icon_discover"></span>
                                    </span>
                                    <span class="nav_text">
                                        discover
                                    </span>
                                </a>
                            </li>
                            <li><a href="${pageContext.request.contextPath}/album/list">
                                    <span class="nav_icon">
                                        <span class="icon icon_albums"></span>
                                    </span>
                                    <span class="nav_text">
                                        albums
                                    </span>
                                </a>
                            </li>
                            <li><a href="${pageContext.request.contextPath}/singer/list">
                                    <span class="nav_icon">
                                        <span class="icon icon_artists"></span>
                                    </span>
                                    <span class="nav_text">
                                        Singer
                                    </span>
                                </a>
                            </li>
                            <li><a href="${pageContext.request.contextPath}/genre/list">
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
                         
                        <ul class="nav_playlist">
                             
                            <li><a href="${pageContext.request.contextPath}/myplaylist" class="active">
                                    <span class="nav_icon">
                                        <span class="icon icon_c_playlist"></span>
                                    </span>
                                    <span class="nav_text">
                                        create playlist
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
                    <div class="ms_top_left">
                        <div class="ms_top_search">
                            <input type="text" class="form-control" placeholder="Search Music Here..">
                            <span class="search_icon">
                                <img src="images/svg/search.svg" alt="">
                            </span>
                        </div>
                    </div>
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
                                <a href="admin" class="ms_btn login_btn" ><span>Manager</span></a>
                            </c:if>

                        </div>
                    </div>
                </div>
                <!----Live Radio Section Start---->
                <div class="ms_top_artist">
                    <div class="container-fluid">
                        <div class="row">
                            <div class="col-lg-12">
                                <div class="ms_heading">
                                    <h1>Your Playlists</h1>
                                </div>
                            </div>
                            <div class="col-lg-2 col-md-6">
                                <div class="ms_rcnt_box marger_bottom25">
                                    <div class="ms_rcnt_box_img">
                                        <img src="images/radio/img1.jpg" alt="" class="img-fluid">
                                        <div class="ms_main_overlay">
                                            <div class="ms_box_overlay"></div>
                                            <div class="ms_play_icon">
                                                <img src="images/svg/play.svg" alt="">
                                            </div>
                                        </div>
                                    </div>
                                    <div class="ms_rcnt_box_text">
                                        <h3><a href="#">My Favourites</a></h3>
                                        <p>15 songs</p>
                                    </div>
                                </div>
                            </div>
                            <div class="col-lg-2 col-md-6">
                                <div class="ms_rcnt_box marger_bottom25">
                                    <div class="ms_rcnt_box_img">
                                        <img src="images/radio/img2.jpg" alt="" class="img-fluid">
                                        <div class="ms_main_overlay">
                                            <div class="ms_box_overlay"></div>
                                            <div class="ms_play_icon">
                                                <img src="images/svg/play.svg" alt="">
                                            </div>
                                        </div>
                                    </div>
                                    <div class="ms_rcnt_box_text">
                                        <h3><a href="#">My Music</a></h3>
                                        <p>15 songs</p>
                                    </div>
                                </div>
                            </div>
                            <div class="col-lg-2">
                                <div class="ms_rcnt_box marger_bottom25">
                                    <div class="create_playlist">
                                        <i class="ms_icon icon_playlist"></i>
                                    </div>
                                    <div class="ms_rcnt_box_text">
                                        <h3><a href="#">Create New Playlist</a></h3>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <!----Featured Playlist Section Start---->

                <!----Main div close---->
            </div>
            <!----Footer Start---->
            <div class="ms_footer_wrapper">

                <div class="ms_footer_inner">
                    <div class="row">
                        <div class="col-lg-3 col-md-6">
                            <div class="footer_box">
                                <h1 class="footer_title">miraculous music stations</h1>
                                <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat duis aute irure dolor.</p>
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
                                            <img src="images/svg/phone.svg" alt="">
                                        </div>
                                        <div class="foo_con_data">
                                            <span class="con-title">Call us :</span>
                                            <span>(+1) 202-555-0176, (+1) 2025-5501</span>
                                        </div>
                                    </li>
                                    <li>
                                        <div class="foo_con_icon">
                                            <img src="images/svg/message.svg" alt="">
                                        </div>
                                        <div class="foo_con_data">
                                            <span class="con-title">email us :</span>
                                            <span><a href="#">demo@mail.com </a>, <a href="#">dummy@mail.com</a></span>
                                        </div>
                                    </li>
                                    <li>
                                        <div class="foo_con_icon">
                                            <img src="images/svg/add.svg" alt="">
                                        </div>
                                        <div class="foo_con_data">
                                            <span class="con-title">walk in :</span>
                                            <span>598 Old House Drive, London</span>
                                        </div>
                                    </li>
                                </ul>
                                <div class="foo_sharing">
                                    <div class="share_title">follow us :</div>
                                    <ul>
                                        <li><a href="#"><i class="fa fa-facebook" aria-hidden="true"></i></a></li>
                                        <li><a href="#"><i class="fa fa-linkedin" aria-hidden="true"></i></a></li>
                                        <li><a href="#"><i class="fa fa-twitter" aria-hidden="true"></i></a></li>
                                        <li><a href="#"><i class="fa fa-google-plus" aria-hidden="true"></i></a></li>
                                    </ul>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>

            </div>
        </div>
        <!----Audio Player Section---->

    </div>
    <!----Register Modal Start---->
    <!-- Modal -->

    <!----Language Selection Modal---->

    <!----Queue Clear Model ---->

    <!----Queue Save Modal---->

    <!--Main js file Style-->
    <script type="text/javascript" src="js/jquery.js"></script>
    <script type="text/javascript" src="js/bootstrap.min.js"></script>
    <script type="text/javascript" src="js/plugins/swiper/js/swiper.min.js"></script>
    <script type="text/javascript" src="js/plugins/player/jplayer.playlist.min.js"></script>
    <script type="text/javascript" src="js/plugins/player/jquery.jplayer.min.js"></script>
    <script type="text/javascript" src="js/plugins/player/audio-player.js"></script>
    <script type="text/javascript" src="js/plugins/player/volume.js"></script>
    <script type="text/javascript" src="js/plugins/nice_select/jquery.nice-select.min.js"></script>
    <script type="text/javascript" src="js/plugins/scroll/jquery.mCustomScrollbar.js"></script>
    <script type="text/javascript" src="js/custom.js"></script>
</body>

</html>