package com.taihe.prototype;



/**
 * Created by hzwzhen on 2017/6/16.
 */
public class Prototype implements Cloneable{

    public Object clone() throws CloneNotSupportedException {
        Prototype prototype = (Prototype) super.clone();
        return prototype;
    }
}
