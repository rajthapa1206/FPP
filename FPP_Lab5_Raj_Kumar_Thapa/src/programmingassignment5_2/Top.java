package programmingassignment5_2;
public class Top {
	int t = 1;
	Middle mid;
	Middle.Bottom midbot;
	Top(){
		mid = new Middle();
		midbot = mid.bottom;
	}
	int readBottom() {
		return midbot.b;
	}
	class Middle {
		int m = 2;
		Bottom bottom = new Bottom();
		int addTopAndBottom() {
			Bottom bottom = new Bottom();
			return bottom.b + t;
		}
		class Bottom {
			int b = 3;
			int multiplyAllThree() {
				return t * m * b;
			}
		}
	}
	public static void main(String[] args){
		Top top = new Top();
		System.out.println(top.readBottom());
		System.out.println(top.mid.addTopAndBottom());
		System.out.println(top.midbot.multiplyAllThree());
	}
}