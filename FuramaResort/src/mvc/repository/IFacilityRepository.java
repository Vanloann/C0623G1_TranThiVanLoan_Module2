package mvc.repository;

import mvc.model.facility.Facility;
import mvc.service.IService;

import java.util.List;
import java.util.Map;

public interface IFacilityRepository extends IRepository<Facility> {
    List<Facility> displayFacilityListMaintenance();

    Map<Facility, Integer> showInfor(String id);
}
