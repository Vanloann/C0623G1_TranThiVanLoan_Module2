package mvc.model.facility;

public class Room extends Facility {
    private String accompanyingFreeService;

    public Room(String accompanyingFreeService) {
        this.accompanyingFreeService = accompanyingFreeService;
    }

    public Room() {}
    public Room(String id, String service, double area, double rental, int capacity,
                String rentPeriod, String accompanyingFreeService) {
        super(id, service, area, rental, capacity, rentPeriod);
        this.accompanyingFreeService = accompanyingFreeService;
    }

    public String getAccompanyingFreeService() {
        return accompanyingFreeService;
    }

    public void setAccompanyingFreeService(String accompanyingFreeService) {
        this.accompanyingFreeService = accompanyingFreeService;
    }

    @Override
    public String toString() {
        return  "ROOM " + super.toString() +
                " | AccompanyingFreeService: " + accompanyingFreeService + "\n";
    }
}
