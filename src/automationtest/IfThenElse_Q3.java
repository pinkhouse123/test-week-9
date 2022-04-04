package automationtest;

public class IfThenElse_Q3 {

    public static boolean isTeen(int age) {
        if (age <= 18) {
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {
        IfThenElse_Q3 obj = new IfThenElse_Q3();
        System.out.println("15 is equal to " + obj.isTeen(15));
        System.out.println("25 is equal to " + obj.isTeen(25));

    }

}
