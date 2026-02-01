import java.util.*;

public class CollectionsTasks2 {

public static void main(String[] args) {
// TODO: Create ArrayList with email IDs (include duplicates)
ArrayList<String> withDuplicates = new ArrayList<>();

withDuplicates.add("test@test.com");
withDuplicates.add("test@test.com");
withDuplicates.add("marco@polo.com");
withDuplicates.add("Alejanndro@polo.com");
withDuplicates.add("Papolo@polo.com");
withDuplicates.add("Brian@polo.com");





System.out.println(withDuplicates);
// TODO: Remove duplicates using HashSet

Set<String> noDupiSet = new HashSet<>(withDuplicates);


// TODO: Maintain order using LinkedHashSet

LinkedHashSet<String> maintainOrdering = new LinkedHashSet<>(noDupiSet);



// TODO: Sort emails alphabetically using TreeSet

TreeSet<String> alphaEmails = new TreeSet<>(noDupiSet);



// TODO: Display all three sets
System.out.println(maintainOrdering);  
System.out.println(noDupiSet);// HashSet does not allow duplicates, as same values go to the same place in memory, this forces the Array to combine all the likes values 
System.out.println(alphaEmails); // TreeSet uses natural order, so Strings will be automatically ordered from A -> Z.

// TODO: Explain the differences
}
}