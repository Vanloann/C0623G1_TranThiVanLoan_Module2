package mvc.service;

import mvc.model.facility.Facility;

import java.util.List;

public interface IFacilityService extends IService<Facility> {
    List<Facility> displayFacilityListMaintenance();

}
