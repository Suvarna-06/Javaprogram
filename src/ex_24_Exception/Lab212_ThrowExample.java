package ex_24_Exception;

public class Lab212_ThrowExample {

    static void validate_age(int age){
        if(age<18){
            try {
                throw  new Exception("Age can't be < 18");
            }
            catch (Exception e){
                throw  new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) {
        validate_age(17);
    }
}

