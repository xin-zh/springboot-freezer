package cn.xhu.freezer.service.impl;

import cn.xhu.freezer.dal.entity.SellOrder;
import cn.xhu.freezer.dal.mapper.SellOrderMapper;
import cn.xhu.freezer.service.ISellOrderService;
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
public class SellOrderService extends ServiceImpl<SellOrderMapper, SellOrder> implements ISellOrderService {

}
