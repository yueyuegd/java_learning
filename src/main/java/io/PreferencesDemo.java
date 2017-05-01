package io;

import java.util.prefs.Preferences;

/**
 * Created by zhangyue-k on 2017/4/5.
 * User:zhangyue-k
 * Date:2017/4/5
 */
/*  preference是一个键值对集合，村春在一个节点层次结构中*/
public class PreferencesDemo {
    public static void main(String[] args) throws Exception{
        Preferences prefs = Preferences.userNodeForPackage(PreferencesDemo.class);
        prefs.put("Location","Oz");
        prefs.put("Footwear","Ruby Slippers");
        prefs.putInt("Companions",4);
        prefs.putBoolean("Are there witches",true);
        int usageCount = prefs.getInt("UsageCount",0);
        System.out.println(usageCount);
        usageCount++;
        prefs.putInt("UsageCount",usageCount);
        for(String key:prefs.keys()){
            System.out.println(key + ":" + prefs.get(key,null));
        }
        System.out.println("How many companions does Dorothy have? " + prefs.getInt("Companions",0));

    }
}
