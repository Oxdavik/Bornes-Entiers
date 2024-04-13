public class TestEntierBorne {
    public static void main(String[] args){
        try{
            int ebX = (int)((Math.random()*150+150)-150);
            System.out.println(ebX);
            EntierBorne b = new EntierBorne(ebX);
            int ebY = (int)(Math.random()*2);
            System.out.println(ebY);
            EntierBorne c = new EntierBorne(ebY);
            EntierBorne x = c.somme(b);
            System.out.println("somme: "+x);
            EntierBorne d = b.divPar(c);
            System.out.println("division: "+d);}
        catch(HorsBorneException e){
                System.out.println(e.toString());
            }
       /*  catch(Exception e){ Si on met le catch(Exception e) avant divisionzero , le DivisionParZero n'est jamais atteint puisque Exception est la classe mère de DivisionParZero
                System.out.println(e.toString());
            }*/
        catch (DivisionParZero e){
            System.out.println(e.toString());
        }

        
    }
    
}
