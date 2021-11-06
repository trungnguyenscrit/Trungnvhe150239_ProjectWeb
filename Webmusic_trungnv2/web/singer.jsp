 
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
                            <a href="index-2.html"><img src="${pageContext.request.contextPath}/images/logo.png" alt="" class="img-fluid"/></a>
                        </div>
                        <div class="ms_logo_open">
                            <a href="index-2.html"><img src="${pageContext.request.contextPath}/images/open_logo.png" alt="" class="img-fluid"/></a>
                        </div>
                    </div>
                    <div class="ms_nav_wrapper">
                        <ul>
                            <li><a href="${pageContext.request.contextPath}/home" class="active" title="Discover">
                                    <span class="nav_icon">
                                        <span class="icon icon_discover"></span>
                                    </span>
                                    <span class="nav_text">
                                        discover
                                    </span>
                                </a>
                            </li>
                            <li><a href="album.html" title="Albums">
                                    <span class="nav_icon">
                                        <span class="icon icon_albums"></span>
                                    </span>
                                    <span class="nav_text">
                                        albums
                                    </span>
                                </a>
                            </li>
                            <li><a href="${pageContext.request.contextPath}/singer/list" title="Singers">
                                    <span class="nav_icon">
                                        <span class="icon icon_artists"></span>
                                    </span>
                                    <span class="nav_text">
                                        Singers
                                    </span>
                                </a>
                            </li>
                            <li><a href="genres.html" title="Genres">
                                    <span class="nav_icon">
                                        <span class="icon icon_genres"></span>
                                    </span>
                                    <span class="nav_text">
                                        genres
                                    </span>
                                </a>
                            </li>

                        </ul>

                        <ul class="nav_downloads">
                            <li><a href="download.html" title="Downloads">
                                    <span class="nav_icon">
                                        <span class="icon icon_download"></span>
                                    </span>
                                    <span class="nav_text">
                                        downloads
                                    </span>
                                </a>
                            </li>
                            <li><a href="favourite.html" title="Favourites">
                                    <span class="nav_icon">
                                        <span class="icon icon_favourite"></span>
                                    </span>
                                    <span class="nav_text">
                                        favourites
                                    </span>
                                </a>
                            </li>
                        </ul>
                        <ul class="nav_playlist">
                            <li><a href="feature_playlist.html" title="Featured Playlist">
                                    <span class="nav_icon">
                                        <span class="icon icon_fe_playlist"></span>
                                    </span>
                                    <span class="nav_text">
                                        featured playlist
                                    </span>
                                </a>
                            </li>
                            <li><a href="${pageContext.request.contextPath}/myplaylist" title="Create Playlist">
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
                        <!--<a href="index-2.html"><img src="images/open_logo.png" alt=""></a>-->
                    </div>
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
                                                    <img src="${pageContext.request.contextPath}/images/svg/phone.svg" alt="">
                                                </div>
                                                <div class="foo_con_data">
                                                    <span class="con-title">Call us :</span>
                                                    <span>(+1) 202-555-0176, (+1) 2025-5501</span>
                                                </div>
                                            </li>
                                            <li>
                                                <div class="foo_con_icon">
                                                    <img src="${pageContext.request.contextPath}/images/svg/message.svg" alt="">
                                                </div>
                                                <div class="foo_con_data">
                                                    <span class="con-title">email us :</span>
                                                    <span><a href="#">demo@mail.com </a>, <a href="#">dummy@mail.com</a></span>
                                                </div>
                                            </li>
                                            <li>
                                                <div class="foo_con_icon">
                                                    <img src="${pageContext.request.contextPath}/images/svg/add.svg" alt="">
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

                    </div>-->
                    <!----Audio Player Section---->
                    <div class="ms_player_wrapper">
                        <div class="ms_player_close">
                            <i class="fa fa-angle-up" aria-hidden="true"></i>
                        </div>
                        <div class="player_mid">
                            <div class="audio-player">
                                <div id="jquery_jplayer_1" class="jp-jplayer"></div>
                                <div id="jp_container_1" class="jp-audio" role="application" aria-label="media player">
                                    <div class="player_left">
                                        <div class="ms_play_song">
                                            <div class="play_song_name">
                                                <a href="javascript:void(0);" id="playlist-text">
                                                    <div class="jp-now-playing flex-item">
                                                        <div class="jp-track-name"></div>
                                                        <div class="jp-artist-name"></div>
                                                    </div>
                                                </a>
                                            </div>
                                        </div>
                                        <div class="play_song_options">
                                            <ul>
                                                <li><a href="#"><span class="song_optn_icon"><i class="ms_icon icon_download"></i></span>download now</a></li>
                                                <li><a href="#"><span class="song_optn_icon"><i class="ms_icon icon_fav"></i></span>Add To Favourites</a></li>
                                                <li><a href="#"><span class="song_optn_icon"><i class="ms_icon icon_playlist"></i></span>Add To Playlist</a></li>
                                                <li><a href="#"><span class="song_optn_icon"><i class="ms_icon icon_share"></i></span>Share</a></li>
                                            </ul>
                                        </div>
                                        <span class="play-left-arrow"><i class="fa fa-angle-right" aria-hidden="true"></i></span>
                                    </div>
                                    <!----Right Queue---->
                                    <div class="jp_queue_wrapper">
                                        <span class="que_text" id="myPlaylistQueue"><i class="fa fa-angle-up" aria-hidden="true"></i> queue</span>
                                        <div id="playlist-wrap" class="jp-playlist">
                                            <div class="jp_queue_cls"><i class="fa fa-times" aria-hidden="true"></i></div>
                                            <h2>queue</h2>
                                            <div class="jp_queue_list_inner">
                                                <ul>
                                                    <li>&nbsp;</li>
                                                </ul>
                                            </div>
                                            <div class="jp_queue_btn">
                                                <a href="javascript:;" class="ms_clear" data-toggle="modal" data-target="#clear_modal">clear</a>
                                                <a href="clear_modal.html" class="ms_save" data-toggle="modal" data-target="#save_modal">save</a>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="jp-type-playlist">
                                        <div class="jp-gui jp-interface flex-wrap">
                                            <div class="jp-controls flex-item">
                                                <button class="jp-previous" tabindex="0">
                                                    <i class="ms_play_control"></i>
                                                </button>
                                                <button class="jp-play" tabindex="0">
                                                    <i class="ms_play_control"></i>
                                                </button>
                                                <button class="jp-next" tabindex="0">
                                                    <i class="ms_play_control"></i>
                                                </button>
                                            </div>
                                            <div class="jp-progress-container flex-item">
                                                <div class="jp-time-holder">
                                                    <span class="jp-current-time" role="timer" aria-label="time">&nbsp;</span>
                                                    <span class="jp-duration" role="timer" aria-label="duration">&nbsp;</span>
                                                </div>
                                                <div class="jp-progress">
                                                    <div class="jp-seek-bar">
                                                        <div class="jp-play-bar">
                                                            <div class="bullet">
                                                            </div>
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>
                                            <div class="jp-volume-controls flex-item">
                                                <div class="widget knob-container">
                                                    <div class="knob-wrapper-outer">
                                                        <div class="knob-wrapper">
                                                            <div class="knob-mask">
                                                                <div class="knob d3"><span></span></div>
                                                                <div class="handle"></div>
                                                                <div class="round">
                                                                    <img src="${pageContext.request.contextPath}/images/svg/volume.svg" alt="">
                                                                </div>
                                                            </div>
                                                        </div>
                                                        <!-- <input></input> -->
                                                    </div>
                                                </div>
                                            </div>
                                            <div class="jp-toggles flex-item">
                                                <button class="jp-shuffle" tabindex="0" title="Shuffle">
                                                    <i class="ms_play_control"></i></button>
                                                <button class="jp-repeat" tabindex="0" title="Repeat"><i class="ms_play_control"></i></button>
                                            </div>
                                            <div class="jp_quality_optn custom_select">
                                                <select>
                                                    <option>quality</option>
                                                    <option value="1">HD</option>
                                                    <option value="2">High</option>
                                                    <option value="3">medium</option>
                                                    <option value="4">low</option>
                                                </select>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <!--main div-->
                    </div>
                </div>
                <!----Audio Player Section---->
                <div class="ms_player_wrapper">
                    <div class="ms_player_close">
                        <i class="fa fa-angle-up" aria-hidden="true"></i>
                    </div>
                    <div class="player_mid">
                        <div class="audio-player">
                            <div id="jquery_jplayer_1" class="jp-jplayer"></div>
                            <div id="jp_container_1" class="jp-audio" role="application" aria-label="media player">
                                <div class="player_left">
                                    <div class="ms_play_song">
                                        <div class="play_song_name">
                                            <a href="javascript:void(0);" id="playlist-text">
                                                <div class="jp-now-playing flex-item">
                                                    <div class="jp-track-name"></div>
                                                    <div class="jp-artist-name"></div>
                                                </div>
                                            </a>
                                        </div>
                                    </div>
                                    <div class="play_song_options">
                                        <ul>
                                            <li><a href="#"><span class="song_optn_icon"><i class="ms_icon icon_download"></i></span>download now</a></li>
                                            <li><a href="#"><span class="song_optn_icon"><i class="ms_icon icon_fav"></i></span>Add To Favourites</a></li>
                                            <li><a href="#"><span class="song_optn_icon"><i class="ms_icon icon_playlist"></i></span>Add To Playlist</a></li>
                                            <li><a href="#"><span class="song_optn_icon"><i class="ms_icon icon_share"></i></span>Share</a></li>
                                        </ul>
                                    </div>
                                    <span class="play-left-arrow"><i class="fa fa-angle-right" aria-hidden="true"></i></span>
                                </div>
                                <!----Right Queue---->
                                <div class="jp_queue_wrapper">
                                    <span class="que_text" id="myPlaylistQueue"><i class="fa fa-angle-up" aria-hidden="true"></i> queue</span>
                                    <div id="playlist-wrap" class="jp-playlist">
                                        <div class="jp_queue_cls"><i class="fa fa-times" aria-hidden="true"></i></div>
                                        <h2>queue</h2>
                                        <div class="jp_queue_list_inner">
                                            <ul>
                                                <li>&nbsp;</li>
                                            </ul>
                                        </div>
                                        <div class="jp_queue_btn">
                                            <a href="javascript:;" class="ms_clear" data-toggle="modal" data-target="#clear_modal">clear</a>
                                            <a href="clear_modal.html" class="ms_save" data-toggle="modal" data-target="#save_modal">save</a>
                                        </div>
                                    </div>
                                </div>
                                <div class="jp-type-playlist">
                                    <div class="jp-gui jp-interface flex-wrap">
                                        <div class="jp-controls flex-item">
                                            <button class="jp-previous" tabindex="0">
                                                <i class="ms_play_control"></i>
                                            </button>
                                            <button class="jp-play" tabindex="0">
                                                <i class="ms_play_control"></i>
                                            </button>
                                            <button class="jp-next" tabindex="0">
                                                <i class="ms_play_control"></i>
                                            </button>
                                        </div>
                                        <div class="jp-progress-container flex-item">
                                            <div class="jp-time-holder">
                                                <span class="jp-current-time" role="timer" aria-label="time">&nbsp;</span>
                                                <span class="jp-duration" role="timer" aria-label="duration">&nbsp;</span>
                                            </div>
                                            <div class="jp-progress">
                                                <div class="jp-seek-bar">
                                                    <div class="jp-play-bar">
                                                        <div class="bullet">
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="jp-volume-controls flex-item">
                                            <div class="widget knob-container">
                                                <div class="knob-wrapper-outer">
                                                    <div class="knob-wrapper">
                                                        <div class="knob-mask">
                                                            <div class="knob d3"><span></span></div>
                                                            <div class="handle"></div>
                                                            <div class="round">
                                                                <img src="${pageContext.request.contextPath}/images/svg/volume.svg" alt="">
                                                            </div>
                                                        </div>
                                                    </div>
                                                    <!-- <input></input> -->
                                                </div>
                                            </div>
                                        </div>
                                        <div class="jp-toggles flex-item">
                                            <button class="jp-shuffle" tabindex="0" title="Shuffle">
                                                <i class="ms_play_control"></i></button>
                                            <button class="jp-repeat" tabindex="0" title="Repeat"><i class="ms_play_control"></i></button>
                                        </div>
                                        <div class="jp_quality_optn custom_select">
                                            <select>
                                                <option>quality</option>
                                                <option value="1">HD</option>
                                                <option value="2">High</option>
                                                <option value="3">medium</option>
                                                <option value="4">low</option>
                                            </select>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <!--main div-->
                </div>
            </div>
        </div>
        <!----Register Modal Start---->
        <!-- Modal -->
        <div class="ms_register_popup">
            <div id="myModal" class="modal  centered-modal" role="dialog">
                <div class="modal-dialog register_dialog">
                    <!-- Modal content-->
                    <div class="modal-content">
                        <button type="button" class="close" data-dismiss="modal">
                            <i class="fa_icon form_close"></i>
                        </button>
                        <div class="modal-body">
                            <div class="ms_register_img">
                                <img src="images/register_img.png" alt="" class="img-fluid" />
                            </div>
                            <div class="ms_register_form">
                                <h2>Register / Sign Up</h2>
                                <div class="form-group">
                                    <input type="text" placeholder="Enter Your Name" class="form-control">
                                    <span class="form_icon">
                                        <i class="fa_icon form-user" aria-hidden="true"></i>
                                    </span>
                                </div>
                                <div class="form-group">
                                    <input type="text" placeholder="Enter Your Email" class="form-control">
                                    <span class="form_icon">
                                        <i class="fa_icon form-envelope" aria-hidden="true"></i>
                                    </span>
                                </div>
                                <div class="form-group">
                                    <input type="password" placeholder="Enter Password" class="form-control">
                                    <span class="form_icon">
                                        <i class="fa_icon form-lock" aria-hidden="true"></i>
                                    </span>
                                </div>
                                <div class="form-group">
                                    <input type="password" placeholder="Confirm Password" class="form-control">
                                    <span class="form_icon">
                                        <i class=" fa_icon form-lock" aria-hidden="true"></i>
                                    </span>
                                </div>
                                <a href="#" class="ms_btn">register now</a>
                                <p>Already Have An Account? <a href="#myModal1" data-toggle="modal" class="ms_modal hideCurrentModel">login here</a></p>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <!----Login Popup Start---->
            <div id="myModal1" class="modal  centered-modal" role="dialog">
                <div class="modal-dialog login_dialog">
                    <!-- Modal content-->
                    <div class="modal-content">
                        <button type="button" class="close" data-dismiss="modal">
                            <i class="fa_icon form_close"></i>
                        </button>
                        <div class="modal-body">
                            <div class="ms_register_img">
                                <img src="images/register_img.png" alt="" class="img-fluid" />
                            </div>
                            <div class="ms_register_form">
                                <h2>login / Sign in</h2>
                                <div class="form-group">
                                    <input type="text" placeholder="Enter Your Email" class="form-control">
                                    <span class="form_icon">
                                        <i class="fa_icon form-envelope" aria-hidden="true"></i>
                                    </span>
                                </div>
                                <div class="form-group">
                                    <input type="password" placeholder="Enter Password" class="form-control">
                                    <span class="form_icon">
                                        <i class="fa_icon form-lock" aria-hidden="true"></i>
                                    </span>
                                </div>
                                <div class="remember_checkbox">
                                    <label>Keep me signed in
                                        <input type="checkbox">
                                        <span class="checkmark"></span>
                                    </label>
                                </div>
                                <a href="profile.html" class="ms_btn" target="_blank">login now</a>
                                <div class="popup_forgot">
                                    <a href="#">Forgot Password ?</a>
                                </div>
                                <p>Don't Have An Account? <a href="#myModal" data-toggle="modal" class="ms_modal1 hideCurrentModel">register here</a></p>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <!----Language Selection Modal---->

        <!----Queue Clear Model ---->
        <div class="ms_clear_modal">
            <div id="clear_modal" class="modal  centered-modal" role="dialog">
                <div class="modal-dialog">
                    <!-- Modal content-->
                    <div class="modal-content">
                        <button type="button" class="close" data-dismiss="modal">
                            <i class="fa_icon form_close"></i>
                        </button>
                        <div class="modal-body">
                            <h1>Are you sure you want to clear your queue?</h1>
                            <div class="clr_modal_btn">
                                <a href="#">clear all</a>
                                <a href="#">cancel</a>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <!----Queue Save Modal---->
        <div class="ms_save_modal">
            <div id="save_modal" class="modal  centered-modal" role="dialog">
                <div class="modal-dialog">
                    <!-- Modal content-->
                    <div class="modal-content">
                        <button type="button" class="close" data-dismiss="modal">
                            <i class="fa_icon form_close"></i>
                        </button>
                        <div class="modal-body">
                            <h1>Log in to start sharing your music!</h1>
                            <div class="save_modal_btn">
                                <a href="#"><i class="fa fa-google-plus-square" aria-hidden="true"></i> continue with google </a>
                                <a href="#"><i class="fa fa-facebook-square" aria-hidden="true"></i> continue with facebook</a>
                            </div>
                            <div class="ms_save_email">
                                <h3>or use your email</h3>
                                <div class="save_input_group">
                                    <input type="text" placeholder="Enter Your Name" class="form-control">
                                </div>
                                <div class="save_input_group">
                                    <input type="password" placeholder="Enter Password" class="form-control">
                                </div>
                                <button class="save_btn">Log in</button>
                            </div>
                            <div class="ms_dnt_have">
                                <span>Dont't have an account ?</span>
                                <a href="javascript:;" class="hideCurrentModel" data-toggle="modal" data-target="#myModal">Register Now</a>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>	
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
