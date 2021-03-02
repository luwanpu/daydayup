package com.lwp.ydfsdata.pojo;

import lombok.Data;

@Data
public class ResMessage {
    String code;
    String message;
    Object data;

    public ResMessage(){
    }

    public ResMessage(String code,String message){
        this.code = code;
        this.message = message;
    }

    public ResMessage(Object data,String code,String message){
        this.code = code;
        this.message = message;
        this.data = data;
    }
    public static String success (Object data){
        return (new ResMessage(data,"200","调用成功")).toString();
    }
    public static String success(Object data,String message){
        return (new ResMessage(data,"200",message)).toString();
    }
    public static String error(String code,String message){
        return (new ResMessage(code,message)).toString();
    }

}
