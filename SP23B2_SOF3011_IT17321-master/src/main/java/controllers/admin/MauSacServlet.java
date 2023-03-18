package controllers.admin;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import repo.MauSacRepo;
import view_model.MauSac;
import view_model.NhaSanXuat;

import java.io.IOException;
import java.util.ArrayList;

@WebServlet({"/mau_sac/index",
        "/mau_sac/create",
        "/mau_sac/edit",
        "/mau_sac/delete",
        "/mau_sac/store",
        "/mau_sac/update"})
public class MauSacServlet extends HttpServlet {
    private MauSacRepo mauSacRepo;

    public MauSacServlet(){
        mauSacRepo = new MauSacRepo();
        mauSacRepo.insert(new MauSac("M1", "Đỏ"));
        mauSacRepo.insert(new MauSac("M2", "Vàng"));
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
        this.store(request,response);
    }

    //hàm create
    protected void create(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/views/mau_sac/create.jsp").forward(request,response);
    }

    //hàm index
    protected void index(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        request.setAttribute("danhSachMS", this.mauSacRepo.findAll());
        request.getRequestDispatcher("/views/mau_sac/index.jsp").forward(request,response);
    }

    protected void edit(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String ma = request.getParameter("ma");
        MauSac ms = this.mauSacRepo.findByMa(ma);
        request.setAttribute("nsx", ms);
        request.getRequestDispatcher("/views/mau_sac/edit.jsp").forward(request, response);
    }

    protected void delete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String ma = request.getParameter("ma");
        MauSac ms = this.mauSacRepo.findByMa(ma);
        this.mauSacRepo.delete(ms);
        response.sendRedirect("/SP23B2_SOF3011_IT17321_war_exploded/mau_sac/index");
    }

    //hàm store
    protected void store(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        String ma = request.getParameter("ma");
        String ten = request.getParameter("ten");

        MauSac ms = new MauSac(ma,ten);
        this.mauSacRepo.insert(ms);
        response.sendRedirect("/SP23B2_SOF3011_IT17321_war_exploded/mau_sac/index");
    }

}
