
//se declara como tipos genericos para la clase
public class ParGenerico <T,H> {
    private T clave;
    private H valor;

    //se substituyen en el constructor los tipos de los parametros
    public ParGenerico(T clave, H valor)  {
        this.clave = clave;
        this.valor = valor;
    }

    public static void main (String[]args) {
        
        //Para instanciar hay que 
        ParGenerico <String,Integer> pg1 = new ParGenerico<>("holaa", 12);
    }

}