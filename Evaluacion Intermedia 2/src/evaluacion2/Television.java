package evaluacion2;

public class Television extends Electrodomestico{
	  
    //Constantes
  
    /**
     * Resolucion por defecto
     */
    private final static int RESOLUCION_DEF=20;
  
    private int resolucion;
  
    private boolean sintonizadorTDT;
  
    public double precioFinal(){
       
        double valor=super.precioFinal();

        if (resolucion>40){
            valor+=precioBase *1.3;
        }
        if (sintonizadorTDT){
            valor+=50;
        }
  
        return valor;
    }
  
    //Constructor
  
    /**
     * Constructor por defecto
     */
    public Television(){
        this(PRECIO_BASE_DEF, PESO_DEF, CONSUMO_ENERGETICO_DEF, COLOR_DEF, RESOLUCION_DEF, false);
    }
  
    /**
     * Constructor con 2 parametros
     * @param precioBase
     * @param peso
     */
    public Television(double precioBase, double peso){
        this(precioBase, peso, CONSUMO_ENERGETICO_DEF, COLOR_DEF, RESOLUCION_DEF, false);
    }
  
    /**
     * Contructor con 6 parametros
     * @param precioBase
     * @param peso
     * @param consumoEnergetico
     * @param color
     * @param resolucion
     * @param sintonizadorTDT
     */
    public Television(double precioBase, double peso, char consumoEnergetico, String color, int resolucion, boolean sintonizadorTDT){
        super(precioBase, peso, consumoEnergetico, color);
        this.resolucion=resolucion;
        this.sintonizadorTDT=sintonizadorTDT;
    }
}