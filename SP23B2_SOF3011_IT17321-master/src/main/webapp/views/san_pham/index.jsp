<%--
  Created by IntelliJ IDEA.
  User: Dell
  Date: 3/14/2023
  Time: 8:05 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>sản phẩm</title>
    <link rel="stylesheet" href="/css/bootstrap.min.css">
</head>
<body>

<div class="container">
    <h3>Bảng sản phẩm</h3>
    <a href="/san_pham/create" class="btn btn-outline-primary">Create</a>
    <table class="table">
        <thead>
        <tr>
            <th scope="col">Id</th>
            <th scope="col">Mã</th>
            <th scope="col">Tên</th>
        </tr>
        </thead>
        <tbody>
        <tr ng-repeat=" sp in listSP">
            <th scope="row">${sp.id}</th>
            <td>${sp.ma}</td>
            <td>${sp.ten}</td>

        </tr>

        </tbody>
    </table>
</div>

<script src="/js/bootstrap.min.js"></script>
<script src="/js/jquery.min.js"></script>

</body>
</html>
