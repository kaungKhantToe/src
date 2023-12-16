package FinalsShortQuestions;
public class Baby extends FamilyMember{
    private int age;
    
    @Override
    public String toString() {
        return "Baby [age=" + age + "]";
    }

    public Baby(int age) {
        this.age = age;
    }
    
    public void EatingMethod(int age){
        if (age >3 ){
            System.out.println("it eats with its " + eat());
        }else {
            System.out.println("it eats with its hands");
        }
    }
    
}