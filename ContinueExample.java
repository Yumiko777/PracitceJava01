// ループ内の処理をスキップする
// i % 2 == 0がtrueの場合、以降の処理をスキップして次の繰り返し処理に移る
public class ContinueExample {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                continue;
            } 
            sum += i;
            System.out.println("変数sumに" + i + "を加えました。 sumは" + sum);
        }
    }  
}
