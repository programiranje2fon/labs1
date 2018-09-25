
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;


public class RunTests {

	public static void main(String[] args) {

		runTestsForClass(p1.TVsetTest.class);
		
		runTestsForClass(p2.RadioTest.class);

	}

	@SuppressWarnings("rawtypes")
	private static void runTestsForClass(Class c) {

		Result r = JUnitCore.runClasses(c);

		if (r.wasSuccessful()) {

			System.out.println("TEST CLASS: " + c.getName());
			System.out.println("	Tests run: " + r.getRunCount() + "	Passed tests: "
					+ (r.getRunCount() - r.getFailureCount()) + "	Failed tests: " + r.getFailureCount());
			System.out.println();

			System.out.println("	All tests pased");
			System.out.println();
			System.out.flush();
		} else {
			System.err.println("TEST CLASS: " + c.getName());
			System.err.println("	Tests run: " + r.getRunCount() + "	Passed tests: "
					+ (r.getRunCount() - r.getFailureCount()) + "	Failed tests: " + r.getFailureCount());
			System.err.println();

			int i = 1;

			System.err.println("	Failed tests:");
			for (Failure failure : r.getFailures()) {
				if (failure.getException() instanceof NoClassDefFoundError)
					System.err.println("	" + i++ + ". There exists no such class " + failure.getException().getMessage().substring(1) + "\n		(check class and package names)\n");
					else
						if (failure.getException() instanceof NoSuchFieldError)
							System.err.println("	" + i++ + ". There exists no such attribute " + failure.getException().getMessage() + "\n		(check attribute name and type)\n");
						else
							if (failure.getException() instanceof NoSuchMethodError)
								System.err.println("	" + i++ + ". There exists no such method " + failure.getException().getMessage() + "\n		 (check method name, return value and type and order of parameters)\n");			
							else
								System.err.println("	" + i++ + ". " + failure.getTestHeader() + ": \n		" + failure.getMessage() + "\n");
			}

			System.err.println();
			System.err.flush();
		}

	}

}
