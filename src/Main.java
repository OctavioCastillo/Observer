//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Blog blog1 = new Blog();
        Blog blog2 = new Blog();

        User user1 = new User("Octavio");
        User user2 = new User("Diego");

        blog1.registerObserver(user1);
        blog1.registerObserver(user2);

        blog2.registerObserver(user1);


        blog1.postEntrance("Title 1");

        blog2.postEntrance("Title 2");

        blog1.deleteObserver(user1);

        blog1.postEntrance("Title 3");
    }
}