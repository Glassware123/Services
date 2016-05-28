package com.yildizapp.dao.impl;
import com.sun.org.apache.xerces.internal.impl.dv.util.Base64;
import com.yildizapp.dao.UserServiceDao;
import com.yildizapp.domain.UserService;
import org.hibernate.criterion.Restrictions;
import org.omg.PortableInterceptor.USER_EXCEPTION;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import sun.misc.BASE64Decoder;

import javax.imageio.ImageIO;
import javax.jws.soap.SOAPBinding;
import javax.transaction.Transactional;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@Transactional
@Repository
public class UserServiceDaoImpl extends BaseDaoImpl<UserService> implements UserServiceDao {
    @Override
    public void save(UserService userService)
    {
        getSessionFactory().getCurrentSession().saveOrUpdate(userService);
    }

    @Override
    public List<UserService> getAllUsers() {
        List<UserService> users = findAll();
        return users;
    }

    @Override
    public List<UserService> getUserByEmail(String email) {
        List<UserService> user = findUserByEmail(email);
        return user;
    }

    @Override
    public List<UserService> getUserByUsername(String username) {
        List<UserService> user = findUserByUsername(username);
        return user;
    }

    @Override
    public void deleteByUsername(String username) {
        List<UserService> user = findUserByUsername(username);
        delete(user.get(0));
    }

    @Override
    public void updateUser(UserService userService) {
      UserService user = (UserService) sessionFactory.getCurrentSession().createCriteria(UserService.class).add(Restrictions.eq("email", userService.getEmail())).uniqueResult();
        user.setName(userService.getName());
        user.setSurname(userService.getSurname());
        user.setUsername(userService.getUsername());
        user.setPhoneNumber(userService.getPhoneNumber());
        user.setPassword(userService.getPassword());
        saveOrUpdate(user);
    }

    @Override
    public void isOnlineService(Integer id, Boolean isOnlineStatus) {
        UserService user = (UserService) sessionFactory.getCurrentSession().createCriteria(UserService.class).add(Restrictions.eq("id", id)).uniqueResult();
        user.setIsOnline(isOnlineStatus);
        saveOrUpdate(user);

    }

    @Override
    public void updateUserImage(Integer id,String userImage) {
        byte[] decoded = Base64.decode(userImage);
        InputStream in = new ByteArrayInputStream(decoded);
        BufferedImage bImageFromConvert;
        try {
            bImageFromConvert = ImageIO.read(in);
            ImageIO.write(bImageFromConvert, "jpg", new File(
                    "/home/userImages/"+id.toString()+".jpg"));

        } catch (IOException e) {
            e.printStackTrace();
        }
        UserService user = (UserService) sessionFactory.getCurrentSession().createCriteria(UserService.class).add(Restrictions.eq("id", id)).uniqueResult();
        user.setUserImagePath("/home/userImages/"+id.toString()+".jpg");
        saveOrUpdate(user);

    }


}