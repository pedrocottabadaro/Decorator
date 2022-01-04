public abstract class RoupaDecorator implements Roupa{

    private Roupa roupa;

    public RoupaDecorator(Roupa roupa) {
        this.roupa = roupa;
    }
    public String getTecido(){
        return roupa.getTecido();
    };
    public String getTamanho(){
        return roupa.getTamanho();
    };


}
