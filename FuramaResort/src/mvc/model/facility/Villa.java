package mvc.model.facility;

import mvc.model.facility.Facility;

public class Villa extends Facility {
    private String roomStandard;
    private double areaOfPool;
    private int floors;

    public Villa() {}

    public Villa(String roomStandard, double areaOfPool, int floors) {
        this.roomStandard = roomStandard;
        this.areaOfPool = areaOfPool;
        this.floors = floors;
    }

    public Villa(String id, String service, double area, double rental, int capacity, String rentPeriod,
                 String roomStandard, double areaOfPool, int floors) {
        super(id, service, area, rental, capacity, rentPeriod);
        this.roomStandard = roomStandard;
        this.areaOfPool = areaOfPool;
        this.floors = floors;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public double getAreaOfPool() {
        return areaOfPool;
    }

    public void setAreaOfPool(double areaOfPool) {
        this.areaOfPool = areaOfPool;
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    @Override
    public String toString() {
        return  "VILLA" + super.toString() +
                " | RoomStandard: " + roomStandard +
                " | AreaOfPool: " + areaOfPool +
                " | Floor: " + floors + "\n";
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
