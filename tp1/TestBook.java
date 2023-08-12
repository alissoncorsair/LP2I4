class Book {
    private String name;
    private Author[] authors;
    private double price;
    private int qty;

    public Book(String name, Author[] authors, double price) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = 0;
    }

    public Book(String name, Author[] authors, double price, int qty) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }

    public String getName() {
        return this.name;
    }

    public Author[] getAuthors() {
        return this.authors;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return this.qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        StringBuilder authorsString = new StringBuilder();
        for (Author author : authors) {
            authorsString.append(author).append(", ");
            System.out.print(authorsString.append(author).append(", "));
        }
        return "Book[name=" + this.name + ", author={" + authorsString.toString() + "}, price=" + this.price + ", qty=" + this.qty + "]";
    }

    public String getAuthorNames() {
        StringBuilder authorNames = new StringBuilder();
        for (Author author : this.authors) {
            authorNames.append(author.getName()).append(", ");
        }
        return authorNames.toString().substring(0, authorNames.length() - 2);
    }
}

public class TestBook {
    public static void main(String[] args) {
        Author author1 = new Author("Wellington Tuler", "tulermoraes@yahoo.com", 'm');
        Author author2 = new Author("lana", "lana@email.com", 'f');
        
        Author[] authors = {author1, author2};
        
        Book testeBook = new Book("Java for Dummy", authors, 19.99, 99);
        System.out.println(testeBook);
        System.out.println("Author Names: " + testeBook.getAuthorNames());
    }
}