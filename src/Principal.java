import java.util.Random;

public class Principal {
    public static void main(String[] args) {
        ArregloFuncionamiento funcionamiento =new ArregloFuncionamiento();
        Random r=new Random();
        Integer[] array1=new Integer[100];
        for (int i = 0; i < 100; i++) {
            funcionamiento.insertar(r.nextInt(1,100),array1);
        }
        funcionamiento.imprime(array1);
        //funcionamiento.insertar(1,array1); //Check
        //funcionamiento.localizar(20,array1);//check
        //System.out.println(funcionamiento.recuperar(100,array1));//check
        //funcionamiento.suprimir(12,array1);//check
        //System.out.println(funcionamiento.siguiente(-1,array1)+"  "+funcionamiento.anterior(3,array1));//Check
       // funcionamiento.limpiar(array1);//check
        //System.out.println(funcionamiento.primero(array1));//Check
        funcionamiento.asigna(2,1,array1);
        funcionamiento.imprime(array1);
    }
}
