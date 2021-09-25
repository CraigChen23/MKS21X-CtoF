//What should the functions have as parameter(s) ?  They should have celsius as a parameter for celsius to fahrenheit function and paramter for fahrenheit for fahrenheit to celsius function
//What type should they be? They should be doubles
//What should the functions return? The functions should return the converted value

public class tempconvertor {
    public static void main(String[] args){
        System.out.println(cels2fahren(3.0));
        System.out.println(fahren2cels(3.0));
    }


    public static double fahren2cels(double fahrenheit){
        double celsius  = ((fahrenheit-32)*5)/9;
        return (celsius);
    }

    public static double cels2fahren(double celsius){
        double fahrenheit = (celsius * 1.8) + 32;
        return (fahrenheit);
    }
}