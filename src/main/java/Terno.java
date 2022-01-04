public class Terno extends RoupaDecorator{
    public Terno(Roupa roupa) {
        super(roupa);
    }

    public String getTecido(){
        return super.getTecido()+",Malha Dupla e Couro";
    };
    public String getTamanho(){
        return super.getTamanho()+",XM";
    };

}
