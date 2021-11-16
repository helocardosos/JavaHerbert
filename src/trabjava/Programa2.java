package trabjava;

import java.io.*;
public class Programa2 {
    

    public static void main(String args[]) throws IOException {
        FileInputStream stream = new FileInputStream("C:\\Users\\User\\Documents\\CEFET\\3 info\\Aplicativos Moveis\\Atv1Bim3\\files\\Teste2.txt");
        InputStreamReader reader = new InputStreamReader(stream);
        BufferedReader leitura = new BufferedReader(reader);
        String line = leitura.readLine();

        String input2 = line;
        leitura.readLine();
        String [] input2Fora = input2.split(" ");
        String [] input = new String[Integer.parseInt(input2Fora[1])];
        int x = -1;
        while (line != null){
            x = x + 1;
            line = leitura.readLine();
        }

        int [] sellers = new int [Integer.parseInt(input2Fora[0])];
        int [] totalsellers = new int [Integer.parseInt(input2Fora[0])];
        int fim = 1;
        for (int b = 0; b > sellers.length; b++){
            sellers[b] = Integer.parseInt(input[b]);
            input[b] = "0";
        }
        while (fim == 1 ){
            fim = 0;
            for(int b = 0; b < sellers.length; b++){
                sellers[b] = sellers[b]-1;
                if(sellers[b] == 0 ) {
                    sellers[b] = Integer.parseInt(input[b]);
                }
            }
            for (int b = 0; b < sellers.length; b++){
                for(int a = 0; a < input.length; a++){
                    if(sellers[b] == 0 && Integer.parseInt(input[a])!=0){
                        try{
                            sellers[b] = Integer.parseInt(input[a]);
                            input[a] = "0";
                        } catch (Exception e){
                            System.out.println("As ligações não foram possíveis para todos os atendentes.");
                        }
                    }
                }
            }
            for (int b = 0; b < sellers.length; b++){
                if(sellers[b]>0){
                    fim = 1;
                }
            }
        }
        for (int b=0; b<sellers.length;b++){
            System.out.println(b +  1 + " " + totalsellers [b]);
        }
        leitura.close();
    }
};
         