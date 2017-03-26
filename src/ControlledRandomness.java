import java.util.ArrayList;
import java.util.Random;

import javax.swing.JOptionPane;

public class ControlledRandomness {
	
	
public static void main(String[] args) {
	ControlledRandomness s = new ControlledRandomness();
	s.setup();
}
public void setup(){
	
	ArrayList<Integer> list = new ArrayList<Integer>();
	Random r = new Random();
	String s = JOptionPane.showInputDialog("How many numbers boi?");
	int ans = Integer.parseInt(s);
	for (int i = 0; i < ans; i++) {
		list.add(r.nextInt(9));
		for (int j = 0; j < list.size(); j++) {
			if(j%2 == 0){
			System.out.println(list.get(j));
			}
			else{
				System.err.print(list.get(j));
			}
		}
		System.out.println("");
	}
	
}
}
