package containers;

import java.util.List;

/**
 * Created by zhangyue-k on 2017/3/14.
 * User:zhangyue-k
 * Date:2017/3/14
 */
/*  针对不同的容器使用Test对象*/
    /*???*/
public class Tester<C> {
    public static int fieldWeidth = 8;
    public static TestParam[] defaultParams = TestParam.array(10,5000,100,5000,1000,5000,10000,500);
    protected C initialize(int size){
        return container;
    }
    protected C container;
    private String headline = "";
    private List<Test<C>> tests;
    private static String stringField(){
        return "%" + fieldWeidth + "s";
    }
    private static String numberField(){
        return "%" + fieldWeidth + "d";
    }
    private static int sizeWidth = 5;
    private static String sizeField = "%" + sizeWidth + "s";
    private TestParam[] paramList = defaultParams;
    public Tester(C container,List<Test<C>> tests){
        this.container = container;
        this.tests = tests;
        if(container != null){
            headline = container.getClass().getSimpleName();
        }
    }
    public Tester(C container,List<Test<C>> tests,TestParam[] paramList){
        this(container,tests);
        this.paramList = paramList;
    }
    public void setHeadline(String newHeadline){
        headline = newHeadline;
    }
    public static <C> void run(C cntnr,List<Test<C>> tests){
        new Tester<C>(cntnr,tests).timedTest();
    }
    public static <C> void run(C cntnr,List<Test<C>> tests,TestParam[] paramList){
        new Tester<C>(cntnr,tests,paramList).timedTest();
    }
    private void displayHeader(){
        int width = fieldWeidth * tests.size() + sizeWidth;
        int dashLength = width - headline.length() - 1;
        StringBuilder head = new StringBuilder(width);
        for(int i = 0;i < dashLength;i++){
            head.append('-');
        }
        head.append(' ');
        head.append(headline);
        head.append(' ');
        for(int i = 0;i < dashLength / 2;i++){
            head.append(' ');
        }
        System.out.println(head);
        System.out.format(sizeField,"size");
        for(Test test:tests){
            System.out.format(stringField(),test.name);
        }
        System.out.println();
    }

    public void timedTest(){
        displayHeader();
        for(TestParam param:paramList){
            System.out.format(sizeField,param.size);
            for(Test<C> test:tests){
                C kcontainer = initialize(param.size);
                long start = System.currentTimeMillis();
                int reps = test.test(kcontainer,param);
                long duration = System.currentTimeMillis() - start;
                long timePerRep = duration / reps;
                System.out.format(numberField(), timePerRep);

            }
            System.out.println();
        }
    }

}
