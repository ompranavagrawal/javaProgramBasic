package mini3;

public class Video{
	String title;
	int checkedOut;    //0->in   1->out
	int rating;        //1-5
	public Video(String title, int checkedOut, int rating) {
		super();
		this.title = title;
		this.checkedOut = checkedOut;
		this.rating = rating;
	}
	
	@Override
	public String toString() {
		return "Video [title=" + title + ", checkedOut=" + checkedOut + ", rating=" + rating + "]";
	}

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getCheckedOut() {
		return checkedOut;
	}
	public void setCheckedOut(int checkedOut) {
		this.checkedOut = checkedOut;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public int beingCheckedOut() {
		return checkedOut;
	}
	public int beingReturned() {
		if(checkedOut==1) {
			return 0;
		}
		else {
			return 1;
		}
	}
	public void receiveRating(int rating) {
		this.rating=rating;
	}
}