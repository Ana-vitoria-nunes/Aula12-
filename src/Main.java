public class Main {
    public static void main(String[] args) {
        int i=0;
        do {
            if(i%2==0) {
                System.out.println("Esse número é par: " + i);
            }
            else {
                System.out.println("-------------------------");
            }
            i++;
        }while (i<=100);

    }
}