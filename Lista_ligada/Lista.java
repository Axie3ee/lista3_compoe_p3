public class Lista {
    private No primeiro;
    //construtor é o padrão
    public boolean listaVazia() {
        return primeiro == null;
    }
    public void insereInicio(String info) {
        No novo = new No(info);
        if (!listaVazia()) {
            novo.setProximo(primeiro);
        }
        primeiro = novo;
    }
    
    public void insereFim (String info) {
        No novo = new No(info);
        if (listaVazia())
            primeiro = novo;
        else {
            No runner = primeiro;
            while (runner.getProximo() != null) {
                runner = runner.getProximo();
            }
            runner.setProximo(novo);
        }
    }
    public String removeFim() {
        if (listaVazia()){
            return "biblioteca vazia";
        }
        else if (primeiro.getProximo() == null) { //tem um só
            String livro = primeiro.getInfo();
            primeiro = null; //esvaziou a lista
            return livro;
        }
        No runner = primeiro;
        while (runner.getProximo().getProximo() != null){
            runner = runner.getProximo();
        }
        String livro = runner.getProximo().getInfo();
        runner.setProximo(null);
        return livro;
    }
    @Override
    public String toString() {
        if (listaVazia()) return "lista vazia";
        String s = "";
        No runner = primeiro;
        while (runner != null) { //vai até o fim da lista
            s += runner.getInfo() + "->";
            runner = runner.getProximo();
        }
        return s + "//";
    }
}

