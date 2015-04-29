package tr.com.desa.dao.impl;
import org.springframework.stereotype.Repository;
import tr.com.desa.dao.UserServiceDao;
import tr.com.desa.domain.UserService;
import javax.transaction.Transactional;
@Transactional
@Repository
public class UserServiceDaoImpl extends BaseDaoImpl<UserService> implements UserServiceDao {
    @Override
    public void save(UserService userService)
    {
        getSessionFactory().getCurrentSession().save(userService);
    }
}