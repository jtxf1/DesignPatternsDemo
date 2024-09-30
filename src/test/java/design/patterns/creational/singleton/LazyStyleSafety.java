package design.patterns.creational.singleton;

/**
 * 懒汉式，线程安全
 */
public class LazyStyleSafety {

    private static LazyStyleSafety instance;
    private LazyStyleSafety (){}

    public static synchronized  LazyStyleSafety getInstance() {
        if (instance == null) {
            instance = new LazyStyleSafety();
        }
        return instance;
    }
    public void showMessage(){
        System.out.println("Hello World!");
    }
    public static void main(String[] args) {

        //不合法的构造函数
        //编译时错误：构造函数 SingleObject() 是不可见的
        //SingleObject object = new SingleObject();

        //获取唯一可用的对象
        LazyStyleSafety object = LazyStyleSafety.getInstance();

        //显示消息
        object.showMessage();
    }
}