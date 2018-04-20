public class Main2 {
    public static void main(String[] args) {

        int counter = 0;
        boolean finish = false;

        for (int i = 0; !finish; i++) {
            if (i > 100 && i < 1000 && i % 5 == 0) {
                System.out.println(i * 5);
                counter++;
            }
            if (counter >= 10) {
                finish = true;
            }
        }
    }
}
