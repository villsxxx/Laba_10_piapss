package university;

import java.util.List;
import java.util.Vector;

public class ResearchAssociate extends Employee {
	private String _fieldOfStudy;
	public java.util.Vector<Institute> _institutes;
	private java.util.Vector<Participation> _participations;
	public Vector<Participation> _unnamed_Participation_ = new Vector<Participation>();

	public ResearchAssociate(int aSsNo, String aName, String aEmail, String aFieldOfStudy) {
		super(aSsNo, aName, aEmail);
		this._fieldOfStudy = aFieldOfStudy;
		this._institutes = new Vector<>();
		this._participations = new Vector<>();
	}

	public java.util.List<Institute> getInstitutes() {
		return this._institutes;
	}

	public void addInstitute(Institute aInstitute) {
		this._institutes.add(aInstitute);
	}

	public java.util.List<Participation> getParticipations() {
		return this._participations;
	}

	public void addParticipation(Participation aParticipation) {
		this._participations.add(aParticipation);
	}

	public void setFieldOfStudy(String aFieldOfStudy) {
		this._fieldOfStudy = aFieldOfStudy;
	}

	public String getFieldOfStudy() {
		return this._fieldOfStudy;
	}
}