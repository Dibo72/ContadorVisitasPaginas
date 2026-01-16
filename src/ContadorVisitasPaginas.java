import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;
public class ContadorVisitasPaginas {
    public static void main(String[] args) {
        Map<String, Integer> Paginas = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        String visita;
        int j=3;

        while(j==3) {
            //se iguala la variable numvisitas a 0 para que, en caso que no haya sido agregado, ponerle 0
            int numVisitas = 0;
            System.out.println("Introduce la pagina visitada (fin para terminar):");
            visita = sc.nextLine().toLowerCase();
            //si lo introducido por consola es "fin" se acaba el programa, sino cuenta como pagina visitada
            if (visita.equals("fin")) {
                j=0;
            }else{
                    //si la pagina no ha sido visitada aun entonces no se iguala su numero de visitas a la variable numvisitas
                    if (Paginas.get(visita) != null) {
                        //en caso contrario si
                        numVisitas = Paginas.get(visita);
                    }
                    //pase lo que pase se añade 1 visita nueva ya que esa pagina habra sido visitada 1 vez mas, por eso inicializamos numVisita a 0
                    numVisitas++;
                    Paginas.put(visita, numVisitas);
            }
        }
        //patra acabar se muestra la cantidad de paginas con sus visitas
        for (String key : Paginas.keySet()) {
            System.out.println(key + " - " + Paginas.get(key));
        }
        System.out.println("Programa apagado");
    }
}