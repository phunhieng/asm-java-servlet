<%--
  Created by IntelliJ IDEA.
  User: Dell
  Date: 3/14/2023
  Time: 8:05 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="f" uri="jakarta.tags.functions" %>
<html>
<head>
    <title>sản phẩm</title>
    <link rel="stylesheet" href="/SP23B2_SOF3011_IT17321_war_exploded/css/bootstrap.min.css">
</head>
<body>

<div class="container">
    <h3>Bảng sản phẩm</h3>
    <a href="/SP23B2_SOF3011_IT17321_war_exploded/san_pham/create" class="btn btn-outline-primary">Create</a>
    <table class="table">
        <thead>
        <tr>
            <th scope="col">Id</th>
            <th scope="col">Mã</th>
            <th scope="col">Tên</th>
            <th colspan="2"> Action</th>
        </tr>
        </thead>
        <tbody>
            <c:if test ="${f:length(danhSachSP) == 0}">
                <span class="text-danger">Không có dữ liệu</span>
            </c:if>
            <c:if test ="${f:length(danhSachSP) !=0}">
                <c:forEach items="${danhSachSP}" var="sp">
                <tr >
                    <td>${sp.id}</td>
                    <td>${sp.ma}</td>
                    <td>${sp.ten}</td>
                    <td>
                        <a href="/SP23B2_SOF3011_IT17321_war_exploded/san_pham/edit?ma=${sp.ma}"
                           class="btn btn-outline-info">Cập nhật</a>
                        <a href="/SP23B2_SOF3011_IT17321_war_exploded/san_pham/delete?ma=${sp.ma}"
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
