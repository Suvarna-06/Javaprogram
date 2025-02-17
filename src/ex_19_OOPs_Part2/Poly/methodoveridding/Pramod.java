package ex_19_OOPs_Part2.Poly.methodoveridding;

public class Pramod extends Father{

    @Override
    void home(){
        System.out.println("Pramod- 3BHK");
    }
}
// Override means same name function is present in your son and
// same name function is present in your father, means i also can have same name as home as father with the "Override" annotation.