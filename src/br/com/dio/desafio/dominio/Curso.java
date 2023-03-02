package br.com.dio.desafio.dominio;

import java.util.Objects;

public class Curso {

    private String titulo;
    private String descricao;
    private int cargaHoraria;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + titulo + '\'' +
                ", descricao='" + descricao + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Curso)) return false;
        Curso curso = (Curso) o;
        return getCargaHoraria() == curso.getCargaHoraria() && Objects.equals(getTitulo(), curso.getTitulo()) && Objects.equals(getDescricao(), curso.getDescricao());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTitulo(), getDescricao(), getCargaHoraria());
    }
}
