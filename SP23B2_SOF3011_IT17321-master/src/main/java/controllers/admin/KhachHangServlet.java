package controllers.admin;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import view_model.KhachHang;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet({"/khach_hang/index",
        "/khach_hang/create",
        "/khach_hang/edit",
        "/khach_hang/delete",
        "/khach_hang/store", //post
        "/khach_hang/update" //post
})
public class KhachHangServlet extends HttpServlet {
    private ArrayList<KhachHang> listKH = new ArrayList();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String uri = request.getRequestURI();
        if (uri.contains("create")) {
            this.create(request, response);
        } else if (uri.contains("index")) {
            this.index(request, response);
        } else if (uri.contains("edit")) {
//            this.edit(request, response);
        } else {
            this.index(request, response);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.store(request, response);
    }

    //hàm create
    protected void create(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.getRequestDispatcher("/views/khach_hang/create.jsp").forward(request, response);
    }

    protected void index(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        this.store(request,response);
        request.setAttribute("danhSachKH", this.listKH);

        request.getRequestDispatcher("/views/khach_hang/index.jsp").forward(request, response);
    }

    protected void edit(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/views/khach_hang/edit.jsp").forward(request, response);
    }

    //hàm store
    protected void store(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String ma = request.getParameter("ma");
        String ten = request.getParameter("ten");
        String tenDem = request.getParameter("tenDem");
        String ho = request.getParameter("ho");
        String ngaySinh = request.getParameter("ngaySinh");
        String sdt = request.getParameter("sdt");
        String diaChi = request.getParameter("diaChi");
        String thanhPho = request.getParameter("thanhPho");
        String quocGia = request.getParameter("quocGia");
        String matKhau = request.getParameter("matKhau");

        KhachHang kh = new KhachHang(ma, ten, tenDem, ho, ngaySinh, sdt, diaChi, thanhPho, quocGia, matKhau);
        System.out.println("post oce");
        response.getWriter().println(kh.toString());
//        response.sendRedirect();

        //tạo arraylist và thêm vào
        listKH.add(kh);

    }

}
