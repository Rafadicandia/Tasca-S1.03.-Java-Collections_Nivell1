import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Month january= new Month("January");
        Month February= new Month("February");
        Month March= new Month("March");
        Month April= new Month("April");
        Month May= new Month("May");
        Month June= new Month("June");
        Month July= new Month("July");
        Month September= new Month("September");
        Month August= new Month("August");
        Month October= new Month("October");
        Month November= new Month("November");
        Month December= new Month("December");


        ArrayList <Month> months = new ArrayList<>();


        months.add(january);
        months.add(February);
        months.add(March);
        months.add(April);
        months.add(May);
        months.add(June);
        months.add(July);
        months.add(September);
        months.add(October);
        months.add(November);
        months.add(December);


        System.out.println("--List without August--");
        System.out.println();

        for (Month m: months){
            System.out.println(m.name);
        }
        System.out.println();


        months.add(7, August);

        System.out.println("--Year with August--");
        System.out.println();

        for (Month m: months){
            System.out.println(m.name);
        }

    }

}
