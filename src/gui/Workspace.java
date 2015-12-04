package gui;

import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;

import behaviour.Element;

public class Workspace extends JSplitPane {

	private static final long serialVersionUID = 1470734412884740795L;
	
	static InfoPanel infoPanel = new InfoPanel();
	static JList<Element> list = new JList<Element>();
	static JScrollPane listPane = new JScrollPane(list);
	static JScrollPane infoPane = new JScrollPane(infoPanel);
	
	public Workspace(){
		super(JSplitPane.HORIZONTAL_SPLIT, listPane, infoPane);
		this.setDividerSize(3);
		
	}
	
}