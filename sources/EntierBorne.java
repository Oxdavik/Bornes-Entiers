import java.util.Scanner ;


public class EntierBorne{
    public final int MIN = -100 ;
    public final int MAX = 100 ;
    private int n ;

    public EntierBorne(int n) throws HorsBorneException{
        if (n<MIN){
            throw new HorsBorneException( "entier trop petit");
        }
        if (n>MAX){
            throw new HorsBorneException("entier trop grand");
        }
        else {
            this.n = n;
        }
    }
    public int getn(){
        return n;

    }
    public EntierBorne somme(EntierBorne eb) throws HorsBorneException{
        int a = eb.getn() + this.getn() ;
        return new EntierBorne(a)  ;
    }
   
    public EntierBorne divPar(EntierBorne eb) throws HorsBorneException, DivisionParZero{

        if (eb.n == 0){
            throw new DivisionParZero();
        }
        int b = (int)(this.n)/eb.n ;
      /*if (b < MIN || b > MAX) {
            throw new HorsBorneException("Résultat de la division hors des bornes");
        }*/
        return new EntierBorne(b) ; }
    @Override
    public String toString(){
        return ""+this.n ;
    }
    public static void main(String[] args) throws HorsBorneException {
    Scanner s = new Scanner(System.in);
    System.out.println("Entrer un entier : "); 
    int x = s.nextInt();
    s.close();
    EntierBorne b = new EntierBorne(x);
    EntierBorne c = new EntierBorne(x+1);
    EntierBorne r = c.somme(b);
    System.out.println("Somme: "+r);





        
        
    }

}