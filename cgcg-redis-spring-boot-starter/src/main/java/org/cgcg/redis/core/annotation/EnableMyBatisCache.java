package org.cgcg.redis.core.annotation;

import org.cgcg.redis.core.mybatis.CgBeanHolder;
import org.springframework.context.annotation.Import;

/**
 * .
 *
 * @author zhicong.lin
 * @date 2019/6/24
 */
@Import({CgBeanHolder.class})
public class EnableMyBatisCache {
}
