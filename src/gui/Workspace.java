package gui;

import javax.swing.DefaultListModel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;

import behaviour.Element;

public class Workspace extends JSplitPane {

	private static final long serialVersionUID = 1470734412884740795L;
	
	static InfoPanel infoPanel = new InfoPanel();
	static ElementList list = new ElementList(new DefaultListModel<Element>(), infoPanel);
	static JScrollPane listPane = new JScrollPane(list);
	static JScrollPane infoPane = new JScrollPane(infoPanel);
	
	public Workspace(){
		super(JSplitPane.HORIZONTAL_SPLIT, listPane, infoPane);
		setDividerSize(3);
		
	}
	
}