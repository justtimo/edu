package com.wby.edu.service.edu.service.impl;

import com.wby.edu.service.edu.entity.Comment;
import com.wby.edu.service.edu.mapper.CommentMapper;
import com.wby.edu.service.edu.service.CommentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 评论 服务实现类
 * </p>
 *
 * @author wby
 * @since 2021-01-30
 */
@Service
public class CommentServiceImpl extends ServiceImpl<CommentMapper, Comment> implements CommentService {

}
