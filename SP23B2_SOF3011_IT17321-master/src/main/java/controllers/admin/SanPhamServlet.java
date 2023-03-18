package controllers.admin;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import repo.SanPhamRepo;
import view_model.ChucVu;
import view_model.SanPham;

import java.io.IOException;
import java.util.ArrayList;

@WebServlet({"/san_pham/index",
        "/san_pham/create",
        "/san_pham/edit",
        "/san_pham/delete",
        "/san_pham/store",
        "/san_pham/update"})
public class SanPhamServlet extends HttpServlet {
    private SanPhamRepo sanPhamRepo;

    public SanPhamServlet(){
        sanPhamRepo = new SanPhamRepo();
        sanPhamRepo.insert(new SanPham("SP1", "Mèo ta"));
        sanPhamRepo.insert(new SanPham("SP2", "Mèo Anh lông ngắn"));
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

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.store(request, response);
    }

    //hàm create
    protected void create(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
        request.getRequestDispatcher("/views/san_pham/create.jsp").forward(request, response);
    }

    protected void index(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
        request.setAttribute("danhSachSP", this.sanPhamRepo.findAll());
        request.getRequestDispatcher("/views/san_pham/index.jsp").forward(request, response);
    }

    protected void edit(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
        String ma = request.getParameter("ma");
        SanPham sp = this.sanPhamRepo.findByMa(ma);
        this.sanPhamRepo.update(sp);
        request.getRequestDispatcher("/views/san_pham/edit.jsp").forward(request, response);
    }

    protected void delete(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
        String ma = request.getParameter("ma");
        SanPham sp = this.sanPhamRepo.findByMa(ma);
        this.sanPhamRepo.delete(sp);
        response.sendRedirect("/SP23B2_SOF3011_IT17321_war_exploded/san_pham/index");
    }

    //hàm store
    protected void store(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
        String ma = request.getParameter("ma");
        String ten = request.getParameter("ten");

        SanPham sp = new SanPham(ma, ten);
        System.out.println("post oce");
//        response.getWriter().println(sp.toString());
        this.sanPhamRepo.insert(sp);
        response.sendRedirect("/SP23B2_SOF3011_IT17321_war_exploded/san_pham/index");
    }
}
