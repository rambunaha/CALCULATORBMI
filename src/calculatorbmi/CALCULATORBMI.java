package calculatorbmi;
public class CALCULATORBMI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int beratbadan = 60;
        float tinggibadan =1.66f;
        float CALCULATORBMI=(beratbadan/(tinggibadan*tinggibadan));
        
        System.out.println("BMI ANDA ADALAH?/t:"+CALCULATORBMI);
        double bmi = 0;
        
        if (bmi<18.5){
            System.out.println("BERAT BADAN ANDA KURANG");
        }
        else if (bmi<24.9){
            System.out.println("BERAT BADAN ANDA NORMAL/IDEAL");
        }
        else if (bmi<29.9) {
             System.out.println("BERAT BADAN ANDA LEBIH");
         }
         else{
             System.out.println("OBESITAS");
         }
    }
    private static float beratbadan(float f) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
