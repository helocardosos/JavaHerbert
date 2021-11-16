package trabjava;

import java.io.*;

public class Programa3 {

    public static void main(String args[]) throws IOException {
        FileInputStream stream = new FileInputStream("C:\\Users\\User\\Documents\\CEFET\\3 info\\Aplicativos Moveis\\Atv1Bim3\\files\\Teste3.txt");
        InputStreamReader reader = new InputStreamReader(stream);
        BufferedReader leitura = new BufferedReader(reader);
        String line = leitura.readLine();

        String [] input1 = new String[2];
        int x = -1;        
        while(line != null) {
        	x = x + 1;
            input1[x] = line;
            line = leitura.readLine();
        }
        String[] input1Out = input1[0].split(" ");
        String[] input2Out = input1[1].split(" ");
        int [] input1Fora = new int [input1Out.length];
        int [] input2Fora = new int [input2Out.length];
        for(int b=0; b<input1Out.length; b++) {
        	input1Fora[b] = Integer.parseInt(input1Out[b]);
        	input2Fora[b] = Integer.parseInt(input2Out[b]);
        }
        
        if(input2Fora[0] >= input1Fora[0] && input2Fora[0] <= input1Fora[2] && input2Fora[1] >= input1Fora[1] && input2Fora[1] <= input1Fora[3]) {
        	System.out.println("saída: 1");        	
        } else {
        	if(input2Fora[2] >= input1Fora[0] && input2Fora[2] <= input1Fora[2] && input2Fora[3] >= input1Fora[1] && input2Fora[3] <= input1Fora[3]) {        	
        		System.out.println("saída: 1");
        	} else {
        		System.out.println("saída: 0");
        	}
            leitura.close();
        }
	}
}
