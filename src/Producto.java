import java.util.ArrayList;

public class Producto {

    private int nombre;
    private int peso;

    Producto(int nombre, int peso){
        this.nombre=nombre;
        this.peso=peso;
    }

    public int getNombre() {
        return nombre;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public void setNombre(int nombre) {
        this.nombre = nombre;
    }

    public static Producto seleccionarMayor(ArrayList<Producto> productos){

        Producto candidato = productos.get(0);

        for(int i=1;i< productos.size();i++){
            if(productos.get(i).peso > candidato.getPeso())
                candidato= productos.get(i);
        }

        return candidato;
    }
}
