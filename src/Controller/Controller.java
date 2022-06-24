package Controller;


import Model.Phone;

//ToDo Maak de telefoon af die door drie States kan lopen. Hiervoor heeft de telefoon een knop : doPress(). Implementeer
//ToDo deze.
public class Controller {
    public static void main(String[] args) {
        Phone phone = new Phone();

        phone.doPress();

        System.out.println("--------------------------------------------");

        phone.doPress();

        System.out.println("--------------------------------------------");

        phone.doPress();
    }
}
