import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;
import java.util.*;

public class Library{
    public static void main(String[] args) {
        HashSet<Book> bookHashSet = new HashSet<>();
        LinkedHashSet<Book> bookLinkedHashSet = new LinkedHashSet<>();
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("Enter details for book " + (i + 1) + ":");

                System.out.print("ISBN: ");
                String isbn = scanner.nextLine();

                System.out.print("Category (FICTION, NON_FICTION, SCIENCE, HISTORY, MYSTERY): ");
                Category category = Category.valueOf(scanner.nextLine().toUpperCase());

                System.out.print("Price: ");
                double price = Double.parseDouble(scanner.nextLine());

                System.out.print("Publish Date (dd/MM/yyyy): ");
                String dateStr = scanner.nextLine();
                Date publishDate = dateFormat.parse(dateStr);

                System.out.print("Author Name: ");
                String authorName = scanner.nextLine();

                System.out.print("Quantity: ");
                int quantity = Integer.parseInt(scanner.nextLine());

                Book book = new Book(isbn, category, price, publishDate, authorName, quantity);

                // Add to HashSet to ensure uniqueness
                if (bookHashSet.add(book)) {
                    // Add to LinkedHashSet to maintain insertion order
                    bookLinkedHashSet.add(book);
                    System.out.println("Book added successfully!\n");
                } else {
                    System.out.println("Book with this ISBN already exists. Try again!\n");
                }
            }

            System.out.println("\nBooks in the HashSet (no specific order):");
            for (Book book : bookHashSet) {
                System.out.println(book);
            }

            //Q2 Display the books in LinkedHashSet (insertion order)
            System.out.println("\nBooks in the LinkedHashSet (in insertion order):");
            for (Book book : bookLinkedHashSet) {
                System.out.println(book);
            }

            // Q3 Sort the books by publish date and display
            List<Book> sortedBooks = new ArrayList<>(bookLinkedHashSet);
            sortedBooks.sort(Comparator.comparing(Book::getPublishDate));

            System.out.println("\nBooks sorted by Publish Date:");
            for (Book book : sortedBooks) {
                System.out.println(book);
            }

        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
