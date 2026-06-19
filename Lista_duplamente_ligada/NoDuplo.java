public class No {
    private String info;
    private No proximo;
    public No(String info) {
        this.info = info;
        this.proximo = null; //por clareza
    }
    public No getProximo() {
        return proximo;
    }
    public void setProximo(No proximo) {
        this.proximo = proximo;
    }
    public String getInfo() {
        return info;
    }
    @Override
    public String toString () {
        //return "[" + info + ", " + proximo + "]";
        return "[" + info + "]";
    }
}
