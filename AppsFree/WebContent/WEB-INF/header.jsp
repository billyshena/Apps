<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title></title>
<link rel="icon" href="http://dzyngiri.com/favicon.png" type="image/x-icon">
<link rel="shortcut icon" href="http://dzyngiri.com/favicon.png" type="image/x-icon" />
<meta name="description" content="Free Art est fait pour vous">
<meta name="keywords" content="freeart, art, mode">
<meta name="author" content="">  
<link rel="stylesheet" href="css/bootstrap.css" type="text/css" media="screen">
<link rel="stylesheet" href="css/responsive.css" type="text/css" media="screen">
<link rel="stylesheet" href="css/style.css" type="text/css" media="screen">
<link rel="stylesheet" href="css/touchTouch.css" type="text/css" media="screen">
<link rel="stylesheet" href="css/kwicks-slider.css" type="text/css" media="screen">
<link href='http://fonts.googleapis.com/css?family=Open+Sans:400,300' rel='stylesheet' type='text/css'>
<script type="text/javascript" src="js/jquery.js"></script>
<script type="text/javascript" src="js/superfish.js"></script>
<script type="text/javascript" src="js/jquery.flexslider-min.js"></script>
<script type="text/javascript" src="js/jquery.kwicks-1.5.1.js"></script>
<script type="text/javascript" src="js/jquery.easing.1.3.js"></script>
<script type="text/javascript" src="js/jquery.cookie.js"></script>    
<script type="text/javascript" src="js/touchTouch.jquery.js"></script>
<script type="text/javascript">if($(window).width()>1024){document.write("<"+"script src='js/jquery.preloader.js'></"+"script>");}	</script>

<script>		
	 jQuery(window).load(function() {	
	 $x = $(window).width();		
	if($x > 1024){			
		jQuery("#content .row").preloader();    
	}	
     	jQuery('.magnifier').touchTouch();			
    	jQuery('.spinner').animate({'opacity':0},1000,'easeOutCubic',function (){jQuery(this).css('display','none')});	
  		}); 
</script>
</head>
<body>
<header>
      <div class="container clearfix">
    <div class="row">
          <div class="span12">
        <div class="navbar navbar_">
              <div class="container">
            <h1 class="brand brand_"><a href=""><img alt="" src="img/logo.png"> </a></h1>
            <a class="btn btn-navbar btn-navbar_" data-toggle="collapse" data-target=".nav-collapse_">Menu <span class="icon-bar"></span> </a>
            <div class="nav-collapse nav-collapse_  collapse">
                  <ul class="nav sf-menu">
                  <form method="post" action="/FreeArt/search">
                  <li id="commun"> zedzedzed<input type="text" name="motClef" value="${modele.motClef }"/> <input type="submit" value="Go"/></li>
                  </form>
                <li class="active"><a href="">Home</a></li>
                <li><a href="/FreeArt/catalogue">Catalogues</a></li>
                <li><a href="/FreeArt/oeuvre">Oeuvres</a></li>
<!--                 <li class="sub-menu"><a href="process.html">Process</a> -->
<!--                       <ul> -->
<!--                     <li><a href="#">Process 01</a></li> -->
<!--                     <li><a href="#">Process 02</a></li> -->
<!--                     <li><a href="#">Process 03</a></li> -->
<!--                   </ul> -->
<!--                     </li> -->
                <li><a href="/FreeArt/contact">Contact</a></li>
              </ul>
                </div>
          </div>
            </div>
      </div>
        </div>
  </div>
    </header>