<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Dodaj użytkownika</title>
</head>
<body>
<h1>Dodaj konto:</h1>
  <form method="post" action="login-add-validate.jsp">
        Podaj swój login: <br />
        <input type="text" name="name" /><br /> 
        Podaj swoje hasło: <br />
        <input type="text" name="password" /><br /> 
        <input type="submit" value="dodaj">
    </form>
</body>
</html>