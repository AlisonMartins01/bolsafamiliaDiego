package com.example.appvolleyopet202002;

import java.util.ArrayList;
import java.util.List;

public class BolsaFamilia {
    private int id;
    private Municipio municipio;
    private int quantidadeBeneficiados;
    private Tipo tipo;
    private int valor;

    public BolsaFamilia(){
        this.municipio = new Municipio();
        this.tipo = new Tipo();
    }


    @Override
    public String toString() {
        return "Pokemon:\n" +
                "nome = " + nome + "\n" +
                "Total de ataques disponíveis = " + totalAtaques() + "\n" +
                "Ataques: " + ataques;
    }
}
public class Municipio{
    public string codigoIBGE;
    public string nomeIBGE;
    public string nomeIBGEsemAcento;
    public string pais;
    public UF uf;
}
public class UF {
    public string nome;
    public string sigla;
}
public class Tipo{
    public string descricao;
    public string descricaoDetalhada;
    public int id;
}