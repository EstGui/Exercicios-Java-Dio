import java.time.LocalDate;

public class Mentoria extends Conteudo{
    private LocalDate data;
    
    public LocalDate getData() {
        return data;
    }
    public void setData(LocalDate data) {
        this.data = data;
    }

    public double calcularXP() {
        return xp_padrao + 20;
    }

    @Override
    public String toString() {
        return "Mentoria:\nTítulo: " + this.getTitulo() + "\nDescrição:" + this.getDescricao() + "\nData:" + data;
    }
}
