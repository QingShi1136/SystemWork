package Ex;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
public class FlyweightFactory {
    //享元工厂
    //定义一个池容器
    private static Map<String,Code> map = new ConcurrentHashMap<>();
    public static  Code getCode(String code){
        //如果不存在，则创建入池
        if(!map.containsKey(code)){
            //构造对应语言类型
            switch ("code"){
                case "java":{
                    Code java = new Code("code");
                    map.put(code,java);
                    return java;
                }
                case "C":{
                    Code C = new Code("code");
                    map.put(code,C);
                    return  C;
                }
                case "Ruby":{
                    Code Ruby = new Code("code");
                    map.put(code,Ruby);
                    return  Ruby;
                }
            }
        }
        //存在直接返回
        return  map.get(code);
    }
    }
