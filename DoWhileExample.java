// 条件式が最初にtrueでもfalseでも必ず1回はブロック内の命令文が実行されその後で条件式が評価される。falseの場合はループを抜ける
public class DoWhileExample {
    public static void main(String[] args) {
        int i = 5;
        do {
            System.out.println(i);
            i--;
        } while (i > 0);
    } 
}
