<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="f" uri="jakarta.tags.functions" %>

<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Hello World!" %>
</h1>
<br/>
<a href="hello">Hello Servlet</a>
<a href="khach_hang/index" class="btn-outline-light">Khách hàng</a>
<a href="chuc_vu/index" class="btn-outline-danger">Chức vụ</a>
<a href="mau_sac/index" class="btn-outline-primary">Màu sắc</a>
<a href="cua_hang/index" class="btn btn-outline-warning">Cửa hàng</a>
<a href="san_pham/index" class="btn btn-outline-dark">Sản phẩm</a>
<a href="nha_san_xuat/index" class="btn btn-outline-dark">Nhà sản xuất</a>
</body>
</html>