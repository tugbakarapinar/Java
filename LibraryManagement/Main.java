import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library lib = new Library();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1-Add 2-List 3-Remove 4-Exit");
            int choice = sc.nextInt();
            sc.nextLine();
            if (choice == 1) {
                System.out.print("Title: ");
                String t = sc.nextLine();
                System.out.print("Author: ");
                String a = sc.nextLine();
                System.out.print("ISBN: ");
                String i = sc.nextLine();
                lib.addBook(new Book(t, a, i));
            } else if (choice == 2) {
                lib.listBooks();
            } else if (choice == 3) {
                System.out.print("ISBN to remove: ");
                String i = sc.nextLine();
                lib.removeBook(i);
            } else break;
        }
        sc.close();
    }
}
