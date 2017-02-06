package generics;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by zhangyue_k on 2016/12/7.
 */
//如果引入类型标签就可以使用动态isInstance()
//修改:添加一个Map<String,Class<?>>  添加一个addType(String typename,Class<?> kind)  添加一个createNew(String typename)产生一个新实例或是错误信息
class Building{}
class House extends Building{}
public class ClassTypeCapture<T> {
    Class<T> kind;
    //增加处
    Map<String,Class<?>> maps = new HashMap<String, Class<?>>();

    public ClassTypeCapture(Class<T> kind) {
        this.kind = kind;
    }
    //增加处
    public void addType(String typename,Class<?> kind){
        maps.put(typename,kind);
    }
    //增加处
    public Object createNew(String typename){
        Class<?> type = maps.get(typename);
        try {
            return type.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }

    public boolean f(Object arg){
        return kind.isInstance(arg);
    }

    public static void main(String[] args) {
        ClassTypeCapture<Building> buildingClassTypeCapture =
                new ClassTypeCapture<Building>(Building.class);
        System.out.println(buildingClassTypeCapture.f(new Building()));
        System.out.println(buildingClassTypeCapture.f(new House()));

        ClassTypeCapture<House> houseClassTypeCapture =
                new ClassTypeCapture<House>(House.class);
        System.out.println(houseClassTypeCapture.f(new Building()));
        System.out.println(houseClassTypeCapture.f(new House()));
    }
}
