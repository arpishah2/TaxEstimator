package core.domain;

//import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

public class Donation implements Serializable {

	private long donationId;
	private long userId;
	private String desc;
	private long estimate;
	private long tax_deductible;
	private int year;

	public Donation() {
	}

	public Donation(long userId, String desc, long estimate) {
		this.userId = userId;
		this.desc = desc;
		this.estimate = estimate;
		this.tax_deductible = (long) ((.3) * estimate);
	}
	
	public long getId() {
        return donationId;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getDescription() {
        return desc;
    }

    public void setDescription(String title) {
        this.desc = desc;
    }
    
    public long getEstimate() {
        return estimate;
    }

    public void setEstimate(long estimate) {
        this.estimate = estimate;
    }

    public long getTaxDeductible() {
        return tax_deductible;
    }

    public int getYear(){
    	return year;
    }
    
    public void setYear(int yyyy){
    	year = yyyy;
    }
    /*public void setTaxDeductible(long userId) {
        this.userId = userId;
    }*/
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Todo{");
        sb.append("id=").append(donationId);
        sb.append(", userId=").append(userId);
        sb.append(", description='").append(desc).append('\'');
        sb.append(", estimatedValue=").append(estimate);
        sb.append(", taxDeductibel=").append(tax_deductible);
        sb.append('}');
        return sb.toString();
    }

}
