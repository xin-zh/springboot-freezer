package cn.xhu.freezer.service.impl;

import cn.xhu.freezer.dal.entity.Inbound;
import cn.xhu.freezer.dal.mapper.InboundMapper;
import cn.xhu.freezer.service.IInboundService;
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
public class InboundService extends ServiceImpl<InboundMapper, Inbound> implements IInboundService {

}