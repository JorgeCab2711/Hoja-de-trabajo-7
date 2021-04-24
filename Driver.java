import java.io.File;
import java.io.FileNotFoundException;
import java.util.PriorityQueue;
import java.util.Scanner;

/*
Universidad del Valle de Guatemala
Jorge Caballeros
20009
Hoja de trabajo 7, Traductor
*/
public class Driver{
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("Pacientes.txt");
        Scanner arcPacientes = new Scanner(file);
        Scanner s = new Scanner(System.in);

        //Fin instancias

        boolean enProceso = true;
        while(enProceso){
            try{
                //Se le pide los datos al usuario
                System.out.println("-> Ingrese la implementacion: ");
                System.out.println("[1] VectorHeap");
                System.out.println("[2] Priority Queue");
                System.out.println("[3] Salir");
                
                //Se le pide al usuario una opcion
                int opcion = s.nextInt();
                while(opcion !=3){
                    
                    //Se ingreso VectorHeap
                    if(opcion == 1){
                        System.out.println("Lista de pacientes ordenada: \n");
                        VectorHeap<Paciente> vectorHeap = new VectorHeap<Paciente>();
                        //Mientras haya una linea en el archivo se repetira el ciclo
                        while(arcPacientes.hasNextLine()){
                            String linea = arcPacientes.nextLine();
                            String [] proxLineaMutilada = linea.split(",");
                            //Nombre, Descripcion, Código paciente
                            Paciente paciente = new Paciente(proxLineaMutilada[0].strip(),proxLineaMutilada[1].strip(),proxLineaMutilada[2].strip());
                            paciente.convertirCodigo(paciente.getCod());
                            //Se ingresa el paciente al vector
                            vectorHeap.add(paciente);
                        }
                        
                        //si el archivo esta vacío parara el proceso
                        while(!vectorHeap.isEmpty()){
                            System.out.println(vectorHeap.remove());
                        }
                        System.out.println("\n\n--------------------------Proceso finalizado---------------------------------");
                        break;
                    }

                    //Se ingreso Priority queue
                    else if(opcion == 2){
                        
                        PriorityQueue pQueue = new PriorityQueue<>();
                        while(arcPacientes.hasNextLine()){
                            String linea = arcPacientes.nextLine();
                            String [] proxLineaMutilada = linea.split(",");
                            //Nombre, Descripcion, Código paciente
                            Paciente paciente = new Paciente(proxLineaMutilada[0].strip(),proxLineaMutilada[1].strip(),proxLineaMutilada[2].strip());
                            paciente.convertirCodigo(paciente.getCod());
                            //Se ingresa el paciente al vector

                            pQueue.add(paciente);
                        }
                        
                        
                        while(!pQueue.isEmpty()){
                            System.out.println("Lista de pacientes ordenada: \n");
                            System.out.println(pQueue.remove());
                        }
                        System.out.println("\n\n--------------------------Proceso finalizado---------------------------------");
                        break;
                    }
                }
            }
            catch(Exception e){
                System.out.println("Ingrese números");
                e.printStackTrace();
            }
            enProceso = false;
        }
    }
}