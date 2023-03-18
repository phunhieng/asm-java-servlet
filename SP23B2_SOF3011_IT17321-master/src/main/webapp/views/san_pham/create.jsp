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
    <title>Title</title>
    <link rel="stylesheet" href="/SP23B2_SOF3011_IT17321_war_exploded/css/bootstrap.min.css">

</head>
<body>
<div class="container" >
    <form action="/SP23B2_SOF3011_IT17321_war_exploded/san_pham/store" method="post">
        <div class="mb-2">
            <label>Mã:</label>
            <input type="text" class="form-control" name="ma" value="ma1">
        </div>
        <div class="mb-2">
            <label>Tên sản phẩm:</label>
            <input type="text" class="form-control" name="ten" value="ten1">
        </div>

        <button type="submit" class="btn btn-primary">Thêm</button>
    </form>
</div>
<script src="/SP23B2_SOF3011_IT17321_war_exploded/js/bootstrap.min.js"></script>
<script src="/SP23B2_SOF3011_IT17321_war_exploded/js/jquery.min.js"></script>

</body>
</html>
