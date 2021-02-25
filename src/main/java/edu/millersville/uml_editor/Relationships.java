
import java.util.*;

public class Relationships {

	private Class source;
	private Class destination;
	private static String ID;
	private String type;

///////////////////////////////////////////////////////////
//
//	Constructor
//
///////////////////////////////////////////////////////////

	public Relationships(Class class1, Class class2, String id, String type1) 
	{
		source = class1;
		destination = class2;
		ID = id;
		type = type1;
	}
	
///////////////////////////////////////////////////////////
//
//	sourceName
//
///////////////////////////////////////////////////////////

	public String sourceName()
	{
		return source.getClassName();
	}
	
///////////////////////////////////////////////////////////
//
//	destinatinoName
//
///////////////////////////////////////////////////////////

	public String destinationName()
	{
		return destination.getClassName();
	}

///////////////////////////////////////////////////////////
//
//	changeType
//
///////////////////////////////////////////////////////////

	public void changeType(String newType)
	{
		type = newType;
	}

///////////////////////////////////////////////////////////
//
//	relType
//
///////////////////////////////////////////////////////////

	public String relType()
	{
		return type;
	}
}
