package tr.com.desa.dao.impl;

import org.springframework.stereotype.Repository;
import tr.com.desa.dao.AutoServiceDao;
import tr.com.desa.domain.AutoService;

import javax.transaction.Transactional;

@Repository
@Transactional
public class AutoServiceDaoImpl extends BaseDaoImpl<AutoService> implements AutoServiceDao{
    @Override
    public void addAuto(AutoService autoService) {
        getSessionFactory().getCurrentSession().save(autoService);
    }
}
