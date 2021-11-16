package trabjava;

import java.io.*;

public class Programa1 {

    public static void main(String args[]) throws IOException {
        FileInputStream stream = new FileInputStream("C:\\Users\\User\\Documents\\CEFET\\3 info\\Aplicativos Moveis\\Atv1Bim3\\files\\Teste1.txt");
        InputStreamReader reader = new InputStreamReader(stream);
        BufferedReader leitura = new BufferedReader(reader);
        String line = leitura.readLine();


        String[] input = new String[3];
        int x = -1;
        while(line != null){
            x = x + 1;
            input[x]=line;
            line = leitura.readLine();
        }        
        String[] DiferentesFinais = input[2].split(" ");
        


        int conta = 0;
        int total = 0;
        for (int b=0; b < DiferentesFinais.length; b++){
            conta += Integer.parseInt(DiferentesFinais[b]);
        }
        conta = conta/Integer.parseInt(input[0]);
        
        while(conta<0){
            for(int b=0; b<DiferentesFinais.length; b++){
                total += Integer.parseInt(DiferentesFinais[b]) / conta;
            }
            if(total==Integer.parseInt(input[0])){
                System.out.println("O resultado é : "+conta);
                break;
            }else{
                conta = conta - 1;
                total=0;
            }
            leitura.close();
        };
    }
}