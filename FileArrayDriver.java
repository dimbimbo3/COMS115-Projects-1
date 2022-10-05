public class FileArrayDriver {
    public static void main(String[] args){
        String file = "FileArray.dat";
        int[] array = {5,4,3,2,1};
        FileArray fa = new FileArray();
        fa.writeArray(file, array);
        fa.readArray(file, array);
    }
}
