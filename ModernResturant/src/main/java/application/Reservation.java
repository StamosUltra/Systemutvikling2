package application;

/**
 * Created by joaki on 21.09.2017.
 */
public class Reservation {
    private String reservationId;
    private int tableId;
    private int people;
    private long from;
    private long to;
    private String[][] items;

    public Reservation() {
    }

    public String getReservationId() {
        return reservationId;
    }

    public void setReservationId(String reservationId) {
        this.reservationId = reservationId;
    }

    public int getTableId() {
        return tableId;
    }

    public void setTableId(int tableId) {
        this.tableId = tableId;
    }

    public int getPeople() {
        return people;
    }

    public void setPeople(int people) {
        this.people = people;
    }

    public long getFrom() {
        return from;
    }

    public void setFrom(long from) {
        this.from = from;
    }

    public long getTo() {
        return to;
    }

    public void setTo(long to) {
        this.to = to;
    }

    public String[][] getItems() {
        return items;
    }

    public void setItems(String[][] items) {
        this.items = items;
    }
}
