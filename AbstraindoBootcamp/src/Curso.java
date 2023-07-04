public class Curso extends Conteudo{
    private int cargaHoraria;

    public int getCargaHoraria() {
        return cargaHoraria;
    }
    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }


    public double calcularXP() {
       return xp_padrao + cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso:\nTítulo: " + this.getTitulo() + "\nDescrição:" + this.getDescricao();
    }
}
