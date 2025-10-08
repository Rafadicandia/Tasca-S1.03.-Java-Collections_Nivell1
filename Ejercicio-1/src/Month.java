public class Month {

    String name;

    Month(String name){
        if (name==(null)){
            throw new IllegalArgumentException("The name of the product can't be null");
        }

        if (name.isBlank()){
            throw new IllegalArgumentException("The name of the month can't be empty");
        }
        this.name=name;
    }



}
