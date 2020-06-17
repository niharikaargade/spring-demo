 public class Greetings {
    private long id;
    private String contents;
    public Greetings(long id, String contents) {
        this.id = id;
        this.contents = contents;
    }

    public long getId() {
        return this.id;
    }

    public String getContents() {
        return  this.contents;
    }
 }