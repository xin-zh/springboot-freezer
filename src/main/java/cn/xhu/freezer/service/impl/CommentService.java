package cn.xhu.freezer.service.impl;

import cn.xhu.freezer.dal.entity.Comment;
import cn.xhu.freezer.dal.mapper.CommentMapper;
import cn.xhu.freezer.service.ICommentService;
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
public class CommentService extends ServiceImpl<CommentMapper, Comment> implements ICommentService {

}
