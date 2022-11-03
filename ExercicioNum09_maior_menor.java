import javax.swing.JOptionPane;
public class ExercicioNum09_maior_menor {

 public static void main(String[] args) {
    
 

        int matA[][] = new int[10][10];

    for (int j = 0; j < matA.length; j++){
        for (int i = 0; i < matA.length; i++){

            matA[i][j] = (int)Math.round(Math.random() * 9); 

            }
        }

        for (int j = 0; j<matA.length; j++){
            for (int i = 0; i<matA.length; i++){
        
                JOptionPane.showMessageDialog(null, "Matriz A["+j+"]["+i+"] = "+matA[j][i]);
        
         }
        }

        int a = -1;
        int b = 0;
        int c = 0;
   
            for (int i = 0; i<matA.length; i++){
        
               if (matA[5][i]>a){

                a = matA[5][i];
                b = 5;
                c = i;
               }
        
         }
        

        JOptionPane.showMessageDialog(null, "Maior número da linha 5 = "+a+"\nPosição["+b+"]["+c+"]");


        int d = 10;
        int e = 0;
        int f = 0;
        for (int j = 0; j<matA.length; j++){
        
               if (matA[j][7]<d){

                d = matA[j][7];
                e = j;
                f = 7;
               }
        
         }
        

        JOptionPane.showMessageDialog(null, "Menor número da coluna 7 é "+d+"\nPosição["+e+"]["+f+"]");

    }
    }