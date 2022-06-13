package com.example.symbianproject.remote;

import com.example.symbianproject.model.Usuario;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface RouterInterface {

    @POST("/usuario/cadastrar")
    Call<Usuario> addUsuarioComum(@Body Usuario usuario);

    @GET("/usuario/listar")
    Call<List<Usuario>> getUsuarios();



}
