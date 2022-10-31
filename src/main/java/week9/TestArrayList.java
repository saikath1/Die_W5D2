package week9;

import java.util.ArrayList;
public class TestArrayList {
    public static void main(String[] args) {
        // Create a list to store cities
        ArrayList<String> cityList = new ArrayList<>();
        // Add some cities in the list
        cityList.add("Milwaukee");
        // cityList now contains [Milwaukee]
        cityList.add("Denver");
        // cityList now contains [Milwaukee, Denver]
        cityList.add("Paris");
        // cityList now contains [Milwaukee, Denver, Paris]
        cityList.add("Miami");
        // cityList now contains [Milwaukee, Denver, Paris, Miami]
        cityList.add("Chicago");
        // Contains [Milwaukee, Denver, Paris, Miami, Chicago]
        cityList.add("Tokyo");
        // Contains [Milwaukee, Denver, Paris, Miami, Chicago, Tokyo]
        System.out.println("List size? " + cityList.size());
        System.out.println("Is Miami in the list? " +
                cityList.contains("Miami"));
        System.out.println("The location of Milwuakee in the list? " + cityList.indexOf("Milwaukee"));
        System.out.println("Is the list empty? " + cityList.isEmpty()); // Print false
        // Insert a new city at index 2
        cityList.add(2, "Boston");
        // Contains [Milwaukee, Denver, Boston, Paris, Miami, Chicago, Tokyo]
        // Remove a city from the list
        cityList.remove("Miami");
        // Contains [London, Denver, Boston, Paris, Chicago, Tokyo]
        // Remove a city at index 1
        cityList.remove(1);
        // Contains [London, Boston, Paris, Chicago, Tokyo]
        // Display the contents in the list
        System.out.println(cityList.toString());
        // Display the contents in the list in reverse order
        for (int i = cityList.size() - 1; i >= 0; i--) {
            System.out.print(cityList.get(i) + " ");
        }
        System.out.println();
//        for (String element : cityList) {
//            System.out.println("FOr each loop"+cityList);
//        }
        cityList.forEach(element -> {
            System.out.println(element);
        });
        //Traversing list through for-each loop
        for(String element:cityList)
            System.out.println(cityList);
    }
}