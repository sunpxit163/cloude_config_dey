package xyz.sunpxit.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import org.springframework.web.bind.annotation.RequestParam;
import xyz.sunpxit.domian.Users;

import java.util.List;

public interface IUserService {
    IPage<Users> pageAll(long current ,long size);
    List<Users> search( String term);
    int insert (Users users);
}
