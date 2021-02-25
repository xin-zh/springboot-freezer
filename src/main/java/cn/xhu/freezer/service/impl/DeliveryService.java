package cn.xhu.freezer.service.impl;

import cn.xhu.freezer.dal.entity.Delivery;
import cn.xhu.freezer.dal.mapper.DeliveryMapper;
import cn.xhu.freezer.service.IDeliveryService;
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
public class DeliveryService extends ServiceImpl<DeliveryMapper, Delivery> implements IDeliveryService {

}
