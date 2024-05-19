/**
 *
 * @author Khaled Jalal
 */
public class While_Loop {
    public static void main(String[] args) {
        float currentMoney = 10000.0f;
        float futureMoney = currentMoney*2;
        int years = 0 ;
        
        while( currentMoney < futureMoney )
        {
            currentMoney = (float) (currentMoney + (currentMoney*0.05));
            years++;
        }
        System.out.println("Years : "+years);
        
    }
}
