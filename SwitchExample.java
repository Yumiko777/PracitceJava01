public class SwitchExample {
    public static void main(String[] args) {
        int score = 3;
        switch (score) {
        case 1:
            System.out.println("もっと頑張りましょう");
            // switchブロックを抜ける
            break;
        case 2:
            System.out.println("もう少し頑張りましょう");
            break;
        case 3:
            System.out.println("普通です");
            break;
        case 4:
            System.out.println("良くできました");
            break;
        case 5:
            System.out.println("大変よくできました");
            break;
        // 上記以外の場合
        default:
            System.out.println("想定されていない点数です");
        }
        System.out.println("switchブロックを抜けました");
    }   
}
