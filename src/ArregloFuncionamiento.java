public class ArregloFuncionamiento implements Base{
    private int posicion_actual=0;
    @Override
    public void insertar(Integer x, Integer[] l){
        if (l == null) {
            throw new IllegalArgumentException("El arreglo no puede ser nulo");
        }
        if (posicion_actual<l.length){
            l[posicion_actual]=x;
            posicion_actual++;
        }else{
            throw new RuntimeException("El arreglo no tiene cupo");
        }
    }

    @Override
    public int localizar(int x, Integer[] l){
        boolean encontrado = false;
        for (int i = 0; i < l.length; i++) {
            if (x == l[i]) {
                encontrado = true;
                return i;
            }
        }
        if (!encontrado){
            throw new RuntimeException("Elemento no encontrado en el arreglo");
        }
        return 0;
    }

    @Override
    public Integer recuperar(int p, Integer[] l) {

        return 0;
    }

    @Override
    public void suprimir(int p, Integer[] l) {

    }

    @Override
    public Integer siguiente(int p, Integer[] l) {
        return 0;
    }

    @Override
    public Integer anterior(int p, Integer[] l) {
        return 0;
    }

    @Override
    public void limpiar(Integer[] l) {

    }

    @Override
    public Integer primero(Integer[] l) {
        return 0;
    }

    @Override
    public Integer[] imprime(Integer[] l) {
        return new Integer[0];
    }

    @Override
    public void asigna(int p, Integer x, Integer[] l) {

    }
}
