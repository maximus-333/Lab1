import javax.swing.SwingUtilities;


//Доп. функционал - результаты копируются в буфер обмена, для большего удобства


public class start {

	public static void main(String[] args) {
		
		SwingUtilities.invokeLater(new Runnable() 
		{
			public void run()
			{
				new SwingCode();
			}
			
		});

	}
}
