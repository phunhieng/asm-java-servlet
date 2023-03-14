<%--
  Created by IntelliJ IDEA.
  User: Dell
  Date: 3/14/2023
  Time: 8:29 AM
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
    <h3>Bảng nhà sản xuất</h3>
    <a href="/nha_san_xuat/create" class="btn btn-outline-warning">Create</a>
    <table class="table">
        <thead>
        <tr>
            <th scope="col">Id</th>
            <th scope="col">Mã</th>
            <th scope="col">Tên</th>
        </tr>
        </thead>
        <tbody>
        <tr ng-repeat=" nsx in listNSX">
            <th scope="row">${nsx.id}</th>
            <td>${nsx.ma}</td>
            <td>${nsx.ten}</td>

        </tr>

        </tbody>
    </table>
</div>

<script src="/js/bootstrap.min.js"></script>
<script src="/js/jquery.min.js"></script>


</body>
</html>
