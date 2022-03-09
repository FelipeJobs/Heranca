package Herança.EXE;

public class Animal  {
    private String nome;
    private int idade;
    private boolean emiteSom;
    String emitirSom(){
        if(getEmiteSom()){
            return "Esse animal emite som";
        }
        else {
            return "Esse animal não emite som";
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public boolean getEmiteSom() {
        return emiteSom;
    }

    public void setEmiteSom(boolean emiteSom) {
        this.emiteSom = emiteSom;
    }
}
