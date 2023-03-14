<%--
  Created by IntelliJ IDEA.
  User: Dell
  Date: 3/14/2023
  Time: 8:06 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="f" uri="jakarta.tags.functions" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="/css/bootstrap.min.css">

</head>
<body>
<div class="container">
    <h3>Bảng màu sắc</h3>
    <a href="/mau_sac/create" class="btn btn-outline-light">Create</a>
    <table class="table">
        <thead>
        <tr>
            <th scope="col">Id</th>
            <th scope="col">Mã</th>
            <th scope="col">Tên</th>
        </tr>
        </thead>
        <tbody>
        <tr ng-repeat=" ms in listMS">
            <th scope="row">${ms.id}</th>
            <td>${ms.ma}</td>
            <td>${ms.ten}</td>

        </tr>

        </tbody>
    </table>
</div>

<script src="/js/bootstrap.min.js"></script>
<script src="/js/jquery.min.js"></script>

</body>
</html>
