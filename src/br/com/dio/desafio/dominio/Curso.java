package br.com.dio.desafio.dominio;

import java.util.Objects;

public class Curso extends Conteudo{


    private int cargaHoraria;

    @Override
    public double calcularxp() {
        return XP_PADRAO * cargaHoraria;  }


    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
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
