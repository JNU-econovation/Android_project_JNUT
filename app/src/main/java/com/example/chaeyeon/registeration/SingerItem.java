package com.example.chaeyeon.registeration;

/**
 * Created by ChaeYeon on 2017-05-31.
 */

public class SingerItem {

    String name;
    int resId;

    public SingerItem(String name) {
        this.name = name;
    }
    //디폴트 생성자

    public SingerItem(String name, int resId){
        this.name = name;
        //this.mobile = mobile;
        //this.age = age;
        this.resId = resId;
    }

    //public int getAge(){return age;}

   // public void setAge(int age)this.age = age;}

    public int getResId(){
        return resId;

    }

    public void setResId(int resId){
        this.resId = resId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name){this.name = name;}

}

