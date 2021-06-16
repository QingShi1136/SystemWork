package Ex;

public class Client {
    public static void main(String[] args){
    FlyweightFactory factory = new FlyweightFactory();
    //Java语言
    Code java = FlyweightFactory.getCode("java");
    FlyweightPlatform platform = new JavaPlatform(java);
    //C语言
    Code C = FlyweightFactory.getCode("C");
    FlyweightPlatform platform2 = new CPlatform(C);
    //Ruby语言
    Code Ruby = FlyweightFactory.getCode("Ruby");
    FlyweightPlatform platform3 = new RubyPlatform(Ruby);
    }
}
