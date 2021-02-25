package cn.xhu.freezer.service.impl;

import cn.xhu.freezer.dal.entity.Product;
import cn.xhu.freezer.dal.mapper.ProductMapper;
import cn.xhu.freezer.service.IProductService;
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
public class ProductService extends ServiceImpl<ProductMapper, Product> implements IProductService {

}
