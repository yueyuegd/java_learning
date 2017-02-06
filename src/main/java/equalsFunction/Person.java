package equalsFunction;

/**
 * Created by zy on 2016/10/30.
 */

//父类
public class Person {

    protected String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if(o instanceof Person){
            Person p = (Person)o;
            if(p.getName()==null||name==null){
                return false;
            }else{
                return name.equalsIgnoreCase(p.getName());
            }
        }
        return false;

    }

}
