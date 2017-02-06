package equalsFunction;

/**
 * Created by zy on 2016/10/30.
 */

//子类
public class Employee extends Person{

    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Employee(String name,int id) {
        super(name);
        this.id = id;
    }

    /*重写equals方法*/

    @Override
    public boolean equals(Object o) {

        if(o instanceof Employee){
            Employee e = (Employee)o;
            return super.equals(o)&&id==e.getId();
        }
        return false;

    }

}


