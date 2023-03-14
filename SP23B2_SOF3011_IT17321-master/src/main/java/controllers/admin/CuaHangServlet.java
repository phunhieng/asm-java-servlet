package controllers.admin;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
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
    private ArrayList<CuaHang> listCH = new ArrayList<>();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String uri = request.getRequestURI();
        if (uri.contains("create")) {
            this.create(request, response);
        }else if(uri.contains("index")) {
            this.index(request, response);
        }else if(uri.contains("edit")) {
//            this.ed(request, response);
        }else {
            this.create(request, response);
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
        request.getRequestDispatcher("/views/cua_hang/index.jsp").forward(request, response);
    }
    protected void edit(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
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
        response.getWriter().println(ch.toString());

        //tạo arraylist và thêm vào
        listCH.add(ch);

    }
}
