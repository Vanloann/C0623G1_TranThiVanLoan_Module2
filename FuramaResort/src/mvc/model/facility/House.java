package mvc.model.facility;

import mvc.model.facility.Facility;

public class House extends Facility {
    private String roomStandard;
    private int floors;

    public House() {}

    public House(String roomStandard, int floors) {
        this.roomStandard = roomStandard;
        this.floors = floors;
    }

    public House(String id, String service, double area, double rental, int capacity,
                 String rentPeriod, String roomStandard, int floors) {
        super(id, service, area, rental, capacity, rentPeriod);
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
        return  "HOUSE" + super.toString() +
                " | RoomStandard: " + roomStandard +
                " | Floor: " + floors + "\n";
    }
}
