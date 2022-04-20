package com.dazzlzy.springbootseed.controller;

import com.dazzlzy.common.base.BaseResult;
import com.dazzlzy.common.base.BaseResultGenerator;
import com.dazzlzy.common.configuration.ProjectProperties;
import com.dazzlzy.springbootseed.model.user.Premise;
import com.dazzlzy.springbootseed.service.PremiseService;
import com.github.pagehelper.PageHelper;
import com.google.j2objc.annotations.AutoreleasePool;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Arrays;
import java.util.List;

/**
 * 兰州新区城乡住房建设查询
 */
@Slf4j
@Api(value = "/test", tags = "测试接口模块")
@RestController
@RequestMapping(value = "/cityOrCountryside")
public class CityServiceController {

    @Autowired
    PremiseService premiseService;
    /**
     * 兰州新区，城乡住房建设专题服务：预售项目公示查询
     * @return
     */
    @ApiOperation(value = "预售项目公示查询", notes = "查询功能")
    @GetMapping(value = "/selectPremiseList")
    public BaseResult selectPremiseList(HttpServletRequest request, HttpServletResponse response, Premise premise) {
        PageHelper.startPage(Integer.valueOf(request.getParameter("pageNum")), Integer.valueOf(request.getParameter("pageSize")));
        List<Premise> premises = premiseService.selectPremise(premise);
        //此处本意是将projectProperties返回至前端，但是projectProperties对象是由spring注入而来，其中包含过多的动态代理数据，
        //使用lombok的@Data注解处理BaseResult时，数据过大，返回报错，因此只返回success
        return BaseResultGenerator.success(premise);
    }

}
