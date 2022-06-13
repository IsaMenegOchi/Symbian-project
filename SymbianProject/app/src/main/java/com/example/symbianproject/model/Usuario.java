package com.example.symbianproject.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Usuario {

    @SerializedName("idUsuario")
    @Expose
    private int idUsuario;

    @SerializedName("nome")
    @Expose
    private String nomeUsuario;

    @SerializedName("sobrenome")
    @Expose
    private String sobrenomeUsuario;

    @SerializedName("email")
    @Expose
    private String emailUsuario;

    @SerializedName("celular")
    @Expose
    private String celularUsuario;

    public Usuario() {
    }

    public Usuario(int idUsuario, String nomeUsuario, String sobrenomeUsuario, String emailUsuario, String celularUsuario) {
        this.idUsuario = idUsuario;
        this.nomeUsuario = nomeUsuario;
        this.sobrenomeUsuario = sobrenomeUsuario;
        this.emailUsuario = emailUsuario;
        this.celularUsuario = celularUsuario;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public String getSobrenomeUsuario() {
        return sobrenomeUsuario;
    }

    public void setSobrenomeUsuario(String sobrenomeUsuario) {
        this.sobrenomeUsuario = sobrenomeUsuario;
    }

    public String getEmailUsuario() {
        return emailUsuario;
    }

    public void setEmailUsuario(String emailUsuario) {
        this.emailUsuario = emailUsuario;
    }

    public String getCelularUsuario() {
        return celularUsuario;
    }

    public void setCelularUsuario(String celularUsuario) {
        this.celularUsuario = celularUsuario;
    }
}
