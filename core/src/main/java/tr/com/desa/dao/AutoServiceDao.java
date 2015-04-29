package tr.com.desa.dao;

import tr.com.desa.domain.AutoService;

public interface AutoServiceDao extends BaseDao<AutoService> {
    void addAuto(AutoService autoService);
    String whereIsMyAuto(String plate);
}
