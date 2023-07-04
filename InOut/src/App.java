import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws IOException {
        copiarArquivo();
    }

    public static void receberT_imprimirC() throws IOException{

       /*  InputStream is = System.in;
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr); */

        System.out.println("Digite tres filmes: ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        do {
            bw.write(line);
            bw.newLine();
            line = br.readLine();
        } while (!line.isEmpty());

        bw.flush();

        br.close();
        bw.close();
    }

    public static void escreverDoucmento() throws IOException{
        PrintWriter pw = new PrintWriter(System.out);
        pw.println("Digite 3 recomendações de filmes: ");
        pw.flush();

        Scanner in = new Scanner(System.in);
        String line = in.nextLine();

        File f = new File("recomendacoes.txt");

        BufferedWriter bw = new BufferedWriter(new FileWriter(f.getName()));

        do {
            bw.write(line);
            bw.newLine();
            line = in.nextLine();
        } while (!(line.equalsIgnoreCase("fim")));

        pw.printf("Arquivo foi criado com sucesso!", f.getName());

        pw.close();
        in.close();
        bw.close();
    }


    public static void copiarArquivo() throws IOException{
        File f = new File("C:/Users/guilh/Documents/programing/Projetos/Exercicios-Java-Dio/InOut/recomendacoes.txt");
        String nomeArquivo = f.getName();

        /* FileReader r = new FileReader(nomeArquivo);
        BufferedReader br = new BufferedReader(r); */

        BufferedReader br = new BufferedReader(new FileReader(nomeArquivo));
        String line = br.readLine();
        
        String nomeArquivocopy = nomeArquivo.substring(0, nomeArquivo.indexOf(".")).concat("-copy.txt");

        File fcopy = new File(nomeArquivocopy);

        BufferedWriter bw = new BufferedWriter(new FileWriter(fcopy.getName()));

        do {
            bw.write(line);
            bw.newLine();
            bw.flush();
            line = br.readLine();
        } while (line != null);

        System.out.printf("Arquivo \"%s\" criado com sucesso", fcopy.getName());

        PrintWriter pw = new PrintWriter(System.out);
        pw.println("Recomende 3 livros: ");
        pw.flush();

        adicionarInfoArquivo(fcopy.getName());

        pw.printf("Ok! Tudo certo. Tamanho do arquivo %d bytes", fcopy.length());

        br.close();
        bw.close();
        pw.close();
    }

    public static void adicionarInfoArquivo(String arquivo) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();

        BufferedWriter bw = new BufferedWriter(new FileWriter(arquivo, true));

        do {
            bw.write(line);
            bw.newLine();
            line = br.readLine();
        } while (!(line.equalsIgnoreCase("fim")));

        br.close();
        bw.close();
    }
}
