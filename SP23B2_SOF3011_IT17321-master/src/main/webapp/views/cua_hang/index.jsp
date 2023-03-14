<%--
  Created by IntelliJ IDEA.
  User: Dell
  Date: 3/14/2023
  Time: 7:51 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="/css/bootstrap.min.css">

</head>
<body>
<div class="container">
<h3>Bảng cửa hàng</h3>

<a href="/cua_hang/create" class="btn btn-outline-info">Create</a>
<table class="table">
    <thead>
    <tr>
        <th scope="col">Mã</th>
        <th scope="col">Id</th>
        <th scope="col">Tên</th>
        <th scope="col">Địa chỉ</th>
        <th scope="col">Thành phố</th>
        <th scope="col">Quốc gia</th>

    </tr>
    </thead>
    <tbody>
    <tr ng-repeat=" ch in listCH">
        <th scope="row">${ch.id}</th>
        <td>${ch.ma}</td>
        <td>${ch.ten}</td>
        <td>${ch.diaChi}</td>
        <td>${ch.thanhPho}</td>
        <td>${ch.quocGia}</td>

    </tr>

    </tbody>
</table>
</div>

<script src="/js/bootstrap.min.js"></script>
<script src="/js/jquery.min.js"></script>

</body>
</html>
