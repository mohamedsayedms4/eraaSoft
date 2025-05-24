// Base class representing a general social media post
public class Post {
    // Private fields for encapsulation
    private int id;             // Unique identifier for the post
    private String text;        // Text content of the post
    private String imageUrl;    // URL or path to the image

    // Default constructor
    public Post() {
    }

    // Parameterized constructor to initialize post with data
    public Post(int id, String text, String imageUrl) {
        setId(id);
        setText(text);
        setImageUrl(imageUrl);
    }

    // Getter for post ID
    public int getId() {
        return id;
    }

    // Setter for post ID
    public void setId(int id) {
        this.id = id;
    }

    // Getter for post text
    public String getText() {
        return text;
    }

    // Setter for post text
    public void setText(String text) {
        this.text = text;
    }

    // Getter for image URL
    public String getImageUrl() {
        return imageUrl;
    }

    // Setter for image URL
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    // Method to display the post content
    // This can be overridden by subclasses to add platform-specific information
    protected void showPost() {
        System.out.println("Post ID: " + getId());
        System.out.println("Text: " + getText());
        System.out.println("Image: " + getImageUrl());
    }
}
