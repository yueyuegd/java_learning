package typeinfos.pets;

/**
 * Created by zhangyue-k on 2017/3/14.
 * User:zhangyue-k
 * Date:2017/3/14
 */

/* 该类是Pets的基类*/
public class Indivdual implements Comparable<Indivdual>{

    private static long counter = 0;
    private final long id = counter++;
    private String name;

    public Indivdual(String name) {
        this.name = name;
    }

    public Indivdual() {
    }

    @Override
    public String toString() {

        return getClass().getSimpleName() + (name == null ? "":" " + name);

    }

    public long id(){
        return id;
    }
    public boolean equals(Object o){
        return o instanceof Indivdual && id == ((Indivdual)o).id;
    }

    public int hashCode(){
        int result = 17;
        if(name != null){
            result = 37 * result + name.hashCode();
        }
        result = 37 * result + (int)id;
        return result;
    }
    public int compareTo(Indivdual arg){
        String first = getClass().getSimpleName();
        String argFirst = arg.getClass().getSimpleName();
        int firstCompare = first.compareTo(argFirst);
        if(firstCompare != 0){
            return firstCompare;
        }
        if(name != null && arg.name != null){
            int secondCompare = name.compareTo(arg.name);
            if(secondCompare != 0){
                return secondCompare;
            }
        }

        return (arg.id < id?-1:(arg.id == id?0:1));
    }
}
