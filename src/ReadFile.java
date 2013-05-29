import java.io.*;


/**
 * Created with IntelliJ IDEA.
 * User: xps
 * Date: 5/28/13
 * Time: 12:54 PM
 * To change this template use File | Settings | File Templates.
 */
public class ReadFile {
    String strFileName;

    public ReadFile (String strName){
        strFileName=strName;
    }

    public BufferedReader GetBuffer(){
        BufferedReader br = null;

        try {
            System.out.println("Enter something here : ");

            BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
            String s = bufferRead.readLine();

            br = new BufferedReader(new FileReader(s+".txt"));

        }catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null)br.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        return br;
    }


    public static void main(String[] args) {

        BufferedReader br = null;

        try {
            System.out.println("Enter something here : ");

            BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
            String s = bufferRead.readLine();

            System.out.println(s);


            String sCurrentLine;


            br = new BufferedReader(new FileReader(s+".txt"));

            while ((sCurrentLine = br.readLine()) != null) {
                System.out.println(sCurrentLine);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null)br.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }

    }
}
