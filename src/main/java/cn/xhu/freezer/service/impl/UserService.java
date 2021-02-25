package cn.xhu.freezer.service.impl;

import cn.xhu.freezer.dal.entity.User;
import cn.xhu.freezer.dal.mapper.UserMapper;
import cn.xhu.freezer.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zx
 * @since 2021-02-25
 */
@Service
public class UserService extends ServiceImpl<UserMapper, User> implements IUserService {

}
