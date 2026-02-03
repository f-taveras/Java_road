import java.util.*;

class Product implements Comparable<Product>{
// TODO: Add fields: id, name, price


private int id;
private Double price;
private String name;



@Override
public int compareTo(Product other){
    return Double.compare(this.price,other.price);
}
// TODO: Add constructor

public Product(int id, Double price, String name){
    this.id = id;
    this.price = price;
    this.name = name;
}

// TODO: Implement Comparable<Product> to sort by price

// TODO: Add toString() method

@Override
public String toString(){
    return "Product{id=" + id + ", name='" + name + "', price=" + price + "}";
}

// TODO: Add getters

public int getId(){
    return id;
}

public String getName(){
    return name;
}

public Double getPrice(){
    return price;
}

}

// TODO: Create separate Comparator class to sort by name


class CompareByName implements Comparator<Product>{

@Override
public int compare(Product p1, Product p2){
    return p1.getName().compareTo(p2.getName());

    
    
}
    
}

public class Main {
public static void main(String[] args) {
// TODO: Create list of products

List<Product> products = new ArrayList<>();
products.add(new Product(1, 19.99, "salamy"));
products.add(new Product(1, 13.99, "pastramy"));
products.add(new Product(1, 7.99, "Longaniza"));
products.add(new Product(1, 5.99, "Ham"));
products.add(new Product(1, 1.99, "Meat Stick"));


// TODO: Sort by price using Comparable (natural ordering)


Collections.sort(products);
// TODO: Sort by name using Comparator
// System.out.println(products);
products.forEach(System.out::println);

products.sort(new CompareByName());




// TODO: Explain when to use each approach
}
}