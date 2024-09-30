package design.patterns.creational.singleton;

/**
 * 双检锁/双重校验锁（DCL，即 double-checked locking）
 */
public class DoubleCheckedLocking {

    private volatile static DoubleCheckedLocking doubleCheckedLocking;

    private DoubleCheckedLocking() {
    }

    public static synchronized DoubleCheckedLocking getInstance() {
        if (doubleCheckedLocking == null) {
            synchronized (DoubleCheckedLocking.class) {
                if (doubleCheckedLocking == null) {
                    doubleCheckedLocking = new DoubleCheckedLocking();
                }
            }
        }
        return doubleCheckedLocking;
    }

    public void showMessage() {
        System.out.println("Hello World!");
    }

    public static void main(String[] args) {

        //不合法的构造函数
        //编译时错误：构造函数 SingleObject() 是不可见的
        //SingleObject object = new SingleObject();

        //获取唯一可用的对象
        DoubleCheckedLocking object = DoubleCheckedLocking.getInstance();

        //显示消息
        object.showMessage();
    }
}