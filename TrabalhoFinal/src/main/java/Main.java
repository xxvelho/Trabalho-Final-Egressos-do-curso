import InterfaceGrafica.coord.Chaves;
import InterfaceGrafica.jfPrincipal;
import Pessoa.Adm;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    //salvando arquivo
    public static void gravarArquivo(Adm adm)
            throws IOException {
        ObjectOutputStream arquivo =
                new ObjectOutputStream(
                        new FileOutputStream("backup.dat")
                );

        arquivo.writeObject(adm);
        arquivo.close();
    }
    //salvar login
    public static void salvarLogado(Chaves keys)
            throws IOException {
        ObjectOutputStream arquivo =
                new ObjectOutputStream(
                        new FileOutputStream("logado.dat")
                );

        arquivo.writeObject(keys);
        arquivo.close();
    }
    //recuperando arquivo
    public static Adm lerArquivo()
            throws IOException, ClassNotFoundException {
        Adm novo;

        ObjectInputStream arquivo =
                new ObjectInputStream(
                        new FileInputStream("backup.dat")
                );
        
        novo = (Adm) arquivo.readObject();
        arquivo.close();
        return novo;
    }
    //recuperar chaves
    public static Chaves recuperarLogado()
            throws IOException, ClassNotFoundException {
        Chaves novo;

        ObjectInputStream arquivo =
                new ObjectInputStream(
                        new FileInputStream("logado.dat")
                );
        
        novo = (Chaves) arquivo.readObject();
        arquivo.close();
        return novo;
    }
    
    //main
    public static void main(String[] args) {
        Adm admRei;
        admRei = new Adm("admin", "admin");
        Chaves chaves;
        chaves = new Chaves("", "");
        Path arquivo = Paths.get("backup.dat");
        Path arquivo2 = Paths.get("logado.dat");
        
        //verifica se exite arquivo e cria caso contrario
        if(!(Files.exists(arquivo) && Files.exists(arquivo2))){
            try{
                salvarLogado(chaves);
                gravarArquivo(admRei);
            }catch(IOException e){
                System.out.println("Erro ao tentar criar arquivo");
            }
        }else{
            try {
                admRei = lerArquivo();
            }catch(ClassNotFoundException e){
                System.out.println("Erro ;-;");
            }catch(IOException e){
                System.out.println("Erro ao tentar ler arquivo");
            }
        }
        
        new jfPrincipal().setVisible(true);
    }
}