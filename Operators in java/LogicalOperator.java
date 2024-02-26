public class LogicalOperator {
    
    public static void main(String args[]){

        // && : dono condition ke true hone par hi true return karega otherwise false deta rahega

        System.out.println( (3>1) && (5>0) );
        System.out.println( (4<5) && (4<0) );

        // Logic OR(||) : Ek bhi condition ke true hone par ye true return karta hai, false sirf tab return karega jab dono conditions false hogi varna ye hamesha true hi dega

        System.out.println( (10>4) || (1>3) );
        System.out.println( (3>5) || (1>4) );

        // Logical NOT(!)
    }
}
