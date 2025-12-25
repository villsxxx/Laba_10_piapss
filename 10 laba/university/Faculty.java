package university;

import java.util.List;
import java.util.Vector;

public class Faculty {
	private String _name;
	public Employee _dean;
	private java.util.Vector<Institute> _institutes;
	public University _unnamed_University_;

	public Faculty(String aName) {
		this._name = aName;
		this._institutes = new Vector<>();
	}

	public java.util.List<Institute> getInstitutes() {
		return this._institutes;
	}

	public void addInstitute(Institute aInstitute) {
		this._institutes.add(aInstitute);
	}

	public void setName(String aName) {
		this._name = aName;
	}

	public String getName() {
		return this._name;
	}

	public void setDean(Employee aDean) {
		this._dean = aDean;
	}

	public Employee getDean() {
		return this._dean;
	}
}