package nyrex;

public class TestAuthor {
    public static void main(String[] args) {
        Author b1 = new Author("Deetz", "DeetzsNuts@mailbox.eu", 'm');
        System.out.println(b1);
        b1.setEmail("DeetzNutsCommercial@mailbox.eu");
        System.out.println(b1);
    }
}
