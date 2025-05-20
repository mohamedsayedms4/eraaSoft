// Subclass representing a post on Facebook
public class FacebookPost extends Post {

    // Default constructor
    public FacebookPost() {
        super(); // Calls the default constructor of the Post class
    }

    // Parameterized constructor to initialize Facebook post with data
    public FacebookPost(int id, String text, String imageUrl) {
        super(id, text, imageUrl); // Calls the parent constructor to set values
    }

    // Overrides the showPost method to include Facebook-specific message
    @Override
    public void showPost() {
        System.out.println("You are on application Facebook"); // Platform message
        super.showPost(); // Calls the base method to print post details
    }
}
