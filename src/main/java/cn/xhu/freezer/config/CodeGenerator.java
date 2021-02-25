package cn.xhu.freezer.config;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import com.baomidou.mybatisplus.generator.engine.VelocityTemplateEngine;

/**
 *@author:zx
 *@create time:2021/2/25 22:24
 *@desciption:代码生成器
 *
 */

public class CodeGenerator {
    public static void main(String[] args) {
        // 基本配置
        String projectPath = "E:/springboot/freezer/src/main/java/";
        String tableName = "user,role,customer,inbound,outbound,menu,order_detail,comment,delivery,inbound_item_info,outbound_item_info,product,refund,sell_order,shopcart";
//        String moduleName = "";

        AutoGenerator mpg = new AutoGenerator();
        // 全局配置
        GlobalConfig gc = new GlobalConfig();
        gc.setOutputDir(projectPath);
        gc.setAuthor("zx");
        gc.setOpen(false);
        gc.setSwagger2(false);
        gc.setEnableCache(false);
        gc.setServiceImplName("%sService");
        gc.setIdType(IdType.UUID);
        gc.setBaseColumnList(true);
        gc.setBaseResultMap(true);
        mpg.setGlobalConfig(gc);

        // 数据源配置
        com.baomidou.mybatisplus.generator.config.DataSourceConfig dsc = new DataSourceConfig();
        dsc.setUrl("jdbc:mysql://127.0.0.1:3306/freezesystem?useUnicode=true&zeroDateTimeBehavior=convertToNull&autoReconnect=true&characterEncoding=utf-8");
        dsc.setDriverName("com.mysql.cj.jdbc.Driver");
        dsc.setUsername("root");
        dsc.setPassword("root");
        mpg.setDataSource(dsc);

        // 包配置
        PackageConfig pc = new PackageConfig();
        pc.setParent("cn.xhu.freezer");
        pc.setEntity("dal.entity");
        pc.setMapper("dal.mapper" );
        pc.setXml("dal.mapper.xml");
        pc.setService("service");
        pc.setServiceImpl("service.impl");
        pc.setController("controller" );
        mpg.setPackageInfo(pc);

        // 策略配置
        StrategyConfig strategy = new StrategyConfig();
        strategy.setNaming(NamingStrategy.underline_to_camel);
        strategy.setColumnNaming(NamingStrategy.underline_to_camel);
        strategy.setEntityLombokModel(false);
        strategy.setRestControllerStyle(true);
        strategy.setInclude(tableName.split(","));
        strategy.setSuperEntityColumns("id", "gmt_create", "create_by", "gmt_update", "update_by", "deleted");
        strategy.setControllerMappingHyphenStyle(true);
        strategy.setLogicDeleteFieldName("deleted");

        // 执行
        mpg.setStrategy(strategy);
        mpg.setTemplateEngine(new VelocityTemplateEngine());
        mpg.execute();
    }

}
