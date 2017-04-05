package io;

import java.io.*;

/**
 * Created by zhangyue-k on 2017/3/20.
 * User:zhangyue-k
 * Date:2017/3/20
 */
/*  标准I/O重定向
*   如果我们突然开始在显示器上创建大量输出，而这些输出滚动得太快以至于无法阅读时，
*   重定向输出就显得极为有用，对于我们想重复测试某个特定用户的输入序列的命令行程序来说
*   重定向输入就很有价值*/
public class redirection {

    public static void main(String[] args) throws IOException{

        PrintStream console = System.out;
        BufferedInputStream in = new BufferedInputStream(
                new FileInputStream("D:\\project-git\\learnings\\java_learning_FInal\\src\\main\\java\\io\\redirection.java")
        );
        PrintStream out = new PrintStream(
                new BufferedOutputStream(
                        new FileOutputStream("D:\\project-git\\learnings\\java_learning_FInal\\src\\main\\java\\io\\test.out")
                )
        );
        System.setIn(in);
        System.setOut(out);
        System.setErr(out);
        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in)
        );
        String s;
        while ((s = br.readLine()) != null) {
            System.out.println(s);
        }
        out.close();
        System.setOut(console);

    }


}
