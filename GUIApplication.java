
import javax.swing.JButton;
import javax.swing.JFrame;

public class GUIApplication {
	
        private static long count = 0l;
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		//EDD event
	        //IoC
		//swing
		//gui
		//dom
		
		JFrame window = new JFrame("My First GUI!!!");
		window.setSize(500,500);
		window.show();

		JButton btn = new JButton("Like this!");
		window.getContentPane().add(btn);
		
		btn.addActionListener(e -> {
			System.out.println("You've clicked!");
			count++; 
			if(count > 0 && count < 1000) {
			    btn.setText(String.format(count+" Likes"));
			}else if (count >= 1000 && count < 1000000) {
				btn.setText(String.format("%.1fk Likes", (float)count / 1000));
			}else if (count >= 1000000 && count < 1000000000) {
				btn.setText(String.format("%.1fM Likes", (float)count / 1000000));
			}
               });
	
        }
}
