package com.company;

import clases.CapacidadEndedudamiento;
import clases.Mensajes;
import com.sun.javafx.image.IntPixelSetter;
import javafx.scene.input.KeyCode;

import java.util.Scanner;

public class Main {
    //Recuerda que aca empieza todo
    public static void main(String[] args) {
        //Con este objeto de la clase Scanner puedes capturar informacion por consola cada ves que lo uses
        // recuerda cerrar el flujo de consulta cada ves lo uses sobre para que los uses in.close()
        Scanner in = new Scanner(System.in);
        Mensajes mensaje = new Mensajes();
        int ingMesuales = 0;
        int ingFijos = 0;
        int gastosVariables = 0;
        String valorIngresado = null;

        String entrada = "SI";
        while (entrada.equals("SI")) {
        //Ingresos mensuales
        while (entrada.equals("SI")) {
            System.out.println(mensaje.mensajeIngMensuales);
            valorIngresado = in.nextLine();
            if (isNumeric(valorIngresado) == true) {
                ingMesuales = Integer.parseInt(valorIngresado);
                break;
            } else {
                System.out.println(mensaje.mensajeError);
            }
        }

            //Gastos Fijos
            while (entrada.equals("SI")) {
                System.out.println(mensaje.mensajeGastosFijos);
                valorIngresado = in.nextLine();
                if (isNumeric(valorIngresado) == true) {
                    ingFijos = Integer.parseInt(valorIngresado);
                    break;
                } else {
                    System.out.println(mensaje.mensajeError);
                }

            }

        //Gastos Variables
        while (entrada.equals("SI")) {
            System.out.println(mensaje.mensajeGastosVariables);
            valorIngresado = in.nextLine();
            if (isNumeric(valorIngresado) == true) {
                gastosVariables = Integer.parseInt(valorIngresado);
                break;
            } else {
                System.out.println(mensaje.mensajeError);
            }

        }
        //Se calcula la capacidad de endeudamiento
        CapacidadEndedudamiento capacidad =new CapacidadEndedudamiento(ingMesuales,ingFijos,gastosVariables);
        System.out.println(mensaje.mensajeResultado + " " + capacidad.getCapacidadEndeudamiento());

        //Se valida si desea ingresar otra operacion

            System.out.println(mensaje.mensajeContinuar);
            valorIngresado = in.nextLine();
            if (valorIngresado.equalsIgnoreCase("NO")) {
                entrada = "NO";
            } else {
                entrada = "SI";
            }

        }

        }

    public static boolean isNumeric(String value) {
        // implementa un bloque try catch aca
        try {
            Double.parseDouble(value);
            return true;
        } catch(NumberFormatException e){
            return false;
        }

    }
}