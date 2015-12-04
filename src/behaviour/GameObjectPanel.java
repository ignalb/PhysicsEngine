package behaviour;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GameObjectPanel extends JPanel {

	private static final long serialVersionUID = -4373294727625702474L;
	
	GameObject obj;
	
	public GameObjectPanel(GameObject obj){
		this.obj = obj;
		setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
		
		JPanel transform = new JPanel();
		JPanel rotation = new JPanel();
		JPanel scale = new JPanel();
		Dimension numberFieldSize = new Dimension(50, 25);
		
		transform.setBorder(BorderFactory.createTitledBorder("Transform"));
		rotation.setBorder(BorderFactory.createTitledBorder("Rotation"));
		scale.setBorder(BorderFactory.createTitledBorder("Scale"));
		
		// Transform //
		JTextField transformX = new JTextField(String.valueOf(obj.getXPos()));
		JTextField transformY = new JTextField(String.valueOf(obj.getYPos()));
		transformX.setPreferredSize(numberFieldSize);
		transformY.setPreferredSize(numberFieldSize);
		transform.add(new JLabel("x"));
		transform.add(transformX);
		transform.add(new JLabel("y"));
		transform.add(transformY);
		
		// Rotation //
		JTextField rotationT = new JTextField(String.valueOf(obj.getRotation()));
		rotationT.setPreferredSize(numberFieldSize);
		rotation.add(new JLabel("T"));
		rotation.add(rotationT);
		
		// Scale //
		JTextField scaleX = new JTextField(String.valueOf(obj.getXScale()));
		JTextField scaleY = new JTextField(String.valueOf(obj.getYScale()));
		scaleX.setPreferredSize(numberFieldSize);
		scaleY.setPreferredSize(numberFieldSize);
		scale.add(new JLabel("x"));
		scale.add(scaleX);
		scale.add(new JLabel("y"));
		scale.add(scaleY);
		
		// JTextField ActionEvents //
		transformX.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				obj.setXPos(Double.parseDouble(transformX.getText()));
			}
		});
		transformY.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				obj.setYPos(Double.parseDouble(transformY.getText()));
			}
		});
		rotationT.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				obj.setRotation(Double.parseDouble(rotationT.getText()));
			}
		});
		scaleX.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				obj.setXScale(Double.parseDouble(scaleX.getText()));
			}
		});
		scaleY.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				obj.setYScale(Double.parseDouble(scaleY.getText()));
			}
		});
		
		
		add(transform);
		add(rotation);
		add(scale);
	}

}
