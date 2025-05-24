//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Post post = new FacebookPost();
        Post post2 = new LinkedInPost();

        post.setId(1);
        post2.setId(2);
        post.setText("post face");
        post2.setText("post LinkedIn");
        post.setImageUrl("https://www.facebook.com");
        post2.setImageUrl("https://www.Likedin.com");

        post.showPost();
        post2.showPost();
    }
}