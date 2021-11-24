public class Lanche implements Lanchonete{

    public String salgado;

    public Lanche(){
    }

    public Lanche(String salgado){
        this.salgado=salgado;
    }

    public String getSalgado(){
        return salgado;
    }

    public String getSabor(){
        return "sabor";
    }
}
