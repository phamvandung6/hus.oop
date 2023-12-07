package hus.oop.lab10.iterator_pattern.bai_1;

public class ProductCatalog implements Iterable {
  private String[] productCatalog;

  public ProductCatalog(String[] productCatalog) {
    this.productCatalog = productCatalog;
  }

  public Iterator<String> getIterator() {
    return new ProductIterator(productCatalog);
  }
}