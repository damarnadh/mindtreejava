package set2problems;

public class Customer31 {
	private String Name;
	private String MobileNo;
	private double feedbackRating;
	public Customer31() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer31(String name, String mobileNo, double feedbackRating) {
		super();
		Name = name;
		MobileNo = mobileNo;
		this.feedbackRating = feedbackRating;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getMobileNo() {
		return MobileNo;
	}
	public void setMobileNo(String mobileNo) {
		MobileNo = mobileNo;
	}
	public double getFeedbackRating() {
		return feedbackRating;
	}
	public void setFeedbackRating(double feedbackRating) {
		this.feedbackRating = feedbackRating;
	}
	
}
