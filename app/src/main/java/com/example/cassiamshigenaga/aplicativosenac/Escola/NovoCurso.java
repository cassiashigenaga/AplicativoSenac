package com.example.cassiamshigenaga.aplicativosenac.Escola;

public class NovoCurso {

        public String curso;
        public String duracao;
        public String tipo;
        public String vagas;

    public NovoCurso(String curso, String duracao, String tipo, String vagas) {
        this.curso = curso;
        this.duracao = duracao;
        this.tipo = tipo;
        this.vagas = vagas;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getDuracao() {
        return duracao;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getVagas() {
        return vagas;
    }

    public void setVagas(String vagas) {
        this.vagas = vagas;
    }
}

