package ArrayPrimative;

public class TEst_Student {

	public static void main(String[] args) {

		Student s1 = new Student (1, 78.34, "Suraj");
		Student s2 = new Student (1, 78.34, "Shilpa");
		Student s3 = new Student (1, 78.34, "Shivansh");
		Student s4 = new Student (1, 78.34, "Onkar");
		Student s5 = new Student (1, 78.34, "Raj");

		// who is topper?

		Student [] stds = {s1, s2, s3, s4,s5 };
		double toppemarks =0;
		Student topper = new Student();
		for (int i = 0; i< stds.length; i++) {
			if (stds [i].marks>topper) {
				topmarks = stds[i].marks
				topper=stds[i];
			}	
		}
		System.out.println(topper);
	}

}
