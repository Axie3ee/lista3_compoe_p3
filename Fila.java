package lista3_compoe_p3;

public class Fila <T> {
    private No<T> primeiro;
    private No<T> ultimo;
    //construtor padrão
    public boolean filaVazia () {
        return primeiro == null;
    }
    public void enfileira (T info) {
        No<T> novo = new No<>(info);
        if (filaVazia()) {
            primeiro = novo;
        }
        else {
            ultimo.setProximo(novo);
        }
        ultimo = novo;
    }
    public T desenfileira () throws Exception {
        if (filaVazia())
            throw new Exception("fila vazia");
        T copia = primeiro.getInfo();
        primeiro = primeiro.getProximo();
        if (primeiro == null) 
            ultimo = null; 
            
        return copia;
    }

    public int contarPacientes() {
        int contador = 0;
        No<T> runner = primeiro;
        while (runner != null) {
            contador++;
            runner = runner.getProximo();
        }
        return contador;
    }

    @Override
    public String toString () {
        if (filaVazia()) return "fila vazia";
        String s = "";
        No<T> runner = primeiro;
        while (runner != null) {
            s += runner + "->";
            runner = runner.getProximo();
        }
        return s + "\\\\";
    }
}
