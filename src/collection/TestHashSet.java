package collection;



import java.util.HashSet;
import java.util.Set;

public class TestHashSet {

    public static void main(String[] args) {

        // 1. Create and initialize countries_set
        Set<String> countries_set = new HashSet<>();

        countries_set.add("USA");
        countries_set.add("China");
        countries_set.add("Japan");
        countries_set.add("Germany");
        countries_set.add("France");

        // 2. Display the number of elements
        System.out.println("Number of countries: " + countries_set.size());

        // 3. Display the elements
        System.out.println("\nCountries:");
        displaySet(countries_set);

        // 4. Modify Germany by Tunisia
        countries_set.remove("Germany");
        countries_set.add("Tunisia");

        System.out.println("\nAfter modification:");
        displaySet(countries_set);

        // 5. Clear the set
        countries_set.clear();

        System.out.println("\nAfter clearing:");
        displaySet(countries_set);
    }

    private static void displaySet(Set<String> set) {

        for (String country : set) {
            System.out.println("- " + country);
        }
    }
}
