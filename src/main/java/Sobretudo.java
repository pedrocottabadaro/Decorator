public class Sobretudo extends RoupaDecorator{
    public Sobretudo(Roupa roupa) {
        super(roupa);
    }

    public String getTecido(){
        return super.getTecido()+",Algodão Falso";
    };
    public String getTamanho(){
        return super.getTamanho()+",XG";
    };
}
