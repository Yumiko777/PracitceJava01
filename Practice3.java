public class Practice3 {
    public static void main(String[] args) {
        int[] counts = {1, 3, 5, 6, 5, 2};
        for (int i = 0; i < counts.length; i++) {
            System.out.println(i + ":");
            for (int j = 0; j < counts[i]; j++) {
                System.out.println("*");
            }
            System.out.println("");
        }
    }  
}
