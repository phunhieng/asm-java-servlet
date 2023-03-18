<%--
  Created by IntelliJ IDEA.
  User: Dell
  Date: 3/14/2023
  Time: 7:51 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--<%@ taglib prefix="c" uri="jakarta.tags.core" %>--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="f" uri="jakarta.tags.functions" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="/SP23B2_SOF3011_IT17321_war_exploded/css/bootstrap.min.css">

</head>
<body>
<div class="container">
<h3>Bảng cửa hàng</h3>
<a href="/SP23B2_SOF3011_IT17321_war_exploded/cua_hang/create" class="btn btn-outline-info">Create</a>
<table class="table">
    <thead>
    <tr>
        <th scope="col">Mã</th>
        <th scope="col">Id</th>
        <th scope="col">Tên</th>
        <th scope="col">Địa chỉ</th>
        <th scope="col">Thành phố</th>
        <th scope="col">Quốc gia</th>
        <th colspan="2">Action</th>
    </tr>
    </thead>
    <tbody>
    <c:if test="${f:length(danhSachCH) == 0}">
        <span class="text-danger">Không có dữ liệu</span>
    </c:if>

    <c:if test="${f:length(danhSachCH) != 0}">
        <c:forEach items="${danhSachCH}" var="ch">
            <tr>
                <td>${ch.id}</td>
                <td>${ch.ma}</td>
                <td>${ch.ten}</td>
                <td>${ch.diaChi}</td>
                <td>${ch.thanhPho}</td>
                <td>${ch.quocGia}</td>
                <td>
                    <a href="/SP23B2_SOF3011_IT17321_war_exploded/cua_hang/edit?ma=${ch.ma}"
               class="btn btn-outline-info">Cập nhật</a>
                    <a href="/SP23B2_SOF3011_IT17321_war_exploded/cua_hang/delete?ma=${ch.ma}"
               class="btn btn-outline-danger">Xóa</a>
                </td>
            </tr>
        </c:forEach>
    </c:if>
    </tbody>
</table>
</div>

<script src="/SP23B2_SOF3011_IT17321_war_exploded/js/bootstrap.min.js"></script>
<script src="/SP23B2_SOF3011_IT17321_war_exploded/js/jquery.min.js"></script>

</body>
</html>
