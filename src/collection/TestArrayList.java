package collection;



import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestArrayList {

    public static void main(String[] args) {

        // 1. Create and initialize countries_list
        List<String> countries_list = new ArrayList<>();

        countries_list.add("USA");
        countries_list.add("China");
        countries_list.add("Japan");
        countries_list.add("Germany");
        countries_list.add("France");

        // 2. Display the number of elements
        System.out.println("Number of countries: " + countries_list.size());

        // 3. Display the elements
        System.out.println("\nCountries:");
        displayList(countries_list);

        // 4. Modify the element at position 3
        countries_list.set(3, "Tunisia");

        System.out.println("\nAfter modification:");
        displayList(countries_list);

        // 5. Sort the list alphabetically
        Collections.sort(countries_list);

        System.out.println("\nAfter sorting:");
        displayList(countries_list);

        // 6. Clear the list
        countries_list.clear();

        System.out.println("\nAfter clearing:");
        displayList(countries_list);
    }

    private static void displayList(List<String> list) {

        for (String country : list) {
            System.out.println("- " + country);
        }
    }
}
