
public class Student {
	//attributes
	private String name;
	private int score;
	
	//methods
	public void setName(String Name) {
		name = Name;
	}//end of setName()
	
	public String getName() {
		return name;
	}//end of getName
	
	public void setScore(int Score) {
		score = Score;
	}//end of setScore()
	
	public int getScore() {
		return score;
	}//end of getScore()
	
	public boolean checkScore() {
		if(score >= 0 && score <= 100) {
			return true;
		}else
			return false;
	}//end of checkScore()
	
	public boolean isPass() {
		if(score >= 50) {
			return true;
		}else {
			return false;
		}
	}//end of isPass()
	
	
}
