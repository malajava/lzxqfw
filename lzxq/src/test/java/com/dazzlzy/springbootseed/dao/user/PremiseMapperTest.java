package com.dazzlzy.springbootseed.dao.user;

import com.dazzlzy.SpringBootSeedApplicationTests;
import com.dazzlzy.springbootseed.model.user.Premise;
import com.dazzlzy.springbootseed.model.user.User;
import com.github.pagehelper.PageHelper;
import junit.framework.TestCase;
import lombok.extern.slf4j.Slf4j;
import oracle.jdbc.proxy.annotation.Pre;
import org.junit.Test;
import org.nutz.lang.Lang;
import org.springframework.beans.factory.annotation.Autowired;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/**
 * premiseMapper测试
 */
@Slf4j
public class PremiseMapperTest extends SpringBootSeedApplicationTests {

    @Autowired
    private PremiseMapper premiseMapper;

    @Test
    public void selectUser() {
           List<Premise> premiseMappers =  premiseMapper.selectPremise(new Premise());
           for (Premise premise: premiseMappers) {
               System.out.println(premise + "\n");
           }
    }

    /**
     * 分页查询测试
     */
    @Test
    public void selectPageUser() {
        PageHelper.startPage(1, 10);
        List<Premise> premiseMappers =  premiseMapper.selectPremise(new Premise());
        for (Premise premise: premiseMappers) {
            System.out.println(premise + "\n");
        }
    }

}
