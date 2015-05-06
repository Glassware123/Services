package tr.com.desa.dao;

import tr.com.desa.domain.AutoMobile;

import java.util.List;

public interface AutoServiceDao extends BaseDao<AutoMobile> {
    void addAuto(AutoMobile autoMobile);
    List<AutoMobile> findAutoByPlate(String plate);
}
