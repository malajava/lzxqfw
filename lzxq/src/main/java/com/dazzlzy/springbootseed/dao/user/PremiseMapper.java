package com.dazzlzy.springbootseed.dao.user;

import com.dazzlzy.common.base.BaseMapper;
import com.dazzlzy.springbootseed.model.user.Premise;
import com.dazzlzy.springbootseed.model.user.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 预售公示查询
 */
public interface PremiseMapper extends BaseMapper<User> {

    List<Premise> selectPremise(Premise premise);
}
