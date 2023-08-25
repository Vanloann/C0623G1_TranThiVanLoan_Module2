package mvc.model.facility;

import mvc.model.facility.Facility;

public class Villa extends Facility {
    private String roomStandard;
    private double areaOfPool;
    private int floors;

    public Villa(String roomStandard, double areaOfPool, int floors) {
        this.roomStandard = roomStandard;
        this.areaOfPool = areaOfPool;
        this.floors = floors;
    }

    public Villa(int id, String name, double area, double price, int capacity, String rentalTime,
                 String roomStandard, double areaOfPool, int floors) {
        super(id, name, area, price, capacity, rentalTime);
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
        return "Villa {" + super.toString() +
                "roomStandard='" + roomStandard + '\'' +
                ", areaOfPool=" + areaOfPool +
                ", floors=" + floors +
                '}';
    }
}
