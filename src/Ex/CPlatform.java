package Ex;

public class CPlatform extends FlyweightPlatform{
    //享元实现C语言类
    public CPlatform(Code code){
        System.out.println("CPlatform object created");
        execute(code);
    }
    @Override
    public void execute(Code C) {
        System.out.println("Compiling and executing C code.");
        System.out.println("****************");
        System.out.println("Compiling and executing C code.");
        System.out.println("****************");
    }
}
