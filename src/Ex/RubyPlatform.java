package Ex;

public class RubyPlatform extends FlyweightPlatform{
    //享元实现Ruby语言类
    public RubyPlatform(Code code){
        System.out.println("RubyPlatform object created");
        execute(code);
    }
    @Override
    public void execute(Code Ruby) {
        System.out.println("Compiling and executing Ruby code.");
        System.out.println("****************");
        System.out.println("Compiling and executing Ruby code.");
        System.out.println("****************");
    }
}
