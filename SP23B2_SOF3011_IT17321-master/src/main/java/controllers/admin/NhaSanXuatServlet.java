package controllers.admin;


import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
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
    private ArrayList<NhaSanXuat> listNSX = new ArrayList<>();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String uri = request.getRequestURI();
        if(uri.contains("create")){
            this.create(request, response);
        }else if (uri.contains("index")){
            this.index(request, response);
        }else {
            this.create(request, response);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.store(request,response);
    }

    protected void create(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/views/nha_san_xuat/create.jsp").forward(request,response);
    }

    protected void index(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/views/nha_san_xuat/index.jsp").forward(request,response);
    }

    protected void store(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String ma = request.getParameter("ma");
        String ten = request.getParameter("ten");

        NhaSanXuat nsx = new NhaSanXuat(ma,ten);
        listNSX.add(nsx);
        response.getWriter().println(nsx.toString());

    }

}
