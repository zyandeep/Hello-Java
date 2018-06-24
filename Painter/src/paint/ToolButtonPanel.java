package paint;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ToolButtonPanel extends JPanel
{
	private JButton lineBtn, squareBtn, ovalBtn, polygonBtn, roundRectBtn, freeHandBtn, undoBtn, redoBtn, clearBtn;		
	
	private JCheckBox fillChk;
	private CanvasPanel canvasPanel;
	
	public ToolButtonPanel(CanvasPanel inCanvasPanel)
	{
		canvasPanel = inCanvasPanel;
/*----------------------------------------------------------------------------*/		 
		lineBtn			= new JButton( new ImageIcon(ToolButtonPanel.class.getResource("icons/lineBtn.gif")));
		squareBtn		= new JButton( new ImageIcon(ToolButtonPanel.class.getResource("icons/squareBtn.gif")));
		ovalBtn	 		= new JButton( new ImageIcon(ToolButtonPanel.class.getResource("icons/ovalBtn.gif")));
		polygonBtn		= new JButton( new ImageIcon(ToolButtonPanel.class.getResource("icons/polygonBtn.gif")));
		roundRectBtn            = new JButton( new ImageIcon(ToolButtonPanel.class.getResource("icons/roundRectBtn.gif")));
		freeHandBtn		= new JButton( new ImageIcon(ToolButtonPanel.class.getResource("icons/freeHandBtn.gif")));
		undoBtn			= new JButton( new ImageIcon(ToolButtonPanel.class.getResource("icons/undoBtn.gif")));
		redoBtn			= new JButton( new ImageIcon(ToolButtonPanel.class.getResource("icons/redoBtn.gif")));
		clearBtn		= new JButton( new ImageIcon(ToolButtonPanel.class.getResource("icons/clearBtn.gif")));
		
		lineBtn.addActionListener(new ToolButtonListener());
		lineBtn.setToolTipText("Line");
		squareBtn.addActionListener(new ToolButtonListener());
		squareBtn.setToolTipText("Retangle");
		ovalBtn.addActionListener(new ToolButtonListener());
		ovalBtn.setToolTipText("Oval");
		polygonBtn.addActionListener(new ToolButtonListener());
		polygonBtn.setToolTipText("Polygon");
		roundRectBtn.addActionListener(new ToolButtonListener());
		roundRectBtn.setToolTipText("Rounded Rectangle");
		freeHandBtn.addActionListener(new ToolButtonListener());
		freeHandBtn.setToolTipText("Free Hand");
		undoBtn.addActionListener(new ToolButtonListener());
		undoBtn.setToolTipText("Undo");
		redoBtn.addActionListener(new ToolButtonListener());
		redoBtn.setToolTipText("Redo");
		clearBtn.addActionListener(new ToolButtonListener());
		clearBtn.setToolTipText("Clear Canvas");
/*----------------------------------------------------------------------------*/		
		fillChk = new JCheckBox("Fill");
		fillChk.addItemListener(
			new ItemListener()
			{
                                @Override
				public void itemStateChanged(ItemEvent event)
				{
					if(fillChk.isSelected())
						canvasPanel.setSolidMode(Boolean.TRUE);
					else
						canvasPanel.setSolidMode(Boolean.FALSE);
				}	
			}
		);
/*----------------------------------------------------------------------------*/		
		this.setLayout(new GridLayout(1,9)); // 8 Buttons & 1 CheckBox
		this.add(lineBtn);
		this.add(squareBtn);
		this.add(ovalBtn);
		this.add(polygonBtn);
		this.add(roundRectBtn);
		this.add(freeHandBtn);
		this.add(undoBtn);
		this.add(redoBtn);
		this.add(clearBtn);
		this.add(fillChk);				
	}
/*----------------------------------------------------------------------------*/
	private class ToolButtonListener implements ActionListener
	{
                @Override
		public void actionPerformed(ActionEvent event)
		{	
			if(canvasPanel.isExistPolygonBuffer()!= false)
			{
				canvasPanel.flushPolygonBuffer();
			}
			if(event.getSource() == lineBtn)
			{
                             canvasPanel.test = false;
				canvasPanel.setDrawMode(CanvasPanel.LINE);		
			}
			if(event.getSource() == squareBtn)
			{
                            canvasPanel.test = false;
				canvasPanel.setDrawMode(CanvasPanel.SQUARE);
			}
			if(event.getSource() == ovalBtn)
			{
                            canvasPanel.test = false;
				canvasPanel.setDrawMode(CanvasPanel.OVAL);
			}
			if(event.getSource() == polygonBtn)
			{
                            canvasPanel.test = false;
				canvasPanel.setDrawMode(CanvasPanel.POLYGON);
			}
			if(event.getSource() == roundRectBtn)
			{
                            canvasPanel.test = false;
				canvasPanel.setDrawMode(CanvasPanel.ROUND_RECT);
			}
			if(event.getSource() == freeHandBtn)
			{
                              canvasPanel.test = true;
				canvasPanel.setDrawMode(CanvasPanel.FREE_HAND);
			}
			if(event.getSource() == undoBtn)
			{
                            canvasPanel.test = false;
				canvasPanel.undo();
			}
			if(event.getSource() == redoBtn)
			{
                            canvasPanel.test = false;
				canvasPanel.redo();
			}
			if(event.getSource() == clearBtn)
			{
                            canvasPanel.test = false;
				canvasPanel.clearCanvas();
			}
                        
		}
	}
}