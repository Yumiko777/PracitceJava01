// ループ処理のネスト
public class TimesTable {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                int value = i * j;
                System.out.println(i + "✖️" + j + "=" + value);
                System.out.println("   ");
            }
            System.out.println("");
        }
    } 
}
