<%--
  Created by IntelliJ IDEA.
  User: Dell
  Date: 3/9/2023
  Time: 3:09 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="f" uri="jakarta.tags.functions" %>

<html>
<head>
    <title>Create</title>
    <link href="/css/bootstrap.min.css" rel="stylesheet">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>

<div class="container" >
    <form action="/SP23B2_SOF3011_IT17321_war_exploded/khach_hang/store" method="post">
        <div class="row">
            <div class="col-md-6 col-12 mt-2">
                <div class="mb-2">
                    <label>Mã</label>
                    <input type="text" class="form-control" name="ma" value="ma1">
                </div>
                <div class="mb-2">
                    <label>Tên khách hàng:</label>
                    <input type="text" class="form-control" name="ten" value="ten1">
                </div>
                <div class="mb-2">
                    <label>Tên đệm khách hàng:</label>
                    <input type="text" class="form-control" name="tenDem" value="dem1">
                </div>
                <div class="mb-2">
                    <label>Họ khách hàng:</label>
                    <input type="text" class="form-control" name="ho" value="ho1">
                </div>
                <div class="mb-2">
                    <label>Ngày sinh khách hàng:</label>
                    <input type="date" name="ngaySinh" class="form-control" />
                </div>
            </div>

            <div class="col-md-6 col-12 mt-2">
                <div class="mb-2">
                    <label>Sđt khách hàng:</label>

                    <input type="text" class="form-control" name="sdt" value="1234">
                </div>
                <div class="mb-2">
                    <label>Địa chỉ khách hàng:</label>
                    <input type="text" class="form-control" name="diaChi" value="ha noi">
                </div>
                <div class="mb-2">
                    <label>Quốc gia</label>
                    <select name="quocGia" class="form-select">
                        <option value="vi">Việt Nam</option>
                        <option value="us">Mỹ</option>
                    </select>
                </div>
                <div class="mb-2">
                    <label>Thành phố</label>
                    <select name="thanhPho" class="form-select">
                        <option value="ha_noi">Hà Nội</option>
                        <option value="new_york">New York</option>
                    </select>
                </div>
                <div class="mb-2">
                    <label>Mật khẩu khách hàng:</label>
                    <input type="password" class="form-control" name="matKhau" value="123456">
                </div>
            </div>

        </div>

        <button type="submit" class="btn btn-primary">Thêm</button>
    </form>
</div>
<script src="/js/bootstrap.min.js"></script>
<script src="/js/jquery.min.js"></script>

</body>
</html>
