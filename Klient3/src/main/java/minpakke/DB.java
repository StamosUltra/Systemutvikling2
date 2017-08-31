package minpakke;

/**
 * @author nilstes
 */
public class DB {
    public static String find(String searchString) {
        if(searchString.equalsIgnoreCase("finn")) {
            return "Finn Finsen";
        } else {
            return "Fant ingenting";
        }
    }
}
