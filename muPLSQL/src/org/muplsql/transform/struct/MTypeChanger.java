package org.muplsql.transform.struct;

import java.util.ArrayList;
import java.util.List;

import org.muplsql.transform.MITransformer;
import org.muplsql.transform.MutaOperatorType;

public class MTypeChanger extends MITransformer {
//will be in future
public MTypeChanger() {
	this.mtype = MutaOperatorType.Mot038.name();//FIXME
	this.mopId =38;
}

@Override
public List<String> mutateAsList(String value) {
	List<String> result = new ArrayList<>();

	if (value.equalsIgnoreCase("VARCHAR2"))
		result.add("NUMBER" );
	
	if (value.equalsIgnoreCase("NUMBER"))
		result.add("VARCHAR2" );

	
	return result;
}


}