<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	window.onload = function(){
		
		document.getElementById('post').addEventListener('click', function() {
	    	console.log('post');
	    	location.href = "post";
		});
		
		document.getElementById('update').addEventListener('click', function(){
			console.log('update');
		});
		
		document.getElementById('view').addEventListener('click', function(){
			console.log('view');
		});
		
		document.getElementById('apply').addEventListener('click', function(){
			console.log('apply');
		});
		
		let query2 = {
				"companyID" : "2",
				"position" : "포지션1",
				"compensation" : "1000",
				"content" : "임의의 채용내용", 
				"tech" : "임의의 기술"
		};
		
		document.getElementById('postRec').onclick = function(){
			var xhr = new XMLHttpRequest();
			xhr.open("POST", "/recruitments", true);
			xhr.setRequestHeader("Content-Type", "application/json;charset=UTF-8");
			xhr.send(JSON.stringify(query2));
		};
		
	}
	
</script>
</head>
<body>
	main.jsp
	
	<button id="post">채용공고 올리기</button>
	<button id="update">채용공고 수정/삭제</button>
	<button id="view">채용공고 보기</button>
	<button id="apply">채용공고 지원하기</button>
	
	<button id="postRec">포스트 테스트</button>
</body>
</html>