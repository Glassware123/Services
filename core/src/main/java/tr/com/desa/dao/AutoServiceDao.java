package tr.com.desa.dao;

import tr.com.desa.domain.AutoService;

import java.util.List;

public interface AutoServiceDao extends BaseDao<AutoService> {
    void addAuto(AutoService autoService);
    List<AutoService> findAutoByPlate(String plate);
}
