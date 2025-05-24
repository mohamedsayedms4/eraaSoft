// Subclass representing a post on LinkedIn
public class LinkedInPost extends Post {

    // Default constructor
    public LinkedInPost() {
        super(); // Calls the default constructor of the Post class
    }

    // Parameterized constructor to initialize LinkedIn post with data
    public LinkedInPost(int id, String text, String imageUrl) {
        super(id, text, imageUrl); // Calls the parent constructor to set values
    }

    // Overrides the showPost method to include LinkedIn-specific message
    @Override
    public void showPost() {
        System.out.println("You are on application LinkedIn"); // Platform-specific message
        super.showPost(); // Calls the base method to print post details
    }
}
