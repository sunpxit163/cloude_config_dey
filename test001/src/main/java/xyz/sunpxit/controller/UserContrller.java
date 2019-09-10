package xyz.sunpxit.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import xyz.sunpxit.domian.Users;
import xyz.sunpxit.service.impl.UserService;

import java.util.List;

@RestController
@RequestMapping("dey001")
public class UserContrller {
    @Autowired
    private UserService userService;

    /**
     * 分页查询所有
     */
    @GetMapping("all")
    public IPage<Users> all(@RequestParam(name = "current",required = true) long current,@RequestParam(name = "size",required = true) long size){
       return userService.pageAll(current ,size);
    }
    /**
     * 模糊查询
     */
    @GetMapping("search")
    public  List<Users> search(@RequestParam(name = "term",required = true) String term){
        return userService.search(term);
    }
    /**
     * save
     */
    @PostMapping("insert")
    public  int save(Users users){

        return userService.insert(users);
    }


}
