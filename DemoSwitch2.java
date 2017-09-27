public class DemoSwitch2{
    public static void main(String[] args){
           int grade= 85;
            switch (grade){
                
            case 100:
                System.out.println(" Excellent");
                break;
            case 90:
                System.out.println(" Good Job!");
                break;
            case 80:
                System.out.println(" Good Harder!");
                break;
            case 85:
                System.out.println(" Good");
                break;
           default:
                System.out.println(" Soory you failed");
            }
    }
}