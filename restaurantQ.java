import java.util.*;

class Restaurant {
    private int id;
    private int rating;
    private String name;
    private int noOfDishes;
    private HashMap<String, Integer> freqMap;

    public Restaurant (int id, int rating, String name, int noOfDishses){
        this.id = id;
        this.rating = rating;
        this.name = name;
        this.noOfDishes = noOfDishses;
        this.freqMap = new HashMap<>();
    }

    public int getId(){return id;}
    public void setId(int id){this.id = id;}

    public int getRating(){return rating;}
    public void setRating(int rating){this.rating = rating;}

    public String getName(){return name;}
    public void setName(String name){this.name = name;}

    public int getNoOfDishes(){return noOfDishes;}
    public void setNoOfDishes(int noOfDishes){this.noOfDishes = noOfDishes;}

    public HashMap<String, Integer> getFreqMap(){return freqMap;}
    public void setFreqMap(String dish, int price){this.freqMap.put(dish, price);}
}

public class restaurantQ{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter no of restaurants: ");
        int n = sc.nextInt();

        ArrayList<Restaurant> restList = new ArrayList<>();
        for (int i = 0; i < n; i++){
            System.out.print("Enter id: ");
            int id = sc.nextInt();

            System.out.print("Enter rating: ");
            int rating = sc.nextInt();sc.nextLine();

            System.out.print("Enter name: ");
            String name = sc.nextLine();

            System.out.print("Enter no of dishes: ");
            int noOfDishes = sc.nextInt();

            Restaurant r = new Restaurant(id, rating, name, noOfDishes);
            for (int j = 0; j < noOfDishes; j++){
                System.out.print("Enter price: ");
                int price = sc.nextInt();sc.nextLine();

                System.out.print("Enter dish name: ");
                String dish = sc.nextLine();

                r.setFreqMap(dish, price);
            }

            restList.add(r);
        }

        int len = restList.size();
        for (int i = 0; i < len; i++){
            System.out.println("*-----------*-------------*------------*");
            System.out.println("Restaurant " + (i+1) + ": ");
            Restaurant rObj = restList.get(i);
            System.out.println("restaurant " + (i+1) + " id: " + rObj.getId());
            System.out.println("restaurant " + (i+1) + " rating: " + rObj.getRating());
            System.out.println("restaurant " + (i+1) + " name: " + rObj.getName());
            System.out.println("restaurant " + (i+1) + " no of dishes: " + rObj.getNoOfDishes());
            System.out.println("*-----------*-------------*------------*");
        }
    }
}


// Example Input [ Copy the example input to run this program ]:
// 2
// 001
// 9
// alphonso`s
// 2
// 345
// fried-rice
// 567
// hot-chocolate
// 002
// 8
// china-town
// 2
// 754
// noodles
// 567
// dumplings