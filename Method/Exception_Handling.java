
package Method;


public class Exception_Handling {
    public static void main(String[] args) {
        int a,b,sum;
        
        try
        {a =20;
        b= 0;
        sum = a/b;//ei line theke muloto exception suru hobe
            System.out.println("the result is: "+sum);//so ei line r kaj korbe na
        }
        catch( Exception e){//ei line thaa recive korbe and 'e' variable er modde rakbe 
        
            System.out.println("The result is: "+e);//print korbe
        }
       
        //System.out.println("xxx"); jodi catct e kunu vul na dei tahole ei line ei kaj korbe
        finally{
            System.out.println("output");//ortat jodi catch e vul ditalm tahole ei line must kaj koro.ei khane ja dibo tha kaj korbei
                }
    }
}
