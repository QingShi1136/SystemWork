package Ex8;

import java.util.Scanner;

public class Client {
    public static void main(String[] args){
        /*获取图片地址方法getimg();
        */
        //判断图片类型，此处使用输入代替类型读取，输入类型即为图片类型
        Scanner data =new Scanner(System.in);
        System.out.println("请输入图片类型");
        String type= data.next();
        switch (type) {
            case "GIF":
                GifFactory gifFactory = new GifFactory();
                gifFactory.GetView().Show(type);
                break;
            case "JPG":
                JPGFactory jpgFactory = new JPGFactory();
                jpgFactory.GetView().Show(type);
                break;
        }
    }
}
