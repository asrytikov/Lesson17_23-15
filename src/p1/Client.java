package p1;

import java.io.Serializable;

public class Client implements Serializable {

    private String name;
    private transient int id;
    private double count;

    public Client(String name, int id, double count) {
        this.name = name;
        this.id = id;
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getCount() {
        return count;
    }
}
