public class NestedLoop {
    static public void main(String[] args) {
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(Integer.toString(i));
            }
            System.out.println();
        }
    }
}
