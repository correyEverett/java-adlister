package model;
public class Quotes {

//    FIELDS/PROPERTIES
    private long id;
    private String authorFirstName;
    private String authorLastName;

    //    CONSTRUCTOR
    public Quotes() {}

    //    GETTERS AND SETTERS
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getAuthorFirstName() {
        return authorFirstName;
    }
    public void setAuthorFirstName(String authorFirstName) {
        this.authorFirstName = authorFirstName;
    }
    public String getAuthorLastName() {
        return authorLastName;
    }
    public void setAuthorLastName(String authorLastName) {
        this.authorLastName = authorLastName;
    }
}