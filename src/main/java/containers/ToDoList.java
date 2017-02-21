package containers;



import java.util.PriorityQueue;

/**
 * Created by zhangyue-k on 2017/2/20.
 */

//to-do列表  该列表中包括一个字符串和一个主要的以及次要的优先级值，
// 该列表的排序顺序也是通过实现Comparable而控制的
public class ToDoList extends PriorityQueue<ToDoList.ToDoItem> {

    static class ToDoItem implements Comparable<ToDoItem>{
        private char primary;
        private int secondary;
        private String item;

        public ToDoItem(char primary, int secondary, String item) {
            this.primary = primary;
            this.secondary = secondary;
            this.item = item;
        }


        public int compareTo(ToDoItem o) {
            if(primary > o.primary){
                return 1;
            }
            if(primary == o.primary){
                if(secondary > o.secondary){
                    return 1;
                }else if(secondary == o.secondary){
                    return 0;
                }
            }
            return -1;
        }

        @Override
        public String toString() {
            return Character.toString(primary) + secondary + ":" + item;
        }


    }

    public void add(String td,char pri,int sec){
        super.add(new ToDoItem(pri,sec,td));
    }

    public static void main(String[] args) {
        ToDoList toDoList = new ToDoList();
        toDoList.add("Empty trash",'C',4);
        toDoList.add("Feed dog",'A',2);
        toDoList.add("Feed bird",'B',7);
        toDoList.add("Mow lawn",'C',3);
        toDoList.add("Water lawn",'A',1);
        toDoList.add("Feed cat",'B',1);
         while (!toDoList.isEmpty()){
             System.out.println(toDoList.remove());
         }
    }




}
