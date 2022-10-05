import java.io.*;

public class FileArray {
    public void writeArray(String file, int[] array){
        try{
            FileOutputStream fos = new FileOutputStream(file);
            DataOutputStream dos = new DataOutputStream(fos);
            for(int i = 0; i < array.length; i++){
                dos.writeInt(array[i]);
            }
            dos.close();
        }
        catch(IOException ioe){
            System.out.println("IOException: " + ioe);
        }
        
    }
    
    public void readArray(String file, int[] array){
        try{
            FileInputStream fis = new FileInputStream(file);
            DataInputStream dis = new DataInputStream(fis);
            for(int i = 0;i < array.length; i++){
                array[i] = dis.readInt();
                System.out.println("[" + i + "]= " + array[i]);
            }
            dis.close();
        }
        catch(IOException ioe){
            System.out.println("IOException: " + ioe);
        }
        
    }
}
