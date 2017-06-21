package DataStructures.Test;

/**
 * Created by bangu on 6/16/2017.
 */
public class UserTest {
    private String id;
    private String name;


    //UserTest constructor
    public UserTest(String id, String name) {
        this.id = id;
        this.name = name;
    }

    //User test class

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    //boolean to check if name already exists
    private boolean equals(UserTest u)  {
        if (u.id == this.id && u.name == this.name) {
            return false;
        } else {
            return true;
        }
    }
}
