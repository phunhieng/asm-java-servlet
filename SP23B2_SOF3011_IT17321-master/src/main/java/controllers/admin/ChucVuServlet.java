package controllers.admin;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import repo.ChucVuRepo;
import view_model.ChucVu;

import java.io.IOException;
import java.util.ArrayList;

@WebServlet ({"/chuc_vu/index",
        "/chuc_vu/create",
        "/chuc_vu/edit",
        "/chuc_vu/delete",
        "/chuc_vu/store",
        "/chuc_vu/update"})
public class ChucVuServlet extends HttpServlet {
    private ChucVuRepo chucVuRepo;

    public ChucVuServlet(){
        chucVuRepo = new ChucVuRepo();
        this.chucVuRepo.insert(new ChucVu("CV1", "nhan vien"));
        this.chucVuRepo.insert(new ChucVu("CV2", "quan ly"));
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
        request.getRequestDispatcher("/views/chuc_vu/create.jsp").forward(request, response);
    }

    protected void index(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
        request.setAttribute("danhSachCV", this.chucVuRepo.findAll());
        request.getRequestDispatcher("/views/chuc_vu/index.jsp").forward(request, response);
    }

    protected void edit(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
        String ma = request.getParameter("ma");
        ChucVu cv = this.chucVuRepo.findByMa(ma);
        request.setAttribute("cv", cv);
        request.getRequestDispatcher("/views/chuc_vu/edit.jsp").forward(request, response);
    }

    protected void delete(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
        String ma = request.getParameter("ma");
        ChucVu cv = this.chucVuRepo.findByMa(ma);
        this.chucVuRepo.delete(cv);
        response.sendRedirect("/SP23B2_SOF3011_IT17321_war_exploded/chuc_vu/index");
    }

    //hàm store
    protected void store(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
        String ma = request.getParameter("ma");
        String ten = request.getParameter("ten");

        ChucVu cv = new ChucVu( ma, ten);
        System.out.println("post oce");
//        response.getWriter().println(cv.toString());
        this.chucVuRepo.insert(cv);
        System.out.println("");
        response.sendRedirect("/SP23B2_SOF3011_IT17321_war_exploded/chuc_vu/index");

    }
}
