class Main {
public static void main( String args[] )
   {
      
       System.out.println("#Enter Name");
       String sn=BIO.getString();//student number input
       String result = "";
       
        while  (!(sn.equals("END"))) {
          System.out.println("#Enter Coursework Mark");
          
            int cw=BIO.getInt();//courswork mark
            System.out.println("#Enter Exam Mark");
            int ex=BIO.getInt();//exam mark
            double Mark = ((double)(ex + cw))/2;//overall mark
            if (Mark >=40){ 
                if ((cw <30) || (ex <30)) {
            
            
                    result=" Fail [Threshold]";
            
                }
                else {result=" Pass";}
            }
            else {result=" Fail";}
            
    
       System.out.println( sn + " [" + cw + "," + ex + "]  " + Mark + result);
       //above statement prints the final mark
       sn=BIO.getString();//repeated for loop
}
 }
}
    
   
        
        
       
      
    
     
       
       
  
       
       
       
       
       
       


  

    
  
        
   
    
    


