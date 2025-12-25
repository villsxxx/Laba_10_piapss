package university;

import java.util.Date;
import java.util.List;
import java.util.Vector;

public class Project {
	private String _name;
	private Date _start;
	private Date _end;
	private java.util.Vector<Participation> _participations;
	public Vector<Participation> _unnamed_Participation_ = new Vector<Participation>();

	public Project(String aName, Date aStart, Date aEnd) {
		this._name = aName;
		this._start = aStart;
		this._end = aEnd;
		this._participations = new Vector<>();
	}

	public java.util.List<Participation> getParticipations() {
		return this._participations;
	}

	public void addParticipation(Participation aParticipation) {
		this._participations.add(aParticipation);
	}

	public void setName(String aName) {
		this._name = aName;
	}

	public String getName() {
		return this._name;
	}

	public void setStart(Date aStart) {
		this._start = aStart;
	}

	public Date getStart() {
		return this._start;
	}

	public void setEnd(Date aEnd) {
		this._end = aEnd;
	}

	public Date getEnd() {
		return this._end;
	}
}