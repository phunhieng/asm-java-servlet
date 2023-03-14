<%--
  Created by IntelliJ IDEA.
  User: Dell
  Date: 3/14/2023
  Time: 7:38 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="f" uri="jakarta.tags.functions" %>
<html>
<head>
    <title>Table</title>
    <link rel="stylesheet" href="/css/bootstrap.min.css">

</head>
<body>

<div class="container">
    <h3>Bảng chức vụ</h3>
    <a href="/chuc_vu/create" class="btn btn-outline-primary">Create</a>
    <table class="table">
        <thead>
        <tr>
            <th scope="col">Id</th>
            <th scope="col">Mã</th>
            <th scope="col">Tên</th>


        </tr>
        </thead>
        <tbody>
        <tr ng-repeat=" cv in listCV">
            <th scope="row">${cv.id}</th>
            <td>${cv.ma}</td>
            <td>${cv.ten}</td>

        </tr>

        </tbody>
    </table>
</div>

<script src="/js/bootstrap.min.js"></script>
<script src="/js/jquery.min.js"></script>

</body>
</html>
