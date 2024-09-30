package design.patterns.creational.singleton;

/**
 * 饿汉式
 */
public class HungryStyleSafety {

    private static final HungryStyleSafety instance = new HungryStyleSafety();
    private HungryStyleSafety (){}

    public static synchronized  HungryStyleSafety getInstance() {
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
        HungryStyleSafety object = HungryStyleSafety.getInstance();

        //显示消息
        object.showMessage();
    }
}