import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
//instanciamos cada objeto mes
        Month enero= new Month("enero");
        Month febrero= new Month("febrero");
        Month marzo= new Month("marzo");
        Month abril= new Month("abril");
        Month mayo= new Month("mayo");
        Month junio= new Month("junio");
        Month julio= new Month("julio");
        Month setiembre= new Month("setiembre");
        Month agosto= new Month("agosto");
        Month octubre= new Month("octubre");
        Month noviembre= new Month("noviembre");
        Month diciembre= new Month("diciembre");
//creamos array de meses

        ArrayList <Month> meses = new ArrayList<>();

//agregamos cada mes al array
        meses.add(enero);
        meses.add(febrero);
        meses.add(marzo);
        meses.add(abril);
        meses.add(mayo);
        meses.add(junio);
        meses.add(julio);
        meses.add(setiembre);
        meses.add(octubre);
        meses.add(noviembre);
        meses.add(diciembre);

        //imprimimos el listado sin agosto
        System.out.println("--Año sin Agosto--");
        System.out.println();

        for (Month m: meses){
            System.out.println(m.name);
        }
        System.out.println();

//agregamos agosto al listado en la posición correcta
        meses.add(7, agosto);

        System.out.println("--Año con agosto--");
        System.out.println();
//volvemos a imprimir el listado con el mes de agosto incluido
        for (Month m: meses){
            System.out.println(m.name);
        }

    }

}
