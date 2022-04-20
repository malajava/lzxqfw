package com.dazzlzy.springbootseed.service.impl;

import com.dazzlzy.springbootseed.dao.user.PremiseMapper;
import com.dazzlzy.springbootseed.model.user.Premise;
import com.dazzlzy.springbootseed.model.user.User;
import com.dazzlzy.springbootseed.service.PremiseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 用户 Service
 *
 * @author zhaozhenyao
 * @date 2018/5/8
 */
@Service
public class PremiseServiceImpl  implements PremiseService {

    @Autowired
    PremiseMapper premiseMapper;

    @Override
    public List<Premise> selectPremise(Premise premise) {
        return premiseMapper.selectPremise(premise);
    }
}
