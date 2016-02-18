package top.laijie.sm.dao.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import top.laijie.sm.dao.UserDao;
import top.laijie.sm.model.User;


public class UserController {
    
    /**
     * @param args
     */
    public static void main(String[] args) {
        ApplicationContext ctx=null;
        ctx=new ClassPathXmlApplicationContext("ApplicationContext.xml");
        UserDao userDao=(UserDao) ctx.getBean("userDao");
        User user=new User();
        //添加两条数据
        user.setId(3);
        user.setUsername("laijie");
        user.setPassword("123");
        userDao.addUser(user);
        user.setId(4);
        user.setUsername("zhang");
        user.setPassword("123");
        userDao.addUser(user);
        System.out.println("添加成功");
        //查询数据
        user.setUsername("zhang");
        user.setPassword("123");
        System.out.println(userDao.getUser(user).toString());
        user.setUsername("Jessica2");
        user.setPassword("123");
        System.out.println(userDao.getUser(user).toString());
        //修改数据
        user.setId(2);
        user.setPassword("802");
        userDao.updateUser(user);
        System.out.println("修改成功");
        //删除数据
        userDao.deleteUser(1);
        System.out.println("删除成功");
        
    }

}