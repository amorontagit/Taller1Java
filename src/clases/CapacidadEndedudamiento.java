package clases;

public class CapacidadEndedudamiento {
    Integer ingresosTotales;
    Integer gastosFijos;
    Integer gastoVariables;
    final double POR_FIJO = 0.35;
    double capacidadEndeudamiento;

    //Metodos getter and setter para la clase
    public Integer getIngresosTotales() {
        return ingresosTotales;
    }

    public void setIngresosTotales(Integer ingresosTotales) {
        this.ingresosTotales = ingresosTotales;
    }

    public Integer getGastosFijos() {
        return gastosFijos;
    }

    public void setGastosFijos(Integer gastosFijos) {
        this.gastosFijos = gastosFijos;
    }

    public Integer getGastoVaribales() {
        return gastoVariables;
    }

    public void setGastoVaribales(Integer gastoVaribales) {
        this.gastoVariables = gastoVaribales;
    }

    //Construye un metodo que retorne una cadena con las propiedades de la clase
    public CapacidadEndedudamiento(Integer ingresosTotales,Integer gastosFijos,Integer gastoVariables ) {
        this.ingresosTotales = ingresosTotales;
        this.gastosFijos = gastosFijos;
        this.gastoVariables = gastoVariables;
    }

    public String getCapacidadEndeudamiento() {
        // retornar la capacidad de endeudamiento puede ser una cadena con el valor
        capacidadEndeudamiento = (ingresosTotales - gastosFijos - gastoVariables) * POR_FIJO;
        return String.valueOf(capacidadEndeudamiento);
    }
}
