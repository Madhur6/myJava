import java.util.*;

public class consumeBufferEx1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> arrList = new ArrayList<>();
        ArrayList<String> arrList1 = new ArrayList<>();

        for (int i = 0; i < 4; i++){
            System.out.print("Enter integer: ");
            arrList.add(sc.nextInt()); // it is possible...
            sc.nextLine();

            System.out.print("Enter string: ");
            arrList1.add(sc.nextLine());
        }

        System.out.println("Our integer array: " + arrList);
        System.out.println("Our string array: " + arrList1);

    }
}
