
interface S1 {
    default void show(){
        System.out.println("This is show from s1.");
    }
}


interface S2 {
    default void show(){
        System.out.println("This is show from s2.");
    }
}

class Testing implements S1, S2 {
    @Override
    public void show(){
        S1.super.show();

        S2.super.show();
    }
}



interface Payments {
    public void processPayment(long credit_number, double amount);
}

abstract class onlinePayment implements Payments {
    abstract boolean authenticatePayment(long credit_number, double amount);
}


class creditCardPayment extends onlinePayment {
    @Override
    public boolean authenticatePayment(long credit_number, double amount){
        boolean res = authenticate_card(credit_number);
        System.out.println("The authentication is in the process!");

        return res;
    }

    @Override
    public void processPayment(long credit_number, double amount){
        boolean res = authenticatePayment(credit_number, amount);

        if (res){
            System.out.println("The payment of $" + amount + " is now successfull!");
        } else {
            System.out.println("Payment failed! Check your credit card number.");
        }
    }


    public static boolean authenticate_card(long credit_number){
        long temp = credit_number;
        // String str = Long.toString(credit_number);
        // int counter = str.length();

        int counter = (int)(Math.log10(credit_number)+1);

        int total_sum = check_sum(credit_number);

        if (total_sum % 10 == 0){
            int amex_start = (int)(temp/10000000000000L);
            if (amex_start == 34 || amex_start == 37 && counter == 15){
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public static int check_sum(long credit_number){
        int sum = 0;
        int counter = 0;

        while (credit_number > 0){
            int temp = (int)(credit_number % 10);
            credit_number = credit_number / 10;

            if (counter % 2 == 0){
                sum += temp;
            } else {
                temp = 2*temp;
                sum += temp / 10;
                sum += temp % 10;
            }
            counter+=1;
        }

        return sum;
    }
}



public class interfaceEx {
    public static void main(String[] args){
        Testing t = new Testing();
        t.show();
    }
}