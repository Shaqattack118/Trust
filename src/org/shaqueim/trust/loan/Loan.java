package org.shaqueim.trust.loan;

import java.time.LocalDateTime;
import java.util.Date;

import org.shaqueim.trust.entity.Entity;

/**
 *
 * @author Shaqueim Cameron cameronofficial.org
 */
public interface Loan {
    
	/**
	 * Gets the date which the loan as started
	 * @return LocalDateTime date
	 */
    public LocalDateTime getStartDate();
    
    /**
     * Gets the date in which the loan is projected to end (given past missed payments 
     * and principal offset period
     * @return LocalDateTime date
     */
    public LocalDateTime getEndDate();
    
    /**
     * Returns the entity who loaned the funds to the borrower
     * @return Lender l
     */
    public Entity getLender();
    
    /**
     * Returns the entity who borrowed the funds from the lender
     * @return Borrower b
     */
    public Entity getBorrower();
    
    /**
     * Checks if the loan is active (IF there is a principal balance)
     * @return boolean isActive
     */
    public boolean isActiveLoan();
    
    /**
     * Returns the instance of loan accounting for the loan
     * @return LoanAccounting loan
     */
    public LoanAccounting getAccounting();
}
