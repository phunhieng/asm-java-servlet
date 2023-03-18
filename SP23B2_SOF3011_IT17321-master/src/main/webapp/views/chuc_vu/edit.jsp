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
    <link rel="stylesheet" href="/SP23B2_SOF3011_IT17321_war_exploded/css/bootstrap.min.css">

</head>
<body>
<div class="container" >
    <form action="/chuc_vu/update" method="post">
        <div class="mb-2">
            <label>Mã:</label>
            <input type="text" class="form-control" name="ma" value="${cv.ma}">
        </div>
        <div class="mb-2">
            <label>Tên chức vụ:</label>
            <input type="text" class="form-control" name="ten" value="${cv.ten}">
        </div>

        <button type="submit" class="btn btn-primary">Update</button>
    </form>
</div>
<script src="/SP23B2_SOF3011_IT17321_war_exploded/js/bootstrap.min.js"></script>
<script src="/SP23B2_SOF3011_IT17321_war_exploded/js/jquery.min.js"></script>
</body>
</html>
