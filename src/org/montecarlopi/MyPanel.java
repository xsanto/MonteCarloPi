package org.montecarlopi;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

public class MyPanel extends JPanel{
	
	private int pointX;
	private int pointY;
	ArrayList<Point> pointList;
	final int numPoints=100;
	
	
	public MyPanel() {         //constructor
        setBorder(BorderFactory.createLineBorder(Color.black));
        

        addMouseListener(new MouseAdapter() {
        	public void mousePressed(MouseEvent e) {

        	}
        
        });
	
        pointX=0;    //initialise point coordinates
        pointY=0;
        pointList=new ArrayList<Point>();
	}
	
	public void addPoint(Point p){
		pointList.add(p);
	}
	
	public int getPointX() {
		return pointX;
	}

	public void setPointX(int pointX) {
		this.pointX = pointX;
	}

	public int getPointY() {
		return pointY;
	}

	public void setPointY(int pointY) {
		this.pointY = pointY;
	}
	
	
	
	public void paintComponent(Graphics g) {
        super.paintComponent(g);     
        Point circleCenter=new Point(300,300);
        g.drawOval((int)circleCenter.getX()-100, (int)circleCenter.getY()-100, 200, 200);
        g.drawRect((int)circleCenter.getX()-100, (int)circleCenter.getY()-100, 200, 200);
        
        int randX;
        int randY;
        for(int i=0;i<numPoints;i++){ 
        	randX=RandomNum.random(400,200);
        	randY=RandomNum.random(400,200);
        	Point p=new Point(randX,randY);
        	pointList.add(p);
        }
        for (Iterator<Point> it=pointList.iterator();it.hasNext();) {
        	Point point=it.next();
        	g.fillOval((int)point.getX()-1, (int)point.getY()-1, 3, 3);
		}
	}
	
	public Dimension getPreferredSize() {
        return new Dimension(1024,768);
    }
	
	
	

}
