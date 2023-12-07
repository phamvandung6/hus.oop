package hus.oop.lab10.iterator_pattern.bai_1;

public class ProductIterator implements Iterator<String> {
  private String[] productCatalog;
  private int position;

  public ProductIterator(String[] productCatalog) {
    this.productCatalog = productCatalog;
    this.position = 0;
  }

  public boolean hasNext() {
    return position < productCatalog.length;
  }

  public String next() {
    if (hasNext()) {
      String product = productCatalog[position];
      position++;
      return product;
    }
    throw new IndexOutOfBoundsException();
  }
}