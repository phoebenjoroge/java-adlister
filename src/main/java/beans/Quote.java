package beans;

public class Quote {

    private int id;
    private String first_name;
    private String last_name;
    private String content;

    public Quote(){}

    public Quote(int id, String first_name, String last_name, String content) {
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.content = content;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
