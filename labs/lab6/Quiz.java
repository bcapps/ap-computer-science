/***************************
 * Brian Capps
 * 11/24/2008
 * Description
 ****************************/
public class Quiz implements Measurable
{
	private double grade;
	private String letterGrade;
	
	public Quiz(double score)
	{
		grade = score;
		
		if (score>93.0)
			letterGrade = "A";
		else if (score<93.0 && score>88.0)
			letterGrade = "B+";
		else if (score<=88.0 && score>85.0)
			letterGrade = "B";
		else if (score<=85 && score>81.0)
			letterGrade = "C+";
		else if (score<=81.0 && score>76.0)
			letterGrade = "C";
		else if (score<=76.0 && score>=70)
			letterGrade = "D";
		else if (score<70)
			letterGrade = "F";
	}
	public double getMeasure()
	{
		return grade;
	}
	public String getLetterGrade()
	{
		return letterGrade;
	}
}//end class
