public class ArregloFuncionamiento implements Base{
    private int posicion_actual=0;
    @Override
    public void insertar(Integer x, Integer[] l){
        if (l.length<1) {
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
    public void localizar(int x, Integer[] l){
        boolean localizado =false;
        for (int i = 0; i < l.length; i++) {
            if (l[i]!=null&& l[i]==x) {
                System.out.println(i);
                localizado=true;
            }
        }
        if (!localizado){
            throw new RuntimeException("El elemneto no fue encontrado en el arreglo");
        }
        System.out.println();
    }

    @Override
    public Integer recuperar(int p, Integer[] l) {
        if (p<l.length&&p>=0){
            return l[p];
        }else{
            throw new RuntimeException("El indice es mas grande que el tamaño de arreglo");
        }
    }

    @Override
    public void suprimir(int p, Integer[] l) {
        if (p<l.length&&p>=0){
            l[p]=null;
            System.out.println("El elemento con indice "+p+" fue eliminadoo");
        }else{
            throw new RuntimeException("El indice ingresado no se encuentra en el arreglo");
        }
    }

    @Override
    public Integer siguiente(int p, Integer[] l) {
        if (p+1<l.length&&p+1>=0){
            return l[p+1];
        }else{
            throw new RuntimeException("El indice esta fuera del rango del arreglo");
        }
    }

    @Override
    public Integer anterior(int p, Integer[] l) {
        if (p-1<l.length&&p-1>=0){
            return l[p-1];
        }else{
            throw new RuntimeException("El indice esta fuera del rango del arreglo");
        }
    }

    @Override
    public void limpiar(Integer[] l) {
        for (int i = 0; i < l.length; i++) {
            l[i]=null;
        }
        System.out.println("El arreglo se ha limpiado");
    }

    @Override
    public Integer primero(Integer[] l) {
        Integer i=recuperar(0,l);
        return i;
    }

    @Override
    public void imprime(Integer[] l) {
        for (Integer imp:l){
            System.out.print(imp+", ");
        }
        System.out.println();
    }

    @Override
    public void asigna(int p, Integer x, Integer[] l) {
    if (p<l.length&&p>=0){
        if (x !=null){
            l[p]=x;
            System.out.println("Se ha asignado el valor en el indice "+p);
        }else{
            throw new RuntimeException("El tipo de dato ingreado no es valido");
        }
    }else {
        throw new RuntimeException("El indice no esta contenido en el arreglo");
    }
    }
}
