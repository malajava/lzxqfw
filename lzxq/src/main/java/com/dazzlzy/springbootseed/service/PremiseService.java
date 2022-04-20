package com.dazzlzy.springbootseed.service;

import com.dazzlzy.springbootseed.model.user.Premise;
import com.dazzlzy.springbootseed.model.user.User;

import java.util.List;

/**
 * 用户 Service
 *
 * @author zhaozhenyao
 * @date 2018/5/8
 */
public interface PremiseService {

    /**
     * 根据传入的参数，查询公示列表
     * @param premise
     * @return
     */
    List<Premise> selectPremise(Premise premise);

}
