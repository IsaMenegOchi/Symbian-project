package com.example.symbianproject.remote;

public class ApiUtil {

    private static final String API_URL = "http://192.168.1.111:4000";

    public static RouterInterface getApiInterface(){
        //indicamos onde roda nossa aplicacao, e indica a rota
        return RetroFit.getClient(API_URL).create(RouterInterface.class);
    }
}
