import javax.swing.JOptionPane;

public class ExercicioNum09_maior {
    
    public static void main(String[] args){

        int matA[][] = new int[4][4];

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
        for (int j = 0; j<matA.length; j++){
            for (int i = 0; i<matA.length; i++){
        
               if (matA[j][i]>a){

                a = matA[j][i];
                b = j;
                c = i;
               }
        
         }
        }

        JOptionPane.showMessageDialog(null, "Maior número da matriz é "+a+"\nPosição["+b+"]["+c+"]");

    }
}