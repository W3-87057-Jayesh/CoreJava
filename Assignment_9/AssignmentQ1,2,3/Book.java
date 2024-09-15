import java.util.Date;
import java.util.Objects;

enum Category {
    FICTION, NON_FICTION, SCIENCE, HISTORY, MYSTERY
}

class Book {
    private String isbn;
    private Category category;
    private double price;
    private Date publishDate;
    private String authorName;
    private int quantity;

    public Book(String isbn, Category category, double price, Date publishDate,
    		String authorName, int quantity)
    {
        this.isbn = isbn;
        this.category = category;
        this.price = price;
        this.publishDate = publishDate;
        this.authorName = authorName;
        this.quantity = quantity;
    }

    public String getIsbn() {
        return isbn;
    }

    public Category getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }

    public Date getPublishDate() {
        return publishDate;
    }

    public String getAuthorName() {
        return authorName;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "Book{" +
                "ISBN='" + isbn + '\'' +
                ", Category='" + category + '\'' +
                ", Price=" + price +
                ", Publish Date=" + publishDate +
                ", Author='" + authorName + '\'' +
                ", Quantity=" + quantity +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(isbn, book.isbn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isbn);
    }
}
