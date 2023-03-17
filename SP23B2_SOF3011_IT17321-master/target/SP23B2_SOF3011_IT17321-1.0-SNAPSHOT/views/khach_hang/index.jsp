<%--
  Created by IntelliJ IDEA.
  User: tiennh
  Date: 3/10/23
  Time: 10:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="f" uri="jakarta.tags.functions" %>
<html>
<head>
    <title>Title</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

</head>
<body>
<div class="col-8 offset-2 mt-5 table-responsive">
    <div class="row">
        <div class="col-6">
            <a href="/SP23B2_SOF3011_IT17321_war_exploded/khach_hang/create" class="btn btn-success">Thêm mới</a>
        </div>
    </div>
    <table class="table table-striped mt-3">
        <thead class="table-primary">
        <tr>
            <th>Mã</th>
            <th>Đệm</th>
            <th>Tên</th>
            <th>Họ</th>
            <th>Ngày sinh</th>
            <th>SDT</th>
            <th>Địa chỉ</th>
            <th>Thành phố</th>
            <th>Quốc gia</th>
            <th>Mật Khẩu</th>
            <th colspan="2">Thao tác</th>
        </tr>
        </thead>
        <tbody>
        <c:if test="${f:length(danhSachKH) == 0}">
            <span>Không có dữ liệu</span>
        </c:if>
        <c:if test="${f:length(danhSachKH) != 0}">
            <c:forEach items="${ danhSachKH }" var="kh">
                <tr>

                    <td><c:out value="${kh.ma}" /></td>
                    <td><c:out value="${kh.tenDem}" /></td>
                    <td><c:out value="${kh.ten}" /></td>
                    <td><c:out value="${kh.ho}" /></td>
                    <td><c:out value="${kh.ngaySinh}" /></td>
                    <td><c:out value="${kh.sdt}" /></td>
                    <td><c:out value="${kh.diaChi}" /></td>
                    <td><c:out value="${kh.thanhPho}" /></td>
                    <td><c:out value="${kh.quocGia}" /></td>
                    <td><c:out value="${kh.matKhau}" /></td>
                    <td>
                        <a href="/SP23B2_SOF3011_IT17321_war_exploded/khach_hang/edit?ma=${kh.ma}" class="btn btn-primary">Cập nhật</a>
                    </td>
                    <td>
                        <a href="/SP23B2_SOF3011_IT17321_war_exploded/khach_hang/delete?ma=${kh.ma}" class="btn btn-danger">Xóa</a>
                    </td>
                </tr>
            </c:forEach>
        </c:if>
        </tbody>
    </table>
</div>

<script src="/js/bootstrap.min.js"></script>
</body>
</html>


