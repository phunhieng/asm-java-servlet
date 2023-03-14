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
<div class="container" >
    <form action="/cua_hang/store" method="post">
        <div class="mb-2">
            <label>Mã:</label>
            <input type="text" class="form-control" name="ma" value="ma1">
        </div>
        <div class="mb-2">
            <label>Tên chức vụ:</label>
            <input type="text" class="form-control" name="ten" value="ten1">
        </div>
        <div class="mb-2">
            <label>Địa chỉ cửa hàng:</label>
            <input type="text" class="form-control" name="diaChi" value="ha noi">
        </div>
        <div class="mb-2">
            <label>Thành phố</label>
            <select name="thanhPho" class="form-select">
                <option value="ha_noi">Hà Nội</option>
                <option value="new_york">New York</option>
            </select>
        </div>
        <div class="mb-2">
            <label>Quốc gia</label>
            <select name="quocGia" class="form-select">
                <option value="vi">Việt Nam</option>
                <option value="us">Mỹ</option>
            </select>
        </div>

        <button type="submit" class="btn btn-primary">Thêm</button>
    </form>
</div>
<script src="/js/bootstrap.min.js"></script>
<script src="/js/jquery.min.js"></script>
</body>
</html>
