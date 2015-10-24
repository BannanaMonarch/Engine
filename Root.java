import java.awt.Graphics2D;


public class Root extends Engine{
	private static final long serialVersionUID = 1L;

	@Override
	public void first(Graphics2D g){
		setDelay(4);
		System.out.println(convertToShade("My Name Is Johnny"));
	}
	
	@Override
	public void loop(Graphics2D g){
		g.drawOval(10,10,10,10);
	}
	
	@Override
	public void delay(Graphics2D g){}

	@Override
	public void debug(Graphics2D g) {}

}
