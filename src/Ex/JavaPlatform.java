package Ex;

public class JavaPlatform extends FlyweightPlatform{
    //享元实现Java语言类
    public JavaPlatform(Code code){
        System.out.println("JavaPlatform object created");
        execute(code);
    }
    @Override
    public void execute(Code Java) {
        System.out.println("Compiling and executing Java code.");
        System.out.println("****************");
        System.out.println("Compiling and executing Java code.");
        System.out.println("****************");
    }
}
