package HttpServletEx;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by zhangyue-k on 2017/3/23.
 * User:zhangyue-k
 * Date:2017/3/23
 */
//使用HttpServt创建接口
//1.扩展抽象实现类HttpServlet
public class HelloServlet extends HttpServlet {

    //2.覆盖相应发送http请求对应的方法
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException{

        //3.获取请求参数
        String clientName = req.getParameter("clientName");
        if(clientName != null){
            clientName = new String(clientName.getBytes("ISO-8859-1"),"GB2312");
        }else{
            clientName = "我的朋友";
        }

        //4.生成HTTP响应信息
        PrintWriter out;
        String title = "hollowServlet";
        String heading1= "HelloServlet的doGet方法的输出:";
        resp.setContentType("text/html;charset=GB2312");
        out = resp.getWriter();

        out.print("<HTML><HEAD><TITLE>" + title + "</TITLE>");
        out.print("</HEAD><BODY>");
        out.print(heading1);
        out.println("<h1><p>" + clientName + ":您好</h1>");
        out.print("</BODY></HTML>");

        out.close();


    }
}
