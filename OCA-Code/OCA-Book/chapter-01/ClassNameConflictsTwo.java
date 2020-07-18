

public class ClassNameConflictsTwo {
	java.util.Date today; //
	java.sql.Date dbDate; //
}

/* Solution : When it is required to import two different classes with same simple name, then it suggested to use fully qualified name of those class(es) in the declaration statement. For example , 

	java.util.Date today; //
	java.sql.Date dbDate; //
	
Finally the import statement can be removed. 

Or one of the import statement can be removed. For the removed import, fully qualified class name can be given in the declaration section.


*/