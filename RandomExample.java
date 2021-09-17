//  Math.random()は毎回異なるランダムな値を得れる
public class RandomExample {
    public static void main(String[] args) {
        // 3つの要素を持つString型の配列の宣言と初期化
        String[] janken = {"グー", "チョキ", "パー"};
        int i = (int) (Math.random()*2);
        System.out.println(janken[i]);
    } 
}
