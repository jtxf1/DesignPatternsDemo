package design.patterns.creational.singleton;

/**
 * 登记式/静态内部类
 */
public class RegisterForm {
    private static class SingletonHolder {
        private static final RegisterForm INSTANCE = new RegisterForm();
    }

    private RegisterForm() {
    }

    public static RegisterForm getInstance() {
        return SingletonHolder.INSTANCE;
    }

    public void showMessage() {
        System.out.println("Hello World!");
    }

    public static void main(String[] args) {

        //不合法的构造函数
        //编译时错误：构造函数 SingleObject() 是不可见的
        //SingleObject object = new SingleObject();

        //获取唯一可用的对象
        RegisterForm object = RegisterForm.getInstance();

        //显示消息
        object.showMessage();
    }
}