package mvc.repository;

import mvc.model.facility.Facility;
import mvc.service.IService;

import java.util.List;

public interface IFacilityRepository extends IRepository<Facility> {
    List<Facility> displayFacilityListMaintenance();

}
