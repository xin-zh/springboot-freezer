package cn.xhu.freezer.service.impl;

import cn.xhu.freezer.dal.entity.Customer;
import cn.xhu.freezer.dal.mapper.CustomerMapper;
import cn.xhu.freezer.service.ICustomerService;
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
public class CustomerService extends ServiceImpl<CustomerMapper, Customer> implements ICustomerService {

}
