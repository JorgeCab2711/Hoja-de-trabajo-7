public class Paciente implements Comparable<Paciente> {

    private String nombre;
    private String descripcion;
    private String codigo;
    private int numCodigo;

    //Builder
    public Paciente (String inpuNombre,String inpuDesc,String inpCod ){
        this.nombre = inpuNombre;
        this.descripcion = inpuDesc;
        this.codigo = inpCod;
    }

    //Getters
    //Nombre
    public String getNombre(){
        return this.nombre;
    }
    //Descripcion
    public String getDesc(){
        return this.descripcion;
    }
    //codigo string
    public String getCod(){
        return this.codigo;
    }
    //Codigo int
    public int getNumCod(){
        return this.numCodigo;
    }

    //--------------------------------------------Métodos------------------------------------------------
    //Convertir la letra a un número representativo, regresa un entero que representa a la letra
    public void convertirCodigo(String prioridad){
        int intCod = 0;
        if(prioridad.equals("A")){
            intCod = 1;
        }
        else if(prioridad.equals("B")){
            intCod = 2;
        }
        else if(prioridad.equals("C")){
            intCod = 3;
        }
        else if(prioridad.equals("D")){
            intCod = 4;
        }
        else if(prioridad.equals("E")){
            intCod = 5;
        }
        this.numCodigo = intCod;
    }


    @Override
    public int compareTo(Paciente inCodPaciente) {
        // TODO Auto-generated method stub
        return (this.numCodigo - inCodPaciente.getNumCod());
    }

    @Override
    public String toString(){
        return "Nombre paciente: "+getNombre()+" Descripcion: "+getDesc()+" Prioridad: "+getCod();
    }
    
}
