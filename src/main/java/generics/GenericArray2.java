package generics;

/**
 * Created by zhangyue_k on 2016/12/8.
 */
//
public class GenericArray2<T> {
    private Object[] array;

    public GenericArray2(int sz) {
        array = new Object[sz];
    }
    public void put(int index,T item){
        array[index] = item;
    }
    @SuppressWarnings("unchecked")
    public T get(int index){
        return (T)array[index];
    }
    @SuppressWarnings("unchecked")
    public T[] rep(){
        return (T[])array;
    }

    public static void main(String[] args) {
        GenericArray2<Integer> genericArray2 = new GenericArray2<Integer>(10);
        for(int i=0;i<10;i++){
            genericArray2.put(i,i);
        }
        for(int i=0;i<10;i++){
            System.out.print(genericArray2.get(i)+" ");
        }
        System.out.println();
        try{
            Integer[] integers = genericArray2.rep();
        }catch (Exception e){
            System.out.println(e);
        }

    }
}
