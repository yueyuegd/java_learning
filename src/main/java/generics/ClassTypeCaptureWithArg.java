package generics;

/**
 * Created by zhangyue_k on 2016/12/8.
 */
//使用类型标签和反射
class BuildingArg{

}
public class ClassTypeCaptureWithArg<T> {
    private Class<T> kind;

    public ClassTypeCaptureWithArg(Class<T> kind) {
        this.kind = kind;
    }
    //使用newInstance()的参数版本来创建某个类的对象
    public Object createNew(){
        try {
            return kind.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public String toString() {
        return "ClassTypeCaptureWithArg{" +
                "kind=" + kind +
                '}';
    }

    public static void main(String[] args) {
        ClassTypeCaptureWithArg<BuildingArg> classTypeCaptureWithArg =
                new ClassTypeCaptureWithArg<BuildingArg>(BuildingArg.class);
        System.out.println(classTypeCaptureWithArg.createNew());
    }
}


