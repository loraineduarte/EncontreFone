/**
 * Created by loraine on 01/12/16.
 */
//imports para a leitura do txt
import java.io.InputStream;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.*; /// assim eu coloco todas as classas do java.io

//outros imports



public class Encontre {



    public static void main(String [] args) throws IOException{



        //file reader retirado de : https://www.caelum.com.br/apostila-java-orientacao-objetos/pacote-java-io/#15-6-uma-maneira-mais-facil-scanner-e-printstream
        InputStream is = new FileInputStream("arquivo.txt");
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);

        String s = br.readLine(); // primeira linha

        while (s != null) {
            System.out.println(s);
            s = br.readLine();
        }

        br.close();
    }
}


