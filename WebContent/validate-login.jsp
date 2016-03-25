<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Sprawdzanie logowania</title>
</head>
<body>
    <!-- Użycie tagu jsp:useBean. Tag ten szuka obiektu klasy User z pakiecie
    javastart.jspexample.model w sesji użytkownika. Jeśli znajdzie, to go 
    wykorzysta, jeśli nie stworzy nowy obiekt klasy user o nazwie "user"-->
    <jsp:useBean id="user" class="eu.karols.myfirstblog.model.User"
        scope="session"></jsp:useBean>
 
    <!-- Użycie tagu jsp:setProperty. Tag ten umieszcza wszystkie parametry
    przesyłane z innych plików jsp pasujące do obiektu o nazwie user. Jeśli
    parametry te nie będą się zgadzać, tomcat wyrzuci wyjątkiem -->
    <jsp:setProperty property="*" name="user" />
 
    <!-- Ponowne użycie tagu jsp:useBean ładujący źródło danych. -->
    <jsp:useBean id="dataSource"
        class="eu.karols.myfirstblog.model.DataSource" scope="session"></jsp:useBean>
 
    <!-- Wyświetlenie nazwy użytkownika. -->
    Nazwa: <%= user.getName() %><br />
 
    <!-- Logika sprawdzająca poprawność parametrów logowania. -->
    <% String result = "Dane niepoprawne";
 
    if(dataSource.userExists(user)) {
        result = "Poprawny użytkownik oraz hasło";
        }
    %>
 
    <!-- Zwrócenie wynikowego stringa "result" -->
    <%= result %>
</body>
</html>