
package model.bean;


public class UsuarioBean {
    int id;
    String nome;
    String pwd;

    public UsuarioBean(String nome, String pwd) {
        this.nome = nome;
        this.pwd = pwd;
    }   
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
}
