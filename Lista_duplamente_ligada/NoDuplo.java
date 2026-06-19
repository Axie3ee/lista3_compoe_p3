public class NoDuplo extends No{
    private NoDuplo anterior;
    public NoDuplo (String info) {
        super(info);
        this.anterior = null;
    }
    public NoDuplo getAnterior() {
        return anterior;
    }
    public void setAnterior(NoDuplo anterior) {
        this.anterior = anterior;
    }
}
