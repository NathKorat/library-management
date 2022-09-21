package Library.Management;

public class Fine{
	
	int fineID;
	int resourceID;
	int userID;
	int fine;
	
	//Constructor for Library.Management.Fine class...
	Fine(int _resID,int userID,int _fine){
		fineID = Library.nextFineID;
		Library.nextFineID++;
		this.resourceID = _resID;
		this.fine = _fine;
		this.userID = userID;
	}
	
	//to update fine.
	void updateFine(int fine){
		this.fine = fine;
	}
	
}