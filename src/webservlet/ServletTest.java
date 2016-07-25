package webservlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by TikT on 2016/7/18.
 */
@WebServlet(name = "ServletTest")
public class ServletTest extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("收到doPost请求");
        //向网页发送
        PrintWriter out = response.getWriter();
        response.setContentType("text/html;charset=utf-8");//是其输出支持html标签
        out.print("<strong>Hello I am Servlet Post</strong>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("收到doGet请求");
        //向网页发送
        PrintWriter out = response.getWriter();
        response.setContentType("text/html;charset=utf-8");//是其输出支持html标签
        out.print("<strong>Hello I am Servlet Get</strong>");
    }
}
