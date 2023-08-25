package mvc.model.facility;

import mvc.model.facility.Facility;

public class Room extends Facility {
    private String accompaniedFreeService;

    public Room(String accompaniedFreeService) {
        this.accompaniedFreeService = accompaniedFreeService;
    }

    public Room(int id, String name, double area, double price, int capacity,
                String rentalTime, String accompaniedFreeService) {
        super(id, name, area, price, capacity, rentalTime);
        this.accompaniedFreeService = accompaniedFreeService;
    }

    public String getAccompaniedFreeService() {
        return accompaniedFreeService;
    }

    public void setAccompaniedFreeService(String accompaniedFreeService) {
        this.accompaniedFreeService = accompaniedFreeService;
    }

    @Override
    public String toString() {
        return "Room {" + super.toString() +
                "accompaniedFreeService='" + accompaniedFreeService + '\'' +
                '}';
    }
}
