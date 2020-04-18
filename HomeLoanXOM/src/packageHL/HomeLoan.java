package packageHL;

public class HomeLoan {
	private int requestedLoanAmount;
	private int cibilScore;
	private boolean existingLoan;
	private String loanType;
	private int approvedLoanAmount;
	private boolean isLoanApproved;
	/**
	 * @return the requestedLoanAmount
	 */
	public int getRequestedLoanAmount() {
		return requestedLoanAmount;
	}
	/**
	 * @param requestedLoanAmount the requestedLoanAmount to set
	 */
	public void setRequestedLoanAmount(int requestedLoanAmount) {
		this.requestedLoanAmount = requestedLoanAmount;
	}
	/**
	 * @return the cibilScore
	 */
	public int getCibilScore() {
		return cibilScore;
	}
	/**
	 * @param cibilScore the cibilScore to set
	 */
	public void setCibilScore(int cibilScore) {
		this.cibilScore = cibilScore;
	}
	/**
	 * @return the existingLoan
	 */
	public boolean isExistingLoan() {
		return existingLoan;
	}
	/**
	 * @param existingLoan the existingLoan to set
	 */
	public void setExistingLoan(boolean existingLoan) {
		this.existingLoan = existingLoan;
	}
	/**
	 * @return the loanType
	 */
	public String getLoanType() {
		return loanType;
	}
	/**
	 * @param loanType the loanType to set
	 */
	public void setLoanType(String loanType) {
		this.loanType = loanType;
	}
	/**
	 * @return the approvedLoanAmount
	 */
	public int getApprovedLoanAmount() {
		return approvedLoanAmount;
	}
	/**
	 * @param approvedLoanAmount the approvedLoanAmount to set
	 */
	public void setApprovedLoanAmount(int approvedLoanAmount) {
		this.approvedLoanAmount = approvedLoanAmount;
	}
	/**
	 * @return the isLoanApproved
	 */
	public boolean isLoanApproved() {
		return isLoanApproved;
	}
	/**
	 * @param isLoanApproved the isLoanApproved to set
	 */
	public void setLoanApproved(boolean isLoanApproved) {
		this.isLoanApproved = isLoanApproved;
	}
}
