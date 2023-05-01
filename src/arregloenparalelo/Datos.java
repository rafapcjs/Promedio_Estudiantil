package arregloenparalelo;
public class Datos {
    
    private String Arreglo1[];
    private int Arreglo2[];
    private int Arreglo3[];
    private char Arreglo4[];
    private int nElementos;
    
    public Datos(int n){
        Arreglo1=new String[n];
        Arreglo2=new int[n];
        Arreglo3=new int[n];
        Arreglo4=new char[n];
        nElementos=0;
    }

    public void setArreglo1(String Nom, int pos) 
    { Arreglo1[pos]= Nom; }

    public String getArreglo1(int pos)            
        {  return Arreglo1[pos];      }
    
    public void setArr2(int Num, int pos) 
    { Arreglo2[pos]= Num; }

    public int getArr2(int pos)            
        {  return Arreglo2[pos];      }
 
    public void setArr3(int Num, int pos) 
    { Arreglo3[pos]= Num; }

    public int getArr3(int pos)            
        {  return Arreglo3[pos];      }   
    
    public void setArr4(char Sex, int pos) 
    { Arreglo4[pos]= Sex; }

    public char getArr4(int pos)            
        {  return Arreglo4[pos];      }
    
    public int nElementos(){
        return nElementos;
    }
    
    public void aggElementos(){
        nElementos++;
    }
        
        public int BuscarNombre(String name)
        {
         int pos = -1;
            for (int i = 0; i < nElementos; i++) {
                if(name.equals(Arreglo1[i]))
                {
                  pos=(i);
                }
            }
            return pos;
        }
}
