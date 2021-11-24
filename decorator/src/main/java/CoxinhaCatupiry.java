public class CoxinhaCatupiry extends LanchoneteDecorator{

    public CoxinhaCatupiry(Lanchonete lanchonete){
        super (lanchonete);
    }

    public String getNomeSalgado(){
        return "coxinha";
    }

    public String getNomeSabor(){
        return "frango / catupiry";
    }
}
