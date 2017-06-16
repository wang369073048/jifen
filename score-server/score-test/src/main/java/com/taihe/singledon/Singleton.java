package com.taihe.singledon;

/**
 * Created by hzwzhen on 2017/6/16.
 *
 */
public class Singleton {

    private static Singleton instance = null;

    private static class SingletonFactory {
        private static Singleton instance = new Singleton();
    }

    private static Singleton getIntance () {
        return SingletonFactory.instance;
    }
}
