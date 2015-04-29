package tr.com.desa.dao;
import tr.com.desa.domain.UserService;

public interface UserServiceDao extends BaseDao<UserService> {
    void save(UserService userService);
}
