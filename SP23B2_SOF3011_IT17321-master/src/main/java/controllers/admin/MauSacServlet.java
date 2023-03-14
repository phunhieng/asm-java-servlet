package controllers.admin;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import view_model.MauSac;

import java.io.IOException;
import java.util.ArrayList;

@WebServlet({"/mau_sac/index",
        "/mau_sac/create",
        "/mau_sac/edit",
        "/mau_sac/delete",
        "/mau_sac/store",
        "/mau_sac/update"})
public class MauSacServlet extends HttpServlet {
    private ArrayList<MauSac> listMS = new ArrayList<>();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String uri = request.getRequestURI();
        if(uri.contains("create")){
            this.create(request,response);
        }else if (uri.contains("index")){
            this.index(request,response);
        }else {
            this.create(request,response);
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
        request.getRequestDispatcher("/views/mau_sac/index.jsp").forward(request,response);
    }

    //hàm store
    protected void store(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        String ma = request.getParameter("ma");
        String ten = request.getParameter("ten");

        MauSac ms = new MauSac(ma,ten);
        listMS.add(ms);
        response.getWriter().println(ms.toString());

    }

}
