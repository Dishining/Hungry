<!DOCTYPE html>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html lang="zh-CN">
<head>
<meta charset="utf-8">
<title>那些年你想吃又吃不到的东西</title>

<link rel="stylesheet" href="css/animate.css">
<style>
* { margin: 0; padding: 0;}
ul { list-style-type: none;}
body { font: 14px "Microsoft Yahei"; overflow-x: hidden; background-color: #2B2B2B; }
h1 { width: 900px; margin: 40px auto 100px; font: 32px "Microsoft Yahei"; text-align: center; color: #D3D3D3; }
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

<h1>那些年你想吃又吃不到的东西</h1>
<div class="well">
	<div class="well-item">
		<div class="correct"><img  class="" src="img/pro5.jpg" /></div>
		<div class="opposite">
			<div class="">
				<div class="opposite-content">
					<div class="opposite-content-text"><a href="success.jsp?a=1">
						请我吃鳗鱼饭！
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
					<div class="opposite-content-text"><a href="newjsp1.jsp?b=2">
						请我吃饭团！
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
					<div class="opposite-content-text"><a href="index1/scary.html" target="_blank" >
                                            请我吃拉面！
																					</a>
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
					<div class="opposite-content-text"><a href="index1/scary.html" target="_blank" >
						请我吃雪糕！
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
					<div class="opposite-content-text"><a href="index1/scary.html" target="_blank" >
						请我吃鱼蛋！
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
					<div class="opposite-content-text"><a href="index1/scary.html" target="_blank" >
						请我吃串串！
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
					<div class="opposite-content-text"><a href="index1/scary.html" target="_blank" >
						请我喝奶茶！
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
                                    <div class="opposite-content-text"><a href="index1/scary.html" target="_blank" >

						请我吃龙虾！
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
					<div class="opposite-content-text"><a href="index1/scary.html" target="_blank" >
						请我吃烤鱼！
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
					<div class="opposite-content-text"><a href="index1/scary.html" target="_blank" >
						请我吃火锅！
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
					<div class="opposite-content-text"><a href="index1/scary.html" target="_blank" >
						请我吃披萨!
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
					<div class="opposite-content-text"><a href="index1/scary.html" target="_blank" >
						请我吃牛排！
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
