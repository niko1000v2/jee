<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Bilbioteka</title>
<style>
.paragraph { 
text-align: center;
padding-left: 50px;
color: red
}
</style>

</head>
<body>

<p> Wybrany autor:</p>
 <%= request.getAttribute("autor")%>
<p> Wybrane godziny odbioru: </p>
<%= request.getAttribute("godzina")%>
</body>
</html>