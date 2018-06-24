package paint;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ColorButtonPanel extends JPanel
{
	private JPanel colorButtonPanel;
	private JButton foreGroundColorBtn,backGroundColorBtn;
	private JLabel foreGroundColorLbl,backGroundColorLbl,foreColorLbl,backColorLbl;
	private Color foreColor, backColor;
	private CanvasPanel canvasPanel;
	
	public ColorButtonPanel(CanvasPanel inCanvasPanel)
	{
		canvasPanel = inCanvasPanel;	
		foreGroundColorLbl = new JLabel("   ");
		foreGroundColorLbl.setOpaque(true);
		foreGroundColorLbl.setBackground(canvasPanel.getForeGroundColor());
		foreGroundColorLbl.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		
		backGroundColorLbl = new JLabel("   ");
		backGroundColorLbl.setOpaque(true);
		backGroundColorLbl.setBackground(canvasPanel.getBackGroundColor());
		backGroundColorLbl.setBorder(BorderFactory.createLineBorder(Color.WHITE));
		
		foreGroundColorBtn = new JButton("ForeGroundColor->");
		foreGroundColorBtn.addActionListener(
			new ActionListener()
			{
                                @Override
				public void actionPerformed(ActionEvent event)
				{
					setForeGroundColor();
				}
			}
		);
		
		backGroundColorBtn = new JButton("BackGroundColor->");
		backGroundColorBtn.addActionListener(
			new ActionListener()
			{
                                @Override
				public void actionPerformed(ActionEvent event)
				{
					setBackGroundColor();
				}
			}
		);
	
		this.setLayout(new GridLayout(1,4));
		this.add(foreGroundColorBtn);
		this.add(foreGroundColorLbl);
		this.add(backGroundColorBtn);
		this.add(backGroundColorLbl);
	}
/*----------------------------------------------------------------------------*/	
	public void setForeGroundColor()
	{
		foreColor = JColorChooser.showDialog(null,"ForeGround Color",foreColor);
		if(foreColor!=null)
		{
			foreGroundColorLbl.setBackground(foreColor);
			canvasPanel.setForeGroundColor(foreColor);
		}
	}
/*----------------------------------------------------------------------------*/
	public void setBackGroundColor()
	{
		backColor = JColorChooser.showDialog(null,"BackGround Color",backColor);
		if(backColor!=null)
		{
			backGroundColorLbl.setBackground(backColor);
			canvasPanel.setBackGroundColor(backColor);
		}
	}
}