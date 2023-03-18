package controllers.admin;


import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import repo.NhaSanXuatRepo;
import view_model.ChucVu;
import view_model.NhaSanXuat;

import java.io.IOException;
import java.util.ArrayList;

@WebServlet({"/nha_san_xuat/index",
        "/nha_san_xuat/create",
        "/nha_san_xuat/edit",
        "/nha_san_xuat/delete",
        "/nha_san_xuat/store",
        "/nha_san_xuat/update"})
public class NhaSanXuatServlet extends HttpServlet {
    private NhaSanXuatRepo nhaSanXuatRepo;

    public NhaSanXuatServlet() {
        nhaSanXuatRepo = new NhaSanXuatRepo();
        nhaSanXuatRepo.insert(new NhaSanXuat("NSX1", "Nhà sản xuất 1"));
        nhaSanXuatRepo.insert(new NhaSanXuat("NSX2", "Nhà sản xuất 2"));
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

    protected void create(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/views/nha_san_xuat/create.jsp").forward(request, response);
    }

    protected void index(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("danhSachNSX", this.nhaSanXuatRepo.findAll());
        request.getRequestDispatcher("/views/nha_san_xuat/index.jsp").forward(request, response);
    }

    protected void edit(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String ma = request.getParameter("ma");
        NhaSanXuat nsx = this.nhaSanXuatRepo.findByMa(ma);
        request.setAttribute("nsx", nsx);
        request.getRequestDispatcher("/views/nha_san_xuat/edit.jsp").forward(request, response);
    }

    protected void delete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String ma = request.getParameter("ma");
        NhaSanXuat nsx = this.nhaSanXuatRepo.findByMa(ma);
        this.nhaSanXuatRepo.delete(nsx);
        response.sendRedirect("/SP23B2_SOF3011_IT17321_war_exploded/nha_san_xuat/index");
    }

    protected void store(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String ma = request.getParameter("ma");
        String ten = request.getParameter("ten");

        NhaSanXuat nsx = new NhaSanXuat(ma, ten);
        this.nhaSanXuatRepo.insert(nsx);
        response.sendRedirect("/SP23B2_SOF3011_IT17321_war_exploded/nha_san_xuat/index");
    }

}
