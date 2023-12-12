package LearnTheBasics;

public class Q3IfElse {
    public static void main(String[] args) {
      Logic logic=new Logic();
    String result=  logic.compareIfElse(3,5);
        System.out.println(result);

    }

}
class Logic{
    public  String compareIfElse(int a, int b) {
        if(a>b){
            return   a+" is greater than "+ b;
        }else if(a<b){
            return b+" is greater than "+ a;
        }else{
            return "equal";
        }
    }
}
