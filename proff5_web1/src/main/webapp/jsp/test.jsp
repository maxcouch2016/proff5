<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1/jquery.min.js"></script>

<script type="text/javascript">
	function myClickOld(){
		//alert('hello');
		var el = document.getElementById("text1");
		el.value = "hello";
		el.style.color = 'green';
	}
	function myClick(){
		$("#text2").val("jQeury");
		$("#text2").css("background", "maroon");
		$("#text2").css("color", "white");
		//$("input").prop('disabled', 'true');
	}
	function myAjaxFirst(){
		var text = $("#textToExampleOfAjax").val();
		console.log('text='+text);
	    $.ajax({
	        dataType: 'json',
	    	type: "POST",
	    	data: "text1=" + text,
	    	url:'/proff5_web1/ajax',
	        success: function(data){
	            //$("#block").html(data.result);
	        	$("#block").append(data.result);
	        },
	        error: function() {
	            alert("Error!");
	        }
	    });

	}
	$(document).ready(function() {
		$(".btn").click(function(){
			console.log('client ...');
			$("#text1, #text2").css("font-weight", "bold");
		});
		$("#ExampleOfAjax").click(function(){
			myAjaxFirst();
		});
	});
</script>
</head>
<body>
	<input type="text" id="text1" value="1">
	<input type="text" id="text2" value="2">
	<input type="button" onclick="alert(1)" value="кнопа 1">
	<input type="button" onmouseover="myClick()" value="кнопа 2">
	
	<hr>
	<input type="button" class="btn">
	// alert(text); console.log(text); 
	
	<hr>
	
	<input type="text" id="textToExampleOfAjax">
	<input type="button" value="ExampleOfAjax" id="ExampleOfAjax">
	<div id="block">1</div>
</body>
</html>