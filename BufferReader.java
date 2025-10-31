 import java.io.BufferedReader;
 import java.io.InputStreamReader;
 import java.io.IOException;
 public class BufferReader {
 public static void main(String[] args) throws IOException {
 // Create BufferedReader object
 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 System.out.print("Enter your name: ");
 String name = br.readLine();   // reading a line
 System.out.print("Enter your age: ");
 int age = Integer.parseInt(br.readLine()); // converting string to int
 System.out.println("Hello " + name + ", you are " + age + " years old.");
 br.close();
 }
 }
 79
