package seatmapproject;
class Seat
{
	
}
public class Seatmap {

	private int height;
	private int width;
	private int rows;
	private int columns;
	public Seatmap() {
		// TODO Auto-generated constructor stub
		System.out.println("Enter height and width of the hall");
		this.getHeight();
		this.getWidth();
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}
	

}
