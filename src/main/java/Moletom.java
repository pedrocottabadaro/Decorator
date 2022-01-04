public class Moletom extends RoupaDecorator{
    public Moletom(Roupa roupa) {
        super(roupa);
    }

    public String getTecido(){
        return super.getTecido()+",Alpaca";
    };
    public String getTamanho(){
        return super.getTamanho()+",M";
    };



}
