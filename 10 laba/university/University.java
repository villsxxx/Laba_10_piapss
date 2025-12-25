package university;

import java.util.List;
import java.util.Vector;

public class University {
	private String _name;
	private int _numberOfEmployees;
	public java.util.Vector<Faculty> _faculties;

	public University(String aName) {
		this._name = aName;
		this._faculties = new Vector<>();
	}

	public java.util.List<Faculty> getFaculties() {
		return this._faculties;
	}

	public void addFaculty(Faculty aFaculty) {
		this._faculties.add(aFaculty);
	}

	public void setName(String aName) {
		this._name = aName;
	}

	public String getName() {
		return this._name;
	}

	public void setNumberOfEmployees(int aNumberOfEmployees) {
		this._numberOfEmployees = aNumberOfEmployees;
	}

	public int getNumberOfEmployees() {
		return this._numberOfEmployees;
	}
}