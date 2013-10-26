/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pablo
 */
public class Usuario {

    private String nome;
    private String senha;
    private Usuario next;
    
    public void  setNome(String nome){
        this.nome=nome;
    }
    public void setSenha(String senha){
        this.senha=senha;
    }
    public void setNext(Usuario next){
        this.next=next;                
    }
    public String getNome(){
        return this.nome;
    }
    public String getSenha(){
        return this.senha;
    }
    public Usuario getNext(){
        return this.next;
    }
    
    
}
