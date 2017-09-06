package minpakke;

/**
 * @author nilstes
 */
public class TemperatureSeries {
    private String name;
    private double[] data;

    public TemperatureSeries() {
    }

    public TemperatureSeries(String name, double[] data) {
        this.name = name;
        this.data = data;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double[] getData() {
        return data;
    }

    public void setData(double[] data) {
        this.data = data;
    }
}
