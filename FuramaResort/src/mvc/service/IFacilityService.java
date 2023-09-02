package mvc.service;

import mvc.model.facility.Facility;

import java.util.List;
import java.util.Map;

public interface IFacilityService extends IService<Facility> {
    List<Facility> displayFacilityListMaintenance();

    Map<Facility, Integer> showInfor(String id);

    boolean isExisted(String id);
}
