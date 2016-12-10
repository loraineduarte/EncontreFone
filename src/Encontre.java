
import java.io.*; /// assim eu coloco todas as classas do java.io



public class Encontre {

    private static void encontra (String s){


        if((s.length()>=1)&&(s.length()<=30)) {
            StringBuilder line = new StringBuilder();
            for (int i = 0; i < s.length(); i++) {

                if(s.charAt(i)=='-'){
                    line.append("-");
                }
                if(s.charAt(i)=='0'){
                    line.append("0");
                }
                if(s.charAt(i)=='1'){
                    line.append("1");
                }
                if((s.charAt(i)=='A')||(s.charAt(i)=='B')||(s.charAt(i)=='C')){
                    line.append("2");
                }
                if((s.charAt(i)=='D')||(s.charAt(i)=='E')||(s.charAt(i)=='F')){
                    line.append("3");
                }
                if((s.charAt(i)=='G')||(s.charAt(i)=='H')||(s.charAt(i)=='I')){
                    line.append("4");
                }
                if((s.charAt(i)=='J')||(s.charAt(i)=='K')||(s.charAt(i)=='L')){
                    line.append("5");
                }
                if((s.charAt(i)=='M')||(s.charAt(i)=='N')||(s.charAt(i)=='O')){
                    line.append("6");
                }
                if((s.charAt(i)=='P')||(s.charAt(i)=='Q')||(s.charAt(i)=='R')||(s.charAt(i)=='S')){
                    line.append("7");
                }
                if((s.charAt(i)=='T')||(s.charAt(i)=='U')||(s.charAt(i)=='V')){
                    line.append("8");
                }
                if((s.charAt(i)=='W')||(s.charAt(i)=='X')||(s.charAt(i)=='Y')||(s.charAt(i)=='Z')){
                    line.append("9");
                }
                if((s.charAt(i)>=97)&&(s.charAt(i)<=122)||(s.charAt(i)>=48)&&(s.charAt(i)<=57)){
                   line.delete(0, line.length());
                    line.append("Erro - Linha possui caracter incorreto");
                    break;
                }


            }
            String finalLine = line.toString();
            System.out.println(finalLine);
        }
        else {
            System.out.println("Erro - expressão de tamanho errado ou linha vazia");
        }
    }



    public static void main(String [] args) throws IOException{


        int linha=0;
        //file reader retirado de : https://www.caelum.com.br/apostila-java-orientacao-objetos/pacote-java-io/#15-6-uma-maneira-mais-facil-scanner-e-printstream
        InputStream is = new FileInputStream("arquivo.txt");
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);

        String s = br.readLine(); // primeira linha

        while (s != null) {
            //System.out.println(s);
            linha++;
            System.out.println("linha:" + linha);
            encontra(s);
            s = br.readLine();
        }

        br.close();
    }


}


