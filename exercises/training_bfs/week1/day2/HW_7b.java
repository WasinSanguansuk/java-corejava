package exercises.training_bfs.week1.day2;

public class HW_7b {

    void printNumberInWord(int number) {
       switch (number) {
           case 1: {
               System.out.println("One");
               break;
           }
           case 2: {
               System.out.println("Two");
               break;
           }
           case 3: {
               System.out.println("Three");
               break;
           }
           case 4: {
               System.out.println("Four");
               break;
           }
           case 5: {
               System.out.println("Five");
               break;
           }
           case 6: {
               System.out.println("Six");
               break;
           }
           case 7: {
               System.out.println("Seven");
               break;
           }
           case 8: {
               System.out.println("Eight");
               break;
           }
           case 9: {
               System.out.println("Nine");
               break;
           }
           default: {
               System.out.println("Other");
           }
       }
    }

    public static void main(String[] args) {

        HW_7b hw7 = new HW_7b();

        int num1 = 7;
        hw7.printNumberInWord(num1);

        int num2 = 0;
        hw7.printNumberInWord(num2);

        int num3 = 20;
        hw7.printNumberInWord(num3);
    }
}
