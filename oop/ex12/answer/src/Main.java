//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        FacebookPost post1 = new FacebookPost(1, "Hello from Java!");
        FacebookPost post2 = new FacebookPost(2, "Look at this cool image", "cool.jpg");

        post2.getPost();
    }
}