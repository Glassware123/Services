package tr.com.desa.dao.impl;

import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import tr.com.desa.dao.AutoServiceDao;
import tr.com.desa.domain.AutoMobile;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class AutoServiceDaoImpl extends BaseDaoImpl<AutoMobile> implements AutoServiceDao{
    @Override
    public void addAuto(AutoMobile autoMobile) {
        getSessionFactory().getCurrentSession().save(autoMobile);
    }

    @Override
    public List<AutoMobile> findAutoByPlate(String plate) {
        List<AutoMobile> auto=getSessionFactory().getCurrentSession()
                .createCriteria(AutoMobile.class)
                .add(Restrictions.eq("plate", plate))
                .list();
        return auto;
    }
}
