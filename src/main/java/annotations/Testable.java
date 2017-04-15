package annotations;

import org.junit.Test;

/**
 * Created by zhangyue-k on 2017/4/12.
 * User:zhangyue-k
 * Date:2017/4/12
 */
public class Testable {

    public void execute(){
        System.out.println("Executing...");
    }
    @Test
    void testExecute(){
        execute();
    }
}
