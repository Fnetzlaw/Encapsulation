package lab1;

import java.util.Date;

/**
 * In this lab your challenge is to fix the code in both classes to use proper
 * encapsulation and the four other best practices as explained by your
 * instructor.
 *
 * @author Jim Lombardo, WCTC Instructor
 * @version 1.01
 */
public class Employee {

    private String firstName;
    private String lastName;
    private String ssn;
    private Date birthDate;
    private boolean metWithHr;
    private boolean metDeptStaff;
    private boolean reviewedDeptPolicies;
    private boolean movedIn;
    private String cubeId;
    
    private final String ERR_MSG_meetDepartment = "Sorry, you cannot meet with "
            + "department staff until you have met with HR.";
    private final String ERR_MSG_reviewDept = "Sorry, you cannot review "
            + " department policies until you have first met with HR "
            + "and then with department staff.";
    private final String ERR_MSG_moveIntoCubicle = "Sorry, you cannot move in to a "
            + "cubicle until you have first met with HR "
            + "and then with department staff, and then reviewed"
            + "department policies.";
    private final int MIN_LENGTH = 1;
    private final int MAX_YEAR_DATE = 2013;
    private final int MAX_SSN = 9;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if (firstName == null || firstName.length() < MIN_LENGTH) {
            throw new IllegalArgumentException();
        }
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if (lastName == null || lastName.length() < MIN_LENGTH) {
            throw new IllegalArgumentException();
        }
        this.lastName = lastName;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        if (ssn == null || ssn.length() > MAX_SSN) {
            throw new IllegalArgumentException();
        }
        this.ssn = ssn;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        if (birthDate == null || birthDate.getYear() > MAX_YEAR_DATE) {
            throw new IllegalArgumentException();
        }
        this.birthDate = birthDate;
    }

    public boolean isMetWithHr() {
        return metWithHr;
    }

    public void setMetWithHr(boolean metWithHr) {
        this.metWithHr = metWithHr;
    }

    public boolean isMetDeptStaff() {
        return metDeptStaff;
    }

    public void setMetDeptStaff(boolean metDeptStaff) {
        this.metDeptStaff = metDeptStaff;
    }

    public boolean isReviewedDeptPolicies() {
        return reviewedDeptPolicies;
    }

    public void setReviewedDeptPolicies(boolean reviewedDeptPolicies) {
        this.reviewedDeptPolicies = reviewedDeptPolicies;
    }

    public boolean isMovedIn() {
        return movedIn;
    }

    public void setMovedIn(boolean movedIn) {
        this.movedIn = movedIn;
    }

    public String getCubeId() {
        return cubeId;
    }

    public void setCubeId(String cubeId) {
        if (cubeId == null || cubeId.length() < MIN_LENGTH) {
            throw new IllegalArgumentException();
        }
        this.cubeId = cubeId;
    }

    public void StepsToPerform(String cubeID) {
        meetWithHrForBenefitAndSalryInfo();
        meetDepartmentStaff();
        reviewDeptPolicies();
        moveIntoCubicle(cubeID);
    }

    public Employee() {
    }

    // Assume this must be performed first
    public void meetWithHrForBenefitAndSalryInfo() {
        metWithHr = true;
    }

    // Assume this is must be performed second
    public void meetDepartmentStaff() {
        if (metWithHr) {
            metDeptStaff = true;
        } else {
            throw new IllegalStateException(ERR_MSG_meetDepartment);
        }
    }

    // Assume this must be performed third
    public void reviewDeptPolicies() {
        if (metWithHr && metDeptStaff) {
            reviewedDeptPolicies = true;
        } else {
            throw new IllegalStateException(ERR_MSG_reviewDept);
        }
    }

    // Assume this must be performed 4th
    public void moveIntoCubicle(String cubeId) {
        if (metWithHr && metDeptStaff && reviewedDeptPolicies) {
            this.cubeId = cubeId;
            this.movedIn = true;
        } else {
            throw new IllegalStateException(ERR_MSG_moveIntoCubicle);
        }

    }

    public String getStatus() {
        if (metWithHr && metDeptStaff
                && reviewedDeptPolicies && movedIn) {
            return "Orientation is complete";
        } else {
            return "Orientation in progress...";
        }
    }
}
