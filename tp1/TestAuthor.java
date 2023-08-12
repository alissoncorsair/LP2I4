class Author {
    private String name;
    private String email;
    private char gender;

    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String getName() {
        return this.name;
    }

    public String getEmail() {
        return this.email;
    }

    // Setter for email
    public void setEmail(String email) {
        this.email = email;
    }

    public char getGender() {
        return this.gender;
    }

    // Override toString() method
    @Override public String toString() {
        return "Author[name=" + this.name + ", email=" + this.email + ", gender=" + this.gender + "]";
    }
}

public class TestAuthor {
        public static void main(String[] args) {
        Author author = new Author("Wellington Tuler", "tulermoraes@yahoo.com", 'm');
        
        System.out.println(author);

        author.setEmail("wellington@example.com");
        
        System.out.println("Name: " + author.getName());
        System.out.println("Email: " + author.getEmail());
        System.out.println("Gender: " + author.getGender());
    }
}