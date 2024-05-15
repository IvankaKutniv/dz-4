package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Ivanka proIvanka = new Ivanka("QA Engineer", 5);
        System.out.printf("profession: %s, experience: %s", proIvanka.getProfession(), proIvanka.getExperience());

    }
}

