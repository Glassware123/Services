package tr.com.desa.dao.impl;

import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import tr.com.desa.dao.AutoServiceDao;
import tr.com.desa.domain.AutoService;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class AutoServiceDaoImpl extends BaseDaoImpl<AutoService> implements AutoServiceDao{
    @Override
    public void addAuto(AutoService autoService) {
        getSessionFactory().getCurrentSession().save(autoService);
    }

    @Override
    public List<AutoService> findAutoByPlate(String plate) {
        List<AutoService> auto=getSessionFactory().getCurrentSession()
                .createCriteria(AutoService.class)
                .add(Restrictions.eq("plate", plate))
                .list();
        return auto;
    }
}
