
import java.util.*;
import java.sql.*;

public class ClassNameConflicts {
	Date today; // reference to Date is ambiguous, both class java.sql.Date in java.sql and class java.util.Date in java.util match
}

/* Solution : 
 Remove wildcard from one of the imports, specify the class name. Class name specification has high precedance than the wildcard.

*/