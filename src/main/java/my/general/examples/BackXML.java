package my.general.examples;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BackXML {
	public static void main (String [] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("/usr/share/gnome-background-properties/background-template.xml"));
		String in = "";
		String file = "";
		while((in = br.readLine()) != null) {
			in = in.replace("$NAME", args[0]);
			file += in + "\n";
		}
		System.out.println(file);
		br.close();
	}
}
