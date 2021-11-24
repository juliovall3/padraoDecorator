public abstract class LanchoneteDecorator implements Lanchonete{

    private Lanchonete lanchonete;
    public String salgado;

    public LanchoneteDecorator(Lanchonete lanchonete){
        this.lanchonete=lanchonete;
    }

    public Lanchonete getLanchonete(){
        return lanchonete;
    }

    public void setLanchonete(Lanchonete lanchonete){
        this.lanchonete=lanchonete;
    }

    public abstract  String getNomeSalgado();

    public String getSalgado(){
        return this.lanchonete.getSalgado() + this.getNomeSalgado();
    }

    public abstract  String getNomeSabor();

    public String getSabor(){
        return this.lanchonete.getSabor() + this.getNomeSabor();
    }


}
