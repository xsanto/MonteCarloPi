package org.montecarlopi;


import java.awt.Point;
import java.util.Iterator;

import javax.swing.JFrame;


public class MonteCarloPi {
	
	static RandomNum rand;
	
	public static void main(String[] args) {
		rand= new RandomNum();
		JFrame f = new JFrame("ShapesDemo2D");
		final MyPanel panel1 =new MyPanel();
		f.add(panel1);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(panel1.getPreferredSize());
        f.pack();
        f.setVisible(true);
        int randX=0;
        int randY=0;
        
        
//        for(int i=0;i<numPoints;i++){ 
//        	randX=RandomNum.random(400,200);
//        	randY=RandomNum.random(400,200);
//        	Point p=new Point(randX,randY);
//        	panel1.addPoint(p);
//        	
//        }
//        panel1.repaint();
        
       double pi;
       int count=countCirclePoints(panel1);
       pi=4*(count/(double)panel1.numPoints);
       System.out.println(pi);
       double accuracy=pi/Math.PI;
       System.out.println(accuracy);
       
	}
	

	
	public static int countCirclePoints(MyPanel panel){
		int count=0;
		Point circleCenter=new Point(300,300);
		for (Iterator<Point> it=panel.pointList.iterator();it.hasNext();) {
        	Point point=it.next();
        	if(point.distance(circleCenter)<=100){
				++count;
			}
		}
		return count;
	}

	
}

