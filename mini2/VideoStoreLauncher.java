package mini2;
class Video{
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
//----------------------------------------------------------------------------------
class VideoStore{
	static int i=0;
	Video vidO[]=new Video[10];
	public void addVideo(String vid) {
		Video v=new Video(vid, 0, 0);
		vidO[i++]=v;
	}	
	public void checkOutVideo(String vid) {
		int len=i;
		for(int k=0;k<len;k++) {
			if(vidO[k].checkedOut==0) {
				vidO[k].checkedOut=1;
				break;
			}
			else {
				System.out.println("not present");
				break;
			}
		}
	}
	public void returnVideo(String vid) {
		int len=i;
		for(int k=0;k<len;k++) {
			if(vidO[k].checkedOut==1) {
				vidO[k].checkedOut=0;
				break;
			}
			else {
				System.out.println("already present");
				break;
			}
		}
	}
	public void receiveRating(String vid,int rat) {
		int len=i;
		for(int k=0;k<len;k++) {
			if(vidO[k].title.equals(vid)) {
				vidO[k].rating=rat;
				break;
			}
		}
	}
	public void inventory() {
		int len=i;
		for(int k=0;k<len;k++) {
			System.out.println(vidO[k]);
		}
	}
}
//---------------------------------------------------------------------------------
public class VideoStoreLauncher {
	
	public static void main(String[] args) {

		VideoStore v=new VideoStore();
		v.addVideo("The Matrix");
		v.addVideo("Godfather II");
		v.addVideo("Star Wars");
		v.receiveRating("The Matrix", 5);
		v.receiveRating("Godfather II", 4);
		v.checkOutVideo("The Matrix");
		v.inventory();
		v.returnVideo("The Matrix");
		v.inventory();
	}
}
