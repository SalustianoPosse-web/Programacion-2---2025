package Punto1;
public class MainElectrodomestico {
    public static void main(String[] args){

        Electrodomestico electrodomestico1 = new Electrodomestico("Computadora", 2000);
        Electrodomestico electrodomestico2 = new Electrodomestico("Secaropas", 3000);
        Electrodomestico electrodomestico3 = new Electrodomestico("Heladera", 4000);

        System.out.println("Electrodomesticos");
        System.out.println("1."+electrodomestico1.nombre +" ,Consumo: "+electrodomestico1.consumoElectrodomestico);
        System.out.println("2."+electrodomestico2.nombre +" ,Consumo: "+electrodomestico2.consumoElectrodomestico);
        System.out.println("3."+electrodomestico3.nombre +" ,Consumo: "+electrodomestico3.consumoElectrodomestico);

        double max = Math.max(electrodomestico2.consumoElectrodomestico , electrodomestico3.consumoElectrodomestico);
        double maxTotal = Math.max(electrodomestico1.consumoElectrodomestico,max);

        double min = Math.min(electrodomestico1.consumoElectrodomestico, electrodomestico2.consumoElectrodomestico);
        double minTotal = Math.min(electrodomestico3.consumoElectrodomestico,min);

        System.out.println("Consumo maximo: "+maxTotal);
        System.out.println("Consumo minimo: "+minTotal);



    }
}
