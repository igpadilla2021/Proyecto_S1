package Logica;

public class Asiento {
    private int num;
    private boolean ocupado=false;
    public Asiento(int num){
        this.num=num;
    }
    public int getNum(){
        return num;
    }
    public boolean getEstado(){
        return ocupado;  // si retorna true esta ocupado sino no
    }
    public void reservarAsiento(){
        ocupado=true;
    }
    public int getNumero(){
        return num;
    }
}
