package xyz.sunpxit.Dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import xyz.sunpxit.domian.Users;

import java.util.List;

@Mapper
public interface UserMapper extends BaseMapper<Users> {


}
