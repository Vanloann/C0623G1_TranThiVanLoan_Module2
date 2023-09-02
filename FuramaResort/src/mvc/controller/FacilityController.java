package mvc.controller;

import mvc.model.facility.Facility;
import mvc.service.IFacilityService;
import mvc.service.impl.FacilityServiceImpl;

import java.util.List;
import java.util.Map;

public class FacilityController {
    private final IFacilityService facilityService = new FacilityServiceImpl();

    public List<Facility> displayFacilityListMaintenance() {
        return this.facilityService.displayFacilityListMaintenance();
    }

    public void add(Facility facility) {
        this.facilityService.add(facility);
    }

    public void delete(String id) {
        this.facilityService.delete(id);
    }

    public List<Facility> display() {
        return this.facilityService.display();
    }

    public Map<Facility, Integer> showInfor(String id) {
        return this.facilityService.showInfor(id);
    }

    public boolean isExisted(String id) {
        return this.facilityService.isExisted(id);
    }
}
