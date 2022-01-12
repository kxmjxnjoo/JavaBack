<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

</head>
<body>
<script type="text/javascript">
	if( window.name=='update'){ 
		window.opener.location.href 
		= "board.do?command=boardUpdateForm&num=${param.num}";
	} else if( window.name=='delete'){
		var bool = confirm("정말로 삭제할까요?");
		if( bool ) 
			window.opener.location.href 
			= "board.do?command=boardDelete&num=${param.num}";
	}
	self.close();
</script>
</body>
</html>