package org.trc.util;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * Created by wangzhen on 2017/6/6
 */
public interface BaseMapper<T> extends Mapper<T>, MySqlMapper<T> {

}
