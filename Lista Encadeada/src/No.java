public class No<T> {
    private T conteudo;
    private No<T> proxNo;

    public No(){
        this.proxNo = null;
    }
    
    public No(T conteudo) {
        this.proxNo = null;
        this.conteudo = conteudo;
    }

    public No(T conteudo, No<T> proxNo) {
        this.proxNo = null;
        this.conteudo = conteudo;
        this.proxNo = proxNo;
    }

    public T getConteudo() {
        return this.conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public No<T> getProxNo() {
        return this.proxNo;
    }

    public void setProxNo(No<T> proxNo) {
        this.proxNo = proxNo;
    }

    @Override
    public String toString() {
        return "No [conteudo=" + conteudo + ", proxNo=" + proxNo + "]";
    }

    public String toStringEncadeado(){
        String str = "No [conteudo=" + conteudo + ", proxNo=" + proxNo + "]";

        if (proxNo != null) {
            str += "->" + proxNo.toString();
        } else {
            str += "-> null";
        }

        return str;
    }
}