package design.patterns.creational.singleton;

/**
 * 懒汉式，线程不安全
 */
public class LazyStyle {
    private static LazyStyle instance;
    private LazyStyle (){}

    public static LazyStyle getInstance() {
        if (instance == null) {
            instance = new LazyStyle();
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
        LazyStyle object = LazyStyle.getInstance();

        //显示消息
        object.showMessage();
    }
}