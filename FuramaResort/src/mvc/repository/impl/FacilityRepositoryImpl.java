package mvc.repository.impl;

import mvc.model.facility.Facility;
import mvc.model.facility.House;
import mvc.model.facility.Room;
import mvc.model.facility.Villa;
import mvc.repository.IFacilityRepository;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class FacilityRepositoryImpl implements IFacilityRepository {

    private static final Map<Facility, Integer> facilityList = new LinkedHashMap<>();

    static {
        facilityList.put(new Villa("SVVL-0001", "Villa", 50, 500, 10, "2 days", "double room", 32, 3), 2);
        facilityList.put(new House("SVHO-0002", "House", 40, 200, 5, "a month", "standard room", 4), 5);
        facilityList.put(new Room("SVRO-0003", "Room", 31, 150, 2, "years", "free laundry"), 6);
    }

//    private final String FACILITY_FILEPATH = "D:\\C0623G1_LoanTTV_Module2\\FuramaResort\\src\\mvc\\data\\facility.csv";

//    private final String COMMA = ",";


    @Override
    public List<Facility> display() {
        List<Facility> facilities = new ArrayList<>();
        for (Map.Entry<Facility, Integer> facility : facilityList.entrySet()) {
            facilities.add(facility.getKey());
        }
        return facilities;
    }

    @Override
    public List<Facility> displayFacilityListMaintenance() {
        List<Facility> facilities = new ArrayList<>();
        for (Map.Entry<Facility, Integer> facility : facilityList.entrySet()) {
            if (facility.getValue() >= 5) {
                facilities.add(facility.getKey());
            } else {
                System.out.println("");
            }
        }
        return facilities;
    }

    @Override
    public Map<Facility, Integer> showInfor(String id) {
        Map<Facility, Integer> showInformation = new LinkedHashMap<>();
        for (Map.Entry<Facility, Integer> facility : facilityList.entrySet()) {
            if (facility.getKey().getId().equals(id)) {
                showInformation.put(facility.getKey(), facility.getValue());
            }
        }
        return showInformation;
    }

    @Override
    public void add(Facility facility) {
        for (Facility f : facilityList.keySet()) {
            if (f.getId().equals(facility.getId())) {
                return;
            }
        }
        facilityList.put(facility, 0);
    }

    @Override
    public void delete(String id) {
        for (Map.Entry<Facility, Integer> facility : facilityList.entrySet()) {
            if (facility.getKey().getId().equals(id)) {
                // delete k dung contains bc delete unique id, neu dung contains (e.g. input id: SVVL-00 -> show list object has id start with SVVL-0001 -> delete all)
                facilityList.remove(facility.getKey());
                return;
            }
        }
    }

    @Override
    public List<Facility> convert(List<String> strings) {
        return null;
    }

    @Override
    public List<String> convertToString(List<Facility> e) {
        return null;
    }
}
