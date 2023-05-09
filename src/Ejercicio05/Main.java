package Ejercicio05;

public class Main {
    public static void main(String[] args) {
        IColeccionDeCosasQuePesan ColeccionDeCosas = new CajaCuantica();
        ColeccionDeCosas.add(new Producto(8,"patata",89));
        ColeccionDeCosas.add(new Clip(7));
        System.out.println(ColeccionDeCosas.damePeso());

        IColeccionDeCosasQuePesan Coleccion2 = new Caja();
        Coleccion2.add(new Producto(8,"patata",89));
        Coleccion2.add(new Clip(7));

        ColeccionDeCosas.add(Coleccion2);
        ColeccionDeCosas.damePeso();
    }
}
