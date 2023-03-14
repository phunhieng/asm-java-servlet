package controllers.admin;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
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
    public ArrayList<ChucVu> listCV = new ArrayList<>();

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


    //hàm create
    protected void create(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
        request.getRequestDispatcher("/views/chuc_vu/create.jsp").forward(request, response);
    }

    protected void index(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
        request.getRequestDispatcher("/views/chuc_vu/index.jsp").forward(request, response);
    }
    protected void edit(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
        request.getRequestDispatcher("/views/chuc_vu/edit.jsp").forward(request, response);
    }

    //hàm store
    protected void store(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
        String ma = request.getParameter("ma");
        String ten = request.getParameter("ten");


        ChucVu cv = new ChucVu(ma, ten);
        System.out.println("post oce");
        response.getWriter().println(cv.toString());
//        response.sendRedirect();

        //tạo arraylist và thêm vào
        listCV.add(cv);

    }
}
