package Punto2;

import org.w3c.dom.ls.LSOutput;

import java.time.LocalDateTime;

public class tareaMain {
    public static void main(String[] args){
        tareaDesarrollo tareaDes = new tareaDesarrollo(12, 20, "Luis");
        tareaPrueba tareaTest = new tareaPrueba(2, 15, "Sebastian");
        tareaDocumentacion tareaDoc = new tareaDocumentacion(22, 26, "Juan");

        System.out.println("----INFORME----");

        tareaDes.generarInforme();

        tareaTest.generarInforme();

        tareaDoc.generarInforme();


    }


}
