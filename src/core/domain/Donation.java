package core.domain;

//import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

public class Donation implements Serializable {
	
	private long did;
	private long userId;
	private String desc;
	private long estimate;
	private long tax_deductible;
	
	public Donation(){
	}
	
	public Donation(long userId, String desc, long estimate) {
        this.userId = userId;
        this.desc = desc;
        this.estimate = estimate;
        this.tax_deductible = (long) ((.3)*estimate);
    }
	
	
	
}

