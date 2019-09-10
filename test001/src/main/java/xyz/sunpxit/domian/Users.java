package xyz.sunpxit.domian;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import org.apache.ibatis.annotations.Mapper;

@Data
public class Users {
   @TableId(value = "id",type = IdType.AUTO)
   private Integer id;
   private String name;
   private String password;

}
