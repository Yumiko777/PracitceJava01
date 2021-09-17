// キーボードからの入力を受け取る
import java.util.Scanner;

public class ImputExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("あなたのお名前は？");
        // コンソールに入力された文字列を受け取り変数nameに代入
        String name = in.next();
        System.out.println(name + "さん、こんにちは。");
        // コンソールからの受け取りを終了
        in.close();
    }
}