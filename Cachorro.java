package Herança.EXE;

public class Cachorro extends Animal {
    private boolean correr;
    void correr(){
        System.out.println("Esse animal consegue correr: " +getCorrer());
    }

    public boolean getCorrer() {
        return correr;
    }

    public void setCorrer(boolean correr) {
        this.correr = correr;
    }
}

