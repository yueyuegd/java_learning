package enumerated;

/**
 * Created by zhangyue-k on 2017/4/12.
 * User:zhangyue-k
 * Date:2017/4/12
 */
//除了不能继承于enum之外，基本上可以将enum看做是一个普通的类，所以可以向其中加入方法也可以使用main方法
    //可以为此提供一个构造器用于专门负责为每一个枚举实例返回对自身的描述
public enum OzWitch {
    WEST("Miss Gulch,aka the Wiched Witch of North"),
    NORTH("Glinda,the Good Witch of the North "),
    EAST("Wiched Witch od the East,wearer of the Ruby " + "Slippers,crushed by Doroth's house"),
    SOUTH("Good by inference,but missing");

    private String description;

    OzWitch(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public static void main(String[] args) {
        System.out.println(OzWitch.values().toString());
        for(OzWitch witch:OzWitch.values()){
            System.out.println(witch + ":" + witch.getDescription());
        }
    }
}
