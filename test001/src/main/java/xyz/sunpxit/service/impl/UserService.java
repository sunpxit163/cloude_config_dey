package xyz.sunpxit.service.impl;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyz.sunpxit.Dao.UserMapper;
import xyz.sunpxit.config.SecurityConfig;
import xyz.sunpxit.domian.Users;
import xyz.sunpxit.service.IUserService;

import java.util.List;

@Service
public class UserService implements IUserService {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private SecurityConfig securityConfig;





    @Override
    public IPage<Users> pageAll(long current ,long size) {
        /**
         * current当前页
         * size 每页显示的数量
         */
        Page<Users> page=new Page<>(current,size);
        IPage<Users> iPage=userMapper.selectPage(page,null);
        System.out.println("条数"+page.getTotal());
        System.out.println("总页数"+page.getPages());
        System.out.println("每页多少条"+page.getSize());
        System.out.println(securityConfig.encrypt("123"));
        return iPage;



    }

    /**
     * 模糊查询
     * @param term  查询条件
     * @return
     */
    @Override
    public List<Users> search(String term) {
        QueryWrapper<Users> qw=new QueryWrapper<Users>();
        qw.like("name", term);

        return userMapper.selectList(qw);
    }

    /**
     * 增加
     * @param users
     * @return
     */
    @Override
    public int insert(Users users) {
        //密码加密
        users.setPassword(securityConfig.encrypt(users.getPassword()));
        return userMapper.insert(users);
    }
}
