package mvc.model.facility;

import mvc.model.facility.Facility;

public class House extends Facility {
    private String roomStandard;
    private int floors;

    public House(String roomStandard, int floors) {
        this.roomStandard = roomStandard;
        this.floors = floors;
    }

    public House(int id, String name, double area, double price, int capacity,
                 String rentalTime, String roomStandard, int floors) {
        super(id, name, area, price, capacity, rentalTime);
        this.roomStandard = roomStandard;
        this.floors = floors;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    @Override
    public String toString() {
        return "House {" + super.toString() +
                "roomStandard='" + roomStandard + '\'' +
                ", floors=" + floors +
                '}';
    }
}
