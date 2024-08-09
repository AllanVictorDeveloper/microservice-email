package com.ms.email.enums;

public enum StatusEmail {
    PROCESSING("PROCESSING"),
    SENT("SENT"),
    ERROR("ERROR");


    private String descricao;

    StatusEmail(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        return this.descricao = descricao;
    }
}
