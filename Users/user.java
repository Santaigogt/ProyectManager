package Users;

/**
 *
 * @author bizco
 */
public class user {

    private String id;
    private String name;
    private String email;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public user(String id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public user() {
        this.id = "";
        this.name = "";
        this.email = "";
    }

}
