package Principal;

public class Principal {

    public static void main(String[] args) {

        Coche coche_01 = new Coche("Kia","CYA674","Juan Calvo",2,"5","Negro");
        Coche coche_02 = new Coche("Renault","KTB864","Lady",3,"7","Blanco");
        Moto moto_01 = new Moto("Yamaha","HIS64","Carlos Florez","Z8","MEDIO","Electrica");

        System.out.println("La placa del carro es: "+coche_01.getPlaca());
    }
}
