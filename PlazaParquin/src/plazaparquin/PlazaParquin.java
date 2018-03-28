/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plazaparquin;

import java.util.ArrayList;

/**
 *
 * @author Soib1a13
 */
public class PlazaParquin {

    private static final int TAMANO = 15;
    static ArrayList<PlazaDisponible> registresPlazas;
    public static  int  numplazasDisponibles=0;

    public PlazaParquin() {
        this.registresPlazas = new ArrayList<>();
    }

    public static boolean esPle() {
        return (registresPlazas.size() <= TAMANO);

    }

    public static void entrada(PlazaDisponible reg) {
        if (esPle()) {

            //registresPlazas.remove(0);
            registresPlazas.add(reg);
            numplazasDisponibles += 1;
        }
       

    }

    public static void sortida(PlazaDisponible matricula) {
        for (int i = 0; i < registresPlazas.size(); i++) {
            if (matricula.getMatricula().equals(registresPlazas.get(i).getMatricula())) {
                registresPlazas.remove(i);
                numplazasDisponibles= numplazasDisponibles - 1;
            }

        }

    }

    @Override
    public String toString() {
        if (!esPle()) {
            return " No tenemos plazas de Parquin disponibles{" + '}';
        }
        else{
              return "hay " +  numplazasDisponibles + " disponible" ;
        }
      

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        PlazaParquin pk;
        pk = new PlazaParquin();

        pk.entrada(new PlazaDisponible("PM9061B"));
        pk.entrada(new PlazaDisponible("PM9062B"));
        pk.entrada(new PlazaDisponible("PM9063B"));
        pk.entrada(new PlazaDisponible("PM9064B"));
        pk.entrada(new PlazaDisponible("PM9065B"));
        pk.entrada(new PlazaDisponible("PM9066B"));
        pk.entrada(new PlazaDisponible("PM9067B"));
        pk.entrada(new PlazaDisponible("PM9068B"));
        pk.entrada(new PlazaDisponible("PM9069B"));
        pk.entrada(new PlazaDisponible("PM9010B"));
        pk.entrada(new PlazaDisponible("PM9011B"));
        pk.entrada(new PlazaDisponible("PM9012B"));
        pk.entrada(new PlazaDisponible("PM9013B"));
        pk.entrada(new PlazaDisponible("PM9014B"));
        pk.entrada(new PlazaDisponible("PM9015B"));
        pk.entrada(new PlazaDisponible("PM9016B"));
        pk.entrada(new PlazaDisponible("PM9017B"));

        for (int i = 0; i < registresPlazas.size(); i++) {
            System.out.println(i + " : " + registresPlazas.get(i).getMatricula());
   
        }
   
        pk.sortida(new PlazaDisponible("PM9062B"));
  
        System.out.println(pk.toString());

        //pk.entrada(new PlazaDisponible("PM9017B"));
        //System.out.println(pk.toString());
    }

}
