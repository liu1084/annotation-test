import com.jim.annotation.AnnotationTracker;
import com.jim.annotation.TestClass;

public class Main {

	public static void main(String[] args) {
		AnnotationTracker.getClassAnnotation(TestClass.class);
		AnnotationTracker.getFieldAnnotation(TestClass.class);
		AnnotationTracker.getMethodAnnotation(TestClass.class);
	}
}
