public class Coxinha extends LanchoneteDecorator{

    public Coxinha(Lanchonete lanchonete){
        super (lanchonete);
    }

    public String getNomeSalgado(){
        return "coxinha";
    }

    public String getNomeSabor(){
        return "frango";
    }
}
