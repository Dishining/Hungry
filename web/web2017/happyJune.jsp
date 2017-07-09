<!DOCTYPE html>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html lang="zh-CN">
<head>
<meta charset="utf-8">

<title>hungry</title>

<link rel="stylesheet" href="css/animate.css">
<style>
* { margin: 0; padding: 0;}
ul { list-style-type: none;}
body { font: 14px "Microsoft Yahei"; overflow-x: hidden;background-color: #9E9490;  
background-image: url(img/bg.jpg);

	background-size:100%;
	background-repeat:no-repeat;
}
 h1 { width: 900px; margin: 40px auto 100px; font: 32px "Microsoft Yahei"; text-align:center; color: #D3D3D3; }
</style>
 
 
<script src="js/jquery-1.8.3.min.js"></script>
<script>
$(function(){
	var $animate = $('#animate');
	var $opposite = $('#opposite');
	$(".wrap").hover(function(){
		$animate.removeClass();
		$opposite.removeClass();
		$animate.addClass("test");
		$opposite.addClass('test2');
	},function(){
		$animate.removeClass();
		$opposite.removeClass();
		$animate.addClass("test2");
		$opposite.addClass('test');
	});

	$(".well-item").hover(function(){
		$(this).find(".correct").children().removeClass();
		$(this).find(".opposite").children().removeClass();
		$(this).find(".correct").children().addClass("test");
		$(this).find(".opposite").children().addClass('test2');
	},function(){
		$(this).find(".correct").children().removeClass();
		$(this).find(".opposite").children().removeClass();
		$(this).find(".correct").children().addClass("test2");
		$(this).find(".opposite").children().addClass('test');
	});

});
</script>

</head>
<body>
  
<style>
 .nav ul{
width:1000px;
margin:0px auto;
height:38px;
padding:0;
}
.nav ul li{
float:left;
}
.nav ul li a{
width:180px;
height:35px;
line-height:28px;
background:black;
color:#FFF;
margin:10px 35px;
font-size:15px;
display:block;
text-align:center;
text-decoration:none;
}
 
.nav ul li a:hover{
width:178px;
height:33px;
line-height:28px;
border:1px solid black;
color:black;
background:#FFF;
}

</style>
<h1 style="color: #F2ECEC; font-style: italic; font-weight: bolder; font-size: 80px;margin: 150px auto 10px;text-align: left;">Hungry</h1>
<div class="nav">
<ul>
			<li id="home"><a href=""><b>HOW</b></a></li>
			<li id="single"><a href=""><b>TO</b></a></li>
			<li id="dropdown"><a href="order.jsp"><b>BECOME</b></a></li>
			<li id="dropline"><a href="echarts/index.html"><b>FAT</b></a></li>
			 
</ul></div>
 
<script>
//For Demo only
var links = document.getElementsByClassName('link')
for(var i = 0; i <= links.length; i++)
   addClass(i)


function addClass(id){
   setTimeout(function(){
      if(id > 0) links[id-1].classList.remove('hover')
      links[id].classList.add('hover')
   }, id*750) 
}
</script>
<div style="text-align:center;clear:both">
<script src="/gg_bd_ad_720x90.js" type="text/javascript"></script>
<script src="/follow.js" type="text/javascript"></script>
</div> 
<body>
<div class="well">
	<div class="well-item">
		<div class="correct"><img  class="" src="img/pro5.jpg" /></div>
		<div class="opposite">
			<div class="">
				<div class="opposite-content">
					<div class="opposite-content-text"><a href="success.jsp?a=1">
						哇，鳗鱼饭没有刺哎！
					</a>
					</div>
				</div>
			</div>
		</div>
	</div>
    <div class="well-item">
		<div class="correct"><img  class="" src="img/pro7.jpg" /></div>
		<div class="opposite">
			<div class="">
				<div class="opposite-content">
					<div class="opposite-content-text"><a href="success.jsp?a=2">
						想和你一起被裹在里面。
                                                那你先被吃掉好不好。
					</a>
					</div>
				</div>
			</div>
		</div>
	</div>
    <div class="well-item">
        <div class="correct"><img  class="" src="img/pro8.jpg" /></div>
		<div class="opposite">
			<div class="">
				<div class="opposite-content">
					<div class="opposite-content-text"><a href="success.jsp?a=3">
                                            每一根面都像我对你的思念。
                                            红烧还是酸菜味啊？
                                            </a>																</ a>
					</div>
				</div>
			</div>
		</div>
	</div>
    <div class="well-item">
		<div class="correct"><img  class="" src="img/pro9.jpg" /></div>
		<div class="opposite">
			<div class="">
				<div class="opposite-content">
					<div class="opposite-content-text"><a href="success.jsp?a=4">
						想让你请我吃一辈子雪糕~
                                             你走开。
					</a>
					</div>
				</div>
			</div>
		</div>
	</div>
    <div class="well-item">
		<div class="correct"><img  class="" src="img/pro10.jpg" /></div>
		<div class="opposite">
			<div class="">
				<div class="opposite-content">
					<div class="opposite-content-text"><a href="success.jsp?a=5">
						你的嘴角又沾到酱汁啦，傻瓜。
					</a>
					</div>
				</div>
			</div>
		</div>
	</div>
    <div class="well-item">
		<div class="correct"><img  class="" src="img/pro11.jpg" /></div>
		<div class="opposite">
			<div class="">
				<div class="opposite-content">
					<div class="opposite-content-text"><a href="success.jsp?a=6">
						你想当红油里面的脆骨吗？
                                                不要，辣眼睛。。。
					</a>
					</div>
				</div>
			</div>
		</div>
	</div>
    <div class="well-item">
		<div class="correct"><img  class="" src="img/pro12.jpg" /></div>
		<div class="opposite">
			<div class="">
				<div class="opposite-content">
					<div class="opposite-content-text"><a href="success.jsp?a=7">
						来，让我尝一口你的奶茶。
					</a>
					</div>
				</div>
			</div>
		</div>
	</div>
    <div class="well-item">
		<div class="correct"><img  class="" src="img/pro13.jpg" /></div>
		<div class="opposite">
			<div class="">
				<div class="opposite-content">
                                    <div class="opposite-content-text"><a href="success.jsp?a=8">
                                                红虾跑的快还是青虾跑的得快？
                                        </a>
					</div>
				</div>
			</div>
		</div>
	</div>
    <div class="well-item">
		<div class="correct"><img  class="" src="img/pro1.jpg" /></div>
		<div class="opposite">
			<div class="">
				<div class="opposite-content">
					<div class="opposite-content-text"><a href="success.jsp?a=9">
						想把所有的鱼肚子都给你吃
					</a>
					</div>
				</div>
			</div>
		</div>
	</div>
	<div class="well-item">
		<div class="correct"><img  class="" src="img/pro2.jpg" /></div>
		<div class="opposite">
			<div class="">
				<div class="opposite-content">
					<div class="opposite-content-text"><a href="success.jsp?a=10">
						要麻将还是油碟？
					</a>
					</div>
				</div>
			</div>
		</div>
	</div>
	<div class="well-item">
		<div class="correct"><img  class="" src="img/pro3.jpg" /></div>
		<div class="opposite">
			<div class="">
				<div class="opposite-content">
					<div class="opposite-content-text"><a href="success.jsp?a=11">
						你愿意吃我的披萨边吗？
					</a>
					</div>
				</div>
			</div>
		</div>
	</div>
	<div class="well-item">
		<div class="correct"><img  class="" src="img/pro4.jpg" /></div>
		<div class="opposite">
			<div class="">
				<div class="opposite-content">
					<div class="opposite-content-text"><a href="success.jsp?a=12">
						来，我帮你切肉，顺便帮你吃了好了。	
					</a>
					</div>
				</div>
			</div>
		</div>
	</div>

</div>

<div style="text-align:center;clear:both;margin-top:50px;">
<script src="/gg_bd_ad_720x90.js" type="text/javascript"></script>
<script src="/follow.js" type="text/javascript"></script>
</div>
</body>
</html>