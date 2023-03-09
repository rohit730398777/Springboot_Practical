package constructordemo.injection.entiry2;

import constructordemo.injection.entity1.Subject;

public class Trainer 
{
	private Subject subject;
	
	public Trainer(Subject subject)
	{
		this.subject = subject;
	}
	
	//Printing The Constructor Injections
	public String teach()
	{
		return "<body bgcolor='yellow' text='blue'>"
					+ "<center><h1>Ajay is Training "+subject.getSub_Name()+" To Sanjay</h1></center>"
			+ "</body>";
	}
}
