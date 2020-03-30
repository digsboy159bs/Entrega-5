import javax.swing.JOptionPane;
public class Media
{
   public static void main (String [] args)
   {
      int cont = 0;
      int soma = 0;
      int num;
      do {
       
      
      num = Integer.parseInt(JOptionPane.showInputDialog("Digite numeros :"));
      soma = num + soma;
      cont++;
     
        
      }while(num != 0);
      JOptionPane.showMessageDialog(null,"a media é: " + soma / cont);

   }
}