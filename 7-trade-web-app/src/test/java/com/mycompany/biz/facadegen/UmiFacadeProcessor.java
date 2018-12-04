package com.mycompany.biz.facadegen;

import java.io.IOException;
import java.util.Arrays;
import java.util.InvalidPropertiesFormatException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.CookieValue;
import org.stategen.framework.lite.Pagination;
import org.stategen.framework.progen.BaseGenFacadeProcessor;
import org.stategen.framework.progen.GenContext;
import org.stategen.framework.progen.PathType;
import org.stategen.framework.util.CollectionUtil;
import org.stategen.framework.util.StringUtil;

import freemarker.template.TemplateException;

public class UmiFacadeProcessor extends BaseGenFacadeProcessor {
    final static org.slf4j.Logger logger = org.slf4j.LoggerFactory.getLogger(UmiFacadeProcessor.class);

    public UmiFacadeProcessor() {
        super();
    }

    public static void main(String[] args) {
        UmiFacadeProcessor umiFacadeProcessor = new UmiFacadeProcessor();
        try {
            logger.info("==================umi前端代码生成开始==========================="); 
            umiFacadeProcessor.genFacade(); 
            logger.info("==================umi前端代码生成结束===========================");
        } catch (Exception e) {
            logger.error("生成前端代码时出错:", e);
        }
    }

    public void gen() {
        main(null);
    }

    public void genFacade() throws InvalidPropertiesFormatException, IOException, TemplateException {
        //这里注册的将替代supper中的注册
        GenContext.registSimpleClz(Void.TYPE, "void");
        GenContext.registSimpleClz(Class.class, "string");
        GenContext.registSimpleClz(Pagination.class, "PaginationProps","import {PaginationProps} from \"antd/lib/pagination\"");
        
        GenContext.registIgnoreParamClz(HttpServletRequest.class);
        GenContext.registIgnoreParamAnnotationClz(CookieValue.class);
        GenContext.addStaticUtil(StringUtil.class);
        GenContext.addStaticUtil(CollectionUtil.class);
        GenContext.tempDirs =Arrays.asList("/ts-api","/ts-umi","/ts-umi-m");
        GenContext.outDir="app-frontend/src/intergrade/";
        GenContext.outConfigDir="configs";

        PathType[] pathTypes = PathType.values();
        for (PathType pathType : pathTypes) {
            String nameStr = pathType.getWrapName() + "s";
            GenContext.put(pathType, nameStr);
        }
        super.scanControllerAndGenFacade();
    }

}
