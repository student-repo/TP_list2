package pt.trainings.maven;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){
//        System.out.println( "Hello World!" );
        Greetings greetings = new Greetings();

        System.out.println(greetings.sayHello(args.length>0?args[0]:null));
    }
}
