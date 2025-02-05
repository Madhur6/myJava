
import java.util.*;


public class forEachEx{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // String[] arr = {"harry", "ron", "hermionne", "nurullah", "madhur"};
        // ArrayList<String> arrList = new ArrayList<>(Arrays.asList(arr));
        ArrayList<String> arrList = new ArrayList<>();
        for (int i = 0; i < 5; i++){
            arrList.add(sc.nextLine());
        }

        // for (int i = 0; i < arrList.size(); i++){
        //     System.out.println(arrList.get(i));
        // }
        

        // for-each loop
        for (String s: arrList){
            System.out.println(s);
        }
    }
}