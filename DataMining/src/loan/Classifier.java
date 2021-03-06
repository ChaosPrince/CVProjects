
package loan;


import java.util.HashMap;

/**
 *
 * @author moh
 */
public class Classifier {
    
    
    FeatureProbability F = new FeatureProbability();
    
    
    public double Fetch_probablty_with_Yes(String Feature , String Element)
    {
        HashMap<String,Double> FetHashMap = new HashMap<>();
       FetHashMap = F.getProbabilityWithYes(Feature);
       
      // System.out.print(FetHashMap);
       
        double value ;
        try {
             value = FetHashMap.get(Element);
        } catch (Exception e) {
            value = 1;
        }
      // double value = FetHashMap.get(Element);
       
        
        return value;
    }
    
     public double Fetch_probablty_with_No(String Feature , String Element)
    {
        HashMap<String,Double> FetHashMap = new HashMap<>();
       FetHashMap= F.getProbabilityWithnNo(Feature);
       
      // System.out.print(FetHashMap);
       
      // double value = FetHashMap.get(Element);
        double value ;
        try {
             value = FetHashMap.get(Element);
        } catch (Exception e) {
            value = 1;
        }
        
        return value;
    }
    
    public double Naive_Biase_Classifier(double Feature1,double Feature2,double Feature3,double Feature4,double Feature5,double classLable ){
     
        
        return (Feature1*Feature2*Feature3*Feature4*Feature5*classLable);
        
    } 
    
    public String predict(double yes , double no){
        
        if(yes>no)
        {
        return "yes";
        }
        else
        {
            return "no";
        }
        
    }
    
    
    
    
    
}
