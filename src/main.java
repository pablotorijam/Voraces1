import java.util.*;
public class main {

    public static void distribuyeCarga(ArrayList<Producto> productos,
                         ArrayList<Producto> n1,
                         ArrayList<Producto> n2,
                         ArrayList<Producto> n3) {

        int peso1 = 0, peso2 = 0, peso3 = 0;
        Producto candidato;

        while (!productos.isEmpty()) {
            candidato = Producto.seleccionarMayor(productos);
            productos.remove(candidato);

            if (peso1 <= peso2) {
                if (peso1 <= peso3) {
                    n1.add(candidato);
                    peso1 = peso1 + candidato.getPeso();
                }
                else {
                    n3.add(candidato);
                    peso3 = peso3 + candidato.getPeso();
                }
            }
            else if (peso2 <= peso3) {
                n2.add(candidato);
                peso2 = peso2 + candidato.getPeso();
            }
            else {
                n3.add(candidato);
                peso3 = peso3 + candidato.getPeso();
            }
        }
    }

    public static void main(String[] args) {

        ArrayList<Producto> n1 = new ArrayList<>();
        ArrayList<Producto> n2 = new ArrayList<>();
        ArrayList<Producto> n3 = new ArrayList<>();
        ArrayList<Producto> productos = new ArrayList<>();

        Producto p1 = new Producto(1,1);
        Producto p2 = new Producto(2,2);
        Producto p3 = new Producto(3,3);
        Producto p4 = new Producto(4,4);
        Producto p5 = new Producto(5,5);

        productos.add(p1);
        productos.add(p2);
        productos.add(p3);
        productos.add(p4);
        productos.add(p5);

        distribuyeCarga(productos,n1,n2,n3);

        int s1=0,s2=0,s3=0;

        for(int i=0;i< n1.size();i++){
            s1 = s1 + n1.get(i).getPeso();
        }
        for(int i=0;i< n2.size();i++){
            s2 = s2 + n2.get(i).getPeso();
        }
        for(int i=0;i< n3.size();i++){
            s3 = s3 + n3.get(i).getPeso();
        }

        System.out.println(s1 +","+ s2 +","+ s3);
    }

}
