public interface Base {
    public void insertar (Integer x,Integer[] l);
    public void localizar (int x,Integer[]l);
    public Integer recuperar (int p,Integer[]l);
    public void suprimir (int p,Integer[] l);
    public Integer siguiente (int p,Integer[]l);
    public Integer anterior (int p, Integer[]l);
    public void limpiar (Integer[]l);
    public Integer primero (Integer[]l);
    public void imprime(Integer[]l);
    public void asigna(int p, Integer x,Integer[]l);
}