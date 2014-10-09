package cn.edu.buaa.act.bstar.global;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Point;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import cn.edu.buaa.act.bstar.global.CGlobalDef;

public class CDebugConsole extends JFrame {
	private JTextArea debug_context = new JTextArea();
	private JScrollPane scroll_pane = new JScrollPane();
	
	public CDebugConsole(){
		super("Debug");
		this.setLayout(new BorderLayout());
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(1000, 600);
		
		debug_context.setLineWrap(false);
		debug_context.setEditable(false);
		debug_context.setTabSize(4);
		
		scroll_pane.getViewport().add(debug_context);
		scroll_pane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		
		debug_context.setBackground(Color.getHSBColor(0.1f, 0.1f, 0.1f));
		debug_context.setForeground(Color.getHSBColor(0.95f, 0.95f, 0.95f));
		this.add(scroll_pane);
		this.setResizable(true);
		this.setVisible(true);
	}
	
	public void add_str(String in_str){
		debug_context.setText(debug_context.getText() + in_str);
		Point p = new Point();
		p.setLocation(0, (debug_context.getLineCount() + 100) * CGlobalDef.global_font_size);
		scroll_pane.getViewport().setViewPosition(p);
	}
}
