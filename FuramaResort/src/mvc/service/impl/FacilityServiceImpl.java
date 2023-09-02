package mvc.service.impl;

import mvc.model.facility.Facility;
import mvc.repository.IFacilityRepository;
import mvc.repository.impl.FacilityRepositoryImpl;
import mvc.service.IFacilityService;

import java.util.List;
import java.util.Map;

public class FacilityServiceImpl implements IFacilityService {
    private final IFacilityRepository facilityRepository = new FacilityRepositoryImpl();
    @Override
    public List<Facility> displayFacilityListMaintenance() {
        return this.facilityRepository.displayFacilityListMaintenance();
    }

    @Override
    public Map<Facility, Integer> showInfor(String id) {
        return this.facilityRepository.showInfor(id);
    }

    @Override
    public boolean isExisted(String id) {
        List<Facility> facilities = facilityRepository.display();
        for (Facility facility : facilities) {
            if (facility.getId().contains(id)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void add(Facility facility) {
        this.facilityRepository.add(facility);
    }

    @Override
    public void delete(String id) {
        this.facilityRepository.delete(id);
    }

    @Override
    public List<Facility> display() {
        return this.facilityRepository.display();
    }
}
