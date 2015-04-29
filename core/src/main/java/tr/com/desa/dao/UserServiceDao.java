package tr.com.desa.dao;
import tr.com.desa.domain.UserService;

import java.util.List;

public interface UserServiceDao extends BaseDao<UserService> {
    void save(UserService userService);
    List<UserService> users();
}
