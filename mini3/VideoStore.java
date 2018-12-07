package mini3;

public class VideoStore{
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
