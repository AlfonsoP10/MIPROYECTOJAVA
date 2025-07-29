public class problema2 {
    public static void main(String[] args) {

        for (int i = 10; i <= 999; i++) {
            if (i >= 10 && i <= 99) {
                int des = i / 10;
                int u = i % 10;

                if (des == u) {
                    System.out.println(i+" ES PALINDROMO");
                }
            }

            if (i >= 100 && i <= 999) {
                int c = i / 100;
                int u = i % 10;

                if (c == u) {
                    System.out.println(i+" ES PALINDROMO");
                }
            }
        }
    }
}

