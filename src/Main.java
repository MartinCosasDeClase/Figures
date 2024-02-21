import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Dimensió dimensio = new Dimensió();
        dimensio.setAlt(10);
        dimensio.setAmple(5);
        dimensio.setProfunditat(3);
        Superheroi superheroi = new Superheroi("Superman");
        Superheroi superheroi2 = new Superheroi("Batman");
        Superheroi superheroi3 = new Superheroi("Spiderman");
        superheroi.setDescripcio("El millor superheroi de tots els temps");
        superheroi.setCapa(true);
        Figura figura = new Figura("001", 100, dimensio, superheroi);
        Figura figura2 = new Figura("002", 200, dimensio, superheroi2);
        Figura figura3 = new Figura("003", 300, dimensio, superheroi3);
        figura2.pujarPreu(50);

        Coleccio coleccio = new Coleccio("SuperHerois", new ArrayList<>());
        coleccio.afegirFigura(figura);
        coleccio.afegirFigura(figura2);
        coleccio.afegirFigura(figura3);
        System.out.println(coleccio.toString());
        System.out.println("Superheroi amb capa: " + coleccio.ambCapa());
        System.out.println("Figura més valuosa: " + coleccio.mesValuos().toString());
        System.out.println("Valor de la col·lecció: " + coleccio.getValorColeccio());

    }
}
