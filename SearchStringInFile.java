import java.io.*;

public class SearchStringInFile {
   public static void main(String[] args) {

       String pattern = args[1];
       String fileName = args[2];

       try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
           String line;
           int lineNumber = 0;

          
           while ((line = reader.readLine()) != null) {
               lineNumber++;
               String[] words = line.split("\\s+");
              
               for (String word : words) {
                if (word.equals(pattern)) {
                    System.out.println(word + " " + "Line " + lineNumber);
                    break; 
                }
            }
           }
       } catch (FileNotFoundException e) {
           System.out.println("File not found: " + fileName);
       } catch (IOException e) {
           System.out.println("error");
           e.printStackTrace();
       }
   }
}

//java SearchStringInFile search flaska  /Users/ebba/Desktop/gosta.txt
