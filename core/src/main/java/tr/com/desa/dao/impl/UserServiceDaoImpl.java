package tr.com.desa.dao.impl;
import org.springframework.stereotype.Repository;
import tr.com.desa.dao.UserServiceDao;
import tr.com.desa.domain.UserService;
import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Repository
public class UserServiceDaoImpl extends BaseDaoImpl<UserService> implements UserServiceDao {
    @Override
    public void save(UserService userService)
    {
        getSessionFactory().getCurrentSession().save(userService);
    }

    @Override
    public List<UserService> users() {
        List <UserService> users=findAll();
        return users;
    }
}