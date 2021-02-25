package cn.xhu.freezer.service.impl;

import cn.xhu.freezer.dal.entity.Menu;
import cn.xhu.freezer.dal.mapper.MenuMapper;
import cn.xhu.freezer.service.IMenuService;
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
public class MenuService extends ServiceImpl<MenuMapper, Menu> implements IMenuService {

}
