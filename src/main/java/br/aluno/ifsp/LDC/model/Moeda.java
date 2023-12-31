package br.aluno.ifsp.LDC.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Moeda {

 

     
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idMoeda;

    private double valor;
    private String cor;
    private double peso;
    private double diametro;


    public  Moeda(){

    }
    public Moeda(double valor, String cor, double peso, double diametro) {
        
         this.valor = valor;
        this.cor = cor;
        this.peso = peso;
        this.diametro = diametro;
    }
    
    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getDiametro() {
        return diametro;
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }

    public Long getIdMoeda() {
        return idMoeda;
    }

    public void setIdMoeda(Long idMoeda) {
        this.idMoeda = idMoeda;
    }
    @Override
    public String toString() {
        return "Moeda [idMoeda=" + idMoeda + ", valor=" + valor + ", cor=" + cor + ", peso=" + peso + ", diametro="
                + diametro + "]";
    }

   
    
}

