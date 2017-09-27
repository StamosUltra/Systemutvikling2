package application;

/**
 * Created by joaki on 21.09.2017.
 */
public class Item {
    private String type;
    private String name;
    private String allergies;

    public Item(){
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAllergies() {
        return allergies;
    }

    public void setAllergies(String allergies) {
        this.allergies = allergies;
    }
}
