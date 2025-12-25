package university;

import java.util.List;
import java.util.Vector;

public class Institute {
	private String _name;
	private String _address;
	private java.util.Vector<ResearchAssociate> _researchAssociates;
	public Vector<ResearchAssociate> _unnamed_ResearchAssociate_ = new Vector<ResearchAssociate>();
	public Faculty _unnamed_Faculty_;

	public Institute(String aName, String aAddress) {
		this._name = aName;
		this._address = aAddress;
		this._researchAssociates = new Vector<>();
	}

	public java.util.List<ResearchAssociate> getResearchAssociates() {
		return this._researchAssociates;
	}

	public void addResearchAssociate(ResearchAssociate aRa) {
		this._researchAssociates.add(aRa);
	}

	public void setName(String aName) {
		this._name = aName;
	}

	public String getName() {
		return this._name;
	}

	public void setAddress(String aAddress) {
		this._address = aAddress;
	}

	public String getAddress() {
		return this._address;
	}
}