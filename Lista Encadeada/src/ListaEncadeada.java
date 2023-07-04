public class ListaEncadeada<T> {
    No<T> referenciaEntrada;

    public ListaEncadeada() {
        this.referenciaEntrada = null;
    }

    public void add(T conteudo) {
        No<T> novoNo = new No<>(conteudo);
        if (this.isEmpty()) {
            referenciaEntrada = novoNo;
            return;
        }

        No<T> noAuxiliar = referenciaEntrada;
        for (int i = 0; i < this.size() - 1; i++) {
            noAuxiliar = noAuxiliar.getProxNo();
        }

        noAuxiliar.setProxNo(novoNo);
    }

    public T get(int index) {
        return getNo(index).getConteudo();
    }

    public T remove(int index) {
        No<T> noPivor = this.getNo(index);
        if (index == 0) {
            referenciaEntrada = noPivor.getProxNo();
            return noPivor.getConteudo();
        }

        No<T> noAnterior = getNo(index - 1);
        noAnterior.setProxNo(noPivor.getProxNo());

        return noPivor.getConteudo();
    }

    private No<T> getNo(int index) {
        validaIndice(index);

        No<T> noAuxiliar = referenciaEntrada;
        No<T> noRetorno = null;

        for (int i = 0; i <= index; i++) {
            noRetorno = noAuxiliar;
            noAuxiliar = noAuxiliar.getProxNo();
        }

        return noRetorno;
    }

    private void validaIndice(int index) {
        if (index >= size()) {
            int tam = size() - 1;
            throw new IndexOutOfBoundsException(
                    "Não existe conteúdo no índice: " + index + " desta lista. Esta lista só vai até o indice: " + tam);
        }
    }

    public int size() {
        int tamanhoLista = 0;
        No<T> referenciaAux = referenciaEntrada;
        while (true) {
            if (referenciaAux != null) {
                tamanhoLista++;
                if (referenciaAux.getProxNo() != null) {
                    referenciaAux = referenciaAux.getProxNo();
                }
            } else {
                break;
            }
        }

        return tamanhoLista;
    }

    public boolean isEmpty() {
        return referenciaEntrada == null ? true : false;
    }

    public String toString() {
        String str = "";

        No<T> noAuxiliar = referenciaEntrada;

        for (int i = 0; i < this.size(); i++) {
            str += "No{conteudo}=" + noAuxiliar.getConteudo() + "} --> ";
            noAuxiliar = noAuxiliar.getProxNo();
        }
        str += "null";

        return str;
    }
}