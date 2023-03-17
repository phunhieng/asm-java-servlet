<%--
  Created by IntelliJ IDEA.
  User: Dell
  Date: 3/13/2023
  Time: 11:10 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="f" uri="jakarta.tags.functions" %>
<html>
<head>
    <title>Title</title>
    <link href="/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container" >
    <form action="/khach_hang/store" method="post">
        <div class="row">
            <div class="col-md-6 col-12 mt-2">
                <div class="mb-2">
                    <label>Mã</label>
                    <input type="text" class="form-control" name="ma" value="${ kh.ma }">
                </div>
                <div class="mb-2">
                    <label>Tên khách hàng:</label>
                    <input type="text" class="form-control" name="ten" value="${ kh.ten }">
                </div>
                <div class="mb-2">
                    <label>Tên đệm khách hàng:</label>
                    <input type="text" class="form-control" name="tenDem" value="${ kh.tenDem }">
                </div>
                <div class="mb-2">
                    <label>Họ khách hàng:</label>
                    <input type="text" class="form-control" name="ho" value="${ kh.ho }">
                </div>
                <div class="mb-2">
                    <label>Ngày sinh khách hàng:</label>
                    <input type="date" name="ngaySinh" class="form-control" value="${kh.ngaySinh}"/>
                </div>
            </div>

            <div class="col-md-6 col-12 mt-2">
                <div class="mb-2">
                    <label>Sđt khách hàng:</label>
                    <input type="text" class="form-control" name="sdt" value="${kh.sdt}">
                </div>
                <div class="mb-2">
                    <label>Địa chỉ khách hàng:</label>
                    <input type="text" class="form-control" name="diaChi" value="${kh.diaChi}">
                </div>
                <div class="mb-2">
                    <label>Quốc gia</label>
                    <select name="quocGia" class="form-select">
                        <option value="vi" ${kh.quocGia == "vi" ? "selected": ""}>Việt Nam</option>
                        <option value="us" ${kh.quocGia == "us" ? "selected": ""}>Mỹ</option>
                    </select>
                </div>
                <div class="mb-2">
                    <label>Thành phố</label>
                    <select name="thanhPho" class="form-select">
                        <option value="hn" ${kh.thanhPho == "hn" ? "selected": ""}>Hà Nội</option>
                        <option value="ny" ${kh.thanhPho == "ny" ? "selected": ""}>New York</option>
                    </select>
                </div>
                <div class="mb-2">
                    <label>Mật khẩu khách hàng:</label>
                    <input type="password" class="form-control" name="matKhau" value="${kh.matKhau}}">
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
