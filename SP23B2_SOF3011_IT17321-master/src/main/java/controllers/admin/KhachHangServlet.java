package controllers.admin;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import repo.KhachHangRepo;
import view_model.KhachHang;

import java.io.IOException;

@WebServlet({"/khach_hang/index",
        "/khach_hang/create",
        "/khach_hang/edit",
        "/khach_hang/delete",
        "/khach_hang/store", //post
        "/khach_hang/update" //post
})
public class KhachHangServlet extends HttpServlet {
    private KhachHangRepo khachHangRepo;

    public KhachHangServlet(){
        khachHangRepo = new KhachHangRepo();
        khachHangRepo.insert(new KhachHang("K1", "A", "Van", "Nguyen", "12-12-2021",
                "1230123012", "dia chi1", "Dong Da", "Ha Noi", "1234"));
        khachHangRepo.insert(new KhachHang("K2", "B", "Thi", "Nguyen", "14-12-2021",
                "1230123012", "dia chi2", "Chuog My", "Ha Noi", "1234"));
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String uri = request.getRequestURI();
        if (uri.contains("create")) {
            this.create(request, response);
        } else if (uri.contains("delete")) {
            this.delete(request, response);
        } else if (uri.contains("edit")) {
            this.edit(request, response);
        } else {
            this.index(request, response);
        }
    }

    protected void edit(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String ma = request.getParameter("ma");
        KhachHang kh = this.khachHangRepo.findByMa(ma);
        request.setAttribute("kh", kh);
        request.getRequestDispatcher("/views/khach_hang/edit.jsp").forward(request, response);

    }

    protected void delete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String ma = request.getParameter("ma");
        System.out.println(ma);
        KhachHang kh = this.khachHangRepo.findByMa(ma);
        System.out.println(kh);
        this.khachHangRepo.delete(kh);
        response.sendRedirect("/SP23B2_SOF3011_IT17321_war_exploded/khach_hang/index");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.getWriter().println("hello");
        this.store(request, response);
    }

    //hàm create
    protected void create(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.getRequestDispatcher("/views/khach_hang/create.jsp").forward(request, response);
    }

    protected void index(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setAttribute("danhSachKH", this.khachHangRepo.findAll());

        request.getRequestDispatcher("/views/khach_hang/index.jsp").forward(request, response);
//        this.store(request,response);
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
//        response.getWriter().println(kh.toString());
//        response.sendRedirect();

        //tạo arraylist và thêm vào
        this.khachHangRepo.insert(kh);
        System.out.println("k di chuyen");
        response.sendRedirect("/SP23B2_SOF3011_IT17321_war_exploded/khach_hang/index");

    }

}
