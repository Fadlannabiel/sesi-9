
import java.util.ArrayList;

public class ArrayL {
    public static void main(String[] args) {
        
        ArrayList<String> myList = new ArrayList<>();
        myList.add("20210040107");
        myList.add("fadlan");
        myList.add("21F");
        myList.add(2, "dlan");
        
        for(String list : myList){
            System.out.println(list);
        }
    }
}
