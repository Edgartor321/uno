import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Lector {
    private Integer [] datos;

    public Lector(String ruta_absoluta) {
        datos=new Integer[10000];
        leerTxt(ruta_absoluta);
    }

    private void leerTxt(String ruta_absoluta){
        try (BufferedReader lector=new BufferedReader(new FileReader(ruta_absoluta))){
            String linea;
            int indice =0;
            while ((linea=lector.readLine())!=null && indice <datos.length){
                String[] divididos = linea.split(",");
                for (int col =0; col <divididos.length&&indice< datos.length;col++){
                    datos[indice]=Integer.valueOf(divididos[col].trim());
                    indice++;
                }
            }
        }catch (IOException | NumberFormatException e){
            System.out.println(e.getMessage());
        }
    }
    public Integer[] getDatos(){
        return datos;
    }
}
