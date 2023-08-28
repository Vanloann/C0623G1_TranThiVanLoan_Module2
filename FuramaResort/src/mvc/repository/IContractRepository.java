package mvc.repository;

import mvc.model.Contract;
import mvc.service.IService;

public interface IContractRepository extends IRepository <Contract> {
    void editContracts();

}
