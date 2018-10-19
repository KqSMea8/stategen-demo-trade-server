package com.mycompany.biz.domain;

import org.stategen.framework.lite.Response;

import com.mycompany.biz.enums.ResponseStatus;

public class ResponseExtend<T> extends Response<T> {
    
   // private String test1="test1";
//    /**不会生成前端代码*/
    //private transient String test2="test2";
//    /**不会生成前端代码*/
//    @JSONField(serialize=false)
//    private String test3="test3";
//    public String getTest2() {
//        return test2;
//    }
//  public String getTest1() {
//  return test1;
//}  
//    public String getTest3() {
//        return test3;
//    }
//    /**不会生成前端代码*/
//    @JSONField(serialize=false)
//    public String getTest4() {
//        return "test4";
//    }


    /***给一个默认的不带参数的方法，是因为spring创建时不需要参数*/
    public ResponseExtend(){
        super();
    }
    
    public ResponseExtend(T data) {
        this();
        setData(data);
        setStatus(ResponseStatus.OK);
    }

    public Integer getCode() {
        return super._getCode();
    }

    public T getData() {
        return super._getData();
    }

    public ResponseStatus getStatus() {
        return (ResponseStatus)super._getStatus();
    }


    public String getExeptionClass() {
        return super._getExeptionClass();
    }
    
    @SuppressWarnings("rawtypes")
    public static ResponseExtend error(ResponseStatus responseStatus){
        ResponseExtend responseExtend=new ResponseExtend(); 
        responseExtend.setStatus(responseStatus);
        return responseExtend;
    }
    

}
