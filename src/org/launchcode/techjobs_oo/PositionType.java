package org.launchcode.techjobs_oo;

import javax.swing.text.Position;

public class PositionType {
    private int id;
    private static int nextId = 1;
    private String value;

    public PositionType() {
        id = nextId;
        nextId++;
    }

    public PositionType(String value) {
        this();
        this.value = value;
    }

    // TODO: Add a custom toString() method that returns the data stored in 'value'.
    @Override
    public String toString(){
        return value;
    }
    // TODO: Add custom equals and hashCode methods. Consider two PositionType objects "equal" when
    //  their id fields match.
    @Override
    public boolean equals(Object o){
        if (this == o) return true; //immediately return true if it points to the same instance.
        if (!(o instanceof PositionType)) return false; // check to see if it's an instance of the class.
        PositionType that = (PositionType) o; //this casts o into a positiontype officially, if it's a compatible type. Polymorphism stuff.
        //why is the above necessary if line 30 already checks if it's an instance of the class?
        return id == that.id;
    }
    // Getters and Setters:

    public int getId() {
        return id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
