public class FacebookPost {



    private int id ;
    private String text ;
    private String imageUrl ;

    public FacebookPost(int id, String text) {
        this.id = id;
        this.text = text;
    }

    public FacebookPost(int id, String text, String imageUrl) {
        this.id = id;
        this.text = text;
        this.imageUrl = imageUrl;
    }

    public int getId() {
        return id;
    }

    public String getText() {
        return text;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void getPost() {
        System.out.println("id : " + id + " text : " + text + " imageUrl : " + imageUrl);
    }

}
