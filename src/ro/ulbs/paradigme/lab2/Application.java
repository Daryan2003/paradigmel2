package ro.ulbs.paradigme.lab2;

public class Application {
    public static void main (String[] args){
        Form form =new Form();
        System.out.println(form);
        Form coloredForm= new Form("red");
        System.out.println(coloredForm);
    }
}
