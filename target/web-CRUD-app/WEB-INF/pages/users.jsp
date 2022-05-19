<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">


<head>
    <title>Title</title>
    <meta charset="UTF-8"/>
</head>
<body>

<h1>All users:</h1>
<br/>
<div th:each="user : ${users}">
    <h2 th:text="${user.toString()}"></h2>
</div>

</form>

<br/>
<h1>Create</h1>
<form action="create" method="get">
    <input type="text" name="name" placeholder="name"/>
    <input type="text" name="lastname" placeholder="lastname"/>
    <input type="text" name="email" placeholder="email"/>
    <input type="submit" placeholder="create new user's" title="create"/>
</form>
<br/>
<h1>Update</h1>
<form action="update" method="get">
    <input type="text" name="id" placeholder="id"/>
    <input type="text" name="name" placeholder="name"/>
    <input type="text" name="lastname" placeholder="lastname"/>
    <input type="text" name="email" placeholder="email"/>
    <input type="submit" placeholder="update"/>
</form>
<br/>
<h1>Delete</h1>
<form action="delete" method="get">
    <input type="text" name="id" placeholder="needed id"/>
    <input type="submit" placeholder="Delete" title="delete"/>
</form>
<br/>
<br/>
<br/>
<br/>
</body>

</html>
