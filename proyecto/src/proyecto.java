public class proyecto {
    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++) {
            int num = (int)(Math.random() * 10) + 1; 
            System.out.println("Número " + i + ": " + num);
        }
    }
}
