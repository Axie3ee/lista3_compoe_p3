public class ListaDupla {
    private NoDuplo primeiro;
    private NoDuplo ultimo;
    //construtor padrão
    public boolean estaVazia() {
        return primeiro == null;
    }
    public void insereInicio (String info) {
        NoDuplo novo = new NoDuplo(info);
        if (estaVazia()) {
            ultimo = novo;
        }
        else {
            novo.setProximo(primeiro);
            primeiro.setAnterior(novo);
        }
        primeiro = novo;
    }
    public void insereFim (String info) {
        NoDuplo novo = new NoDuplo(info);
        if (estaVazia()) {
            primeiro = novo;
        }
        else {
            novo.setAnterior(ultimo);
            ultimo.setProximo(novo);
        }
        ultimo = novo;
    }
    
    public void exibirOrdemInversa() {
        NoDuplo runner = ultimo;
        while (runner != null) {
            System.out.println(runner.getInfo());
            runner = runner.getAnterior();
        }
    }
    @Override 
    public String toString () {
        if (estaVazia()) return "lista vazia";
        StringBuilder sBuilder = new StringBuilder();
        NoDuplo runner = primeiro;
        while (runner != null) {
            sBuilder.append(runner + " ");
            runner = (NoDuplo)runner.getProximo();
        }
        sBuilder.append("//");
        return new String(sBuilder);
    }
}
