package university;

import java.util.Date;

public class Participation {
	private int _hours;
	private ResearchAssociate _researchAssociate;
	private Project _project;
	public ResearchAssociate _unnamed_ResearchAssociate_;
	public Project _unnamed_Project_;

	public Participation(ResearchAssociate aRa, Project aProject, int aHours) {
		this._researchAssociate = aRa;
		this._project = aProject;
		this._hours = aHours;
		this._unnamed_ResearchAssociate_ = aRa;
		this._unnamed_Project_ = aProject;
	}

	public void setUnnamed_ResearchAssociate_(ResearchAssociate aUnnamed_ResearchAssociate_) {
		this._unnamed_ResearchAssociate_ = aUnnamed_ResearchAssociate_;
	}

	public ResearchAssociate getUnnamed_ResearchAssociate_() {
		return this._unnamed_ResearchAssociate_;
	}

	public void setUnnamed_Project_(Project aUnnamed_Project_) {
		this._unnamed_Project_ = aUnnamed_Project_;
	}

	public Project getUnnamed_Project_() {
		return this._unnamed_Project_;
	}

	public void setHours(int aHours) {
		this._hours = aHours;
	}

	public int getHours() {
		return this._hours;
	}

	public ResearchAssociate getResearchAssociate() {
		return this._researchAssociate;
	}

	public Project getProject() {
		return this._project;
	}
}