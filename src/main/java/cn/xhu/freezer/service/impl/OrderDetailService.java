package cn.xhu.freezer.service.impl;

import cn.xhu.freezer.dal.entity.OrderDetail;
import cn.xhu.freezer.dal.mapper.OrderDetailMapper;
import cn.xhu.freezer.service.IOrderDetailService;
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
public class OrderDetailService extends ServiceImpl<OrderDetailMapper, OrderDetail> implements IOrderDetailService {

}
