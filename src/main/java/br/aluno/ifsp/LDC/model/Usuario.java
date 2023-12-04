package br.aluno.ifsp.LDC.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Usuario {
    @Id
    private String id;
    private String dataNasc;
    private String email;
    private String password;
    private String username;
    private String localizacao;
    private String deficiencia;

    public Usuario(String id, String dataNasc, String email, String password, String username,
            String localizacao, String deficiencia) {
        this.id = id;
        this.dataNasc = dataNasc;
        this.email = email;
        this.password = password;
        this.username = username;
        this.localizacao = localizacao;
        this.deficiencia = deficiencia;
    }

    public String getid() {
        return id;
    }

    public void setid(String id) {
        this.id = id;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getpassword() {
        return password;
    }

    public void setpassword(String password) {
        this.password = password;
    }

    public String getusername() {
        return username;
    }

    public void setusername(String username) {
        this.username = username;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public String getDeficiencia() {
        return deficiencia;
    }

    public void setDeficiencia(String deficiencia) {
        this.deficiencia = deficiencia;
    }

    @Override
    public String toString() {
        return "Usuario [id=" + id + ", dataNasc=" + dataNasc + ", email=" + email + ", password=" + password
                + ", username=" + username + ", localizacao=" + localizacao + ", deficiencia=" + deficiencia
                + "]";
    }
}
