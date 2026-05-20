import java.util.Scanner;
import java.nio.charset.StandardCharsets;

public class InputExample {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("あなたの名前を入力してください");
        String name = in.next();
        System.out.println(name + "さん、こんにちは");
        in.close();
    }
}
