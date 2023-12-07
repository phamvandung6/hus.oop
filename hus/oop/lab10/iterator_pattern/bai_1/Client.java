
package hus.oop.lab10.iterator_pattern.bai_1;

public class Client {
    public static void main(String[] args) {
        String[] products = { "Product 1", "Product 2", "Product 3" };
        ProductCatalog catalog = new ProductCatalog(products);

        Iterator<String> iterator = catalog.getIterator();
        while (iterator.hasNext()) {
            String product = iterator.next();
            System.out.println(product);
        }
    }

    /*
     * OutPut:
     * Product 1
     * Product 2
     * Product 3
     */
}