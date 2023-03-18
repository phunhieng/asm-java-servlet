package controllers.admin;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import repo.CuaHangRepo;
import repo.KhachHangRepo;
import view_model.CuaHang;


import java.io.IOException;
import java.util.ArrayList;

@WebServlet({"/cua_hang/index",
        "/cua_hang/create",
        "/cua_hang/edit",
        "/cua_hang/delete",
        "/cua_hang/store",
        "/cua_hang/update"})
public class CuaHangServlet extends HttpServlet {
    private CuaHangRepo cuaHangRepo;

    public CuaHangServlet(){
        cuaHangRepo = new CuaHangRepo();
        this.cuaHangRepo.insert(new CuaHang("CH1", "Cua hang 1", "Phuc Dien", "Ha Noi", "Viet Nam"));
        this.cuaHangRepo.insert(new CuaHang("CH2", "Cua hang 2", "Chuong My", "Ha Noi", "Viet Nam"));
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String uri = request.getRequestURI();
        if (uri.contains("create")) {
            this.create(request, response);
        }else if(uri.contains("delete")) {
            this.delete(request, response);
        }else if(uri.contains("edit")) {
            this.edit(request, response);
        }else {
            this.index(request, response);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.store(request, response);
    }

    //view create
    protected void create(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
        request.getRequestDispatcher("/views/cua_hang/create.jsp").forward(request, response);
    }

    protected void index(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
        request.setAttribute("danhSachCH", this.cuaHangRepo.findAll());
        request.getRequestDispatcher("/views/cua_hang/index.jsp").forward(request, response);
    }

    protected void delete(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
        String ma = request.getParameter("ma");
        System.out.println(ma);
        CuaHang ch = this.cuaHangRepo.findByMa(ma);
        System.out.println(ch);
        this.cuaHangRepo.delete(ch);
        response.sendRedirect("/SP23B2_SOF3011_IT17321_war_exploded/cua_hang/index");
    }

    protected void edit(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
        String ma = request.getParameter("ma");
        CuaHang ch = this.cuaHangRepo.findByMa(ma);
        this.cuaHangRepo.findByMa(ma);

        request.getRequestDispatcher("/views/cua_hang/edit.jsp").forward(request, response);
    }

    //hàm store
    protected void store(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
        String ma = request.getParameter("ma");
        String ten = request.getParameter("ten");
        String diaChi = request.getParameter("diaChi");
        String thanhPho = request.getParameter("thanhPho");
        String quocGia = request.getParameter("quocGia");

        CuaHang ch = new CuaHang(ma,ten,diaChi,thanhPho,quocGia);
        this.cuaHangRepo.insert(ch);
        response.sendRedirect("/SP23B2_SOF3011_IT17321_war_exploded/cua_hang/index");

    }
}
