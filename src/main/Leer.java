package main;
import java.io.*;

//Validaciones

public class Leer {
    //1.-
    public static String dato(){
        String sdato = null;
        try{
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            sdato = entrada.readLine();
        } catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }
        return sdato;
    }

    //2.-
    public static int datoInt(){
        try{
            return (Integer.parseInt(dato()));
        } catch (NumberFormatException error){
            return (Integer.MIN_VALUE);
        }
    }

    //3.-
    public static double datoDouble(){
        try{
            Double d = new Double(dato());
            return (d.doubleValue());
        } catch (NumberFormatException error){
            return (Double.NaN);
        }
    }
}
