import java.util.Date;

/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 * 
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation {

	private Student[] students;
	private int size;
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
                this.size = 0;
	}

	@Override
	public Student[] getStudents() {
		// Add your implementation here
		return this.students;
	}

	@Override
	public void setStudents(Student[] students) {
		// Add your implementation here
                
            
	}

	@Override
	public Student getStudent(int index) {
		// Add your implementation here
              
                if(index<0 || index>=this.students.length)
                    throw new IllegalArgumentException();
                
		return this.students[index];
	}

	@Override
	public void setStudent(Student student, int index) {
		// Add your implementation here
            
            
            if(index<0 || index >= this.students.length)
                throw new IllegalArgumentException();
            
            if(this.size == this.students.length)
                throw new IllegalArgumentException();
            
            if(this.students[index] == null)
                this.students[index] = student;
            else{
                int walker;
                int len = this.students.length;
                for(walker = index; walker<len; walker++)
                    if(this.students[walker] == null)
                        break;
                
                if(walker >= len)
                    throw new IllegalArgumentException();
                
                for(; walker>index; walker--)
                    this.students[walker] = this.students[walker-1];
                
                this.students[index] = student;
            }
            this.size++;
            
            return;
                
	}

	@Override
	public void addFirst(Student student) {
		// Add your implementation here
            int walker = 0;
            int len = this.students.length;
            if(this.size == len || student == null)
                throw new IllegalArgumentException();
            
            for(;walker<len; walker++)
                if(this.students[walker] == null)
                    break;
            for(;walker>0; walker--)     
                this.students[walker] = this.students[walker-1];
                
           this.students[0] = student;
           this.size++;
           
           return;
            
	}

	@Override
	public void addLast(Student student) {
		// Add your implementation here
           
            int len = this.students.length;
            int walker = len;
            if(this.size == len || student == null)
                throw new IllegalArgumentException();
            
            for(;walker>=0; walker--)
                if(this.students[walker] == null)
                    break;
            
            for(;walker<len-1; walker++)     
                this.students[walker] = this.students[walker+1];
                
           this.students[this.students.length-1] = student;
           this.size++;
           
           return;
           
	}

	@Override
	public void add(Student student, int index) {
		// Add your implementation here
          if(index<0 || index >= this.students.length)
                throw new IllegalArgumentException();
            
            if(this.size == this.students.length)
                throw new IllegalArgumentException();
            
            if(this.students[index] == null)
                this.students[index] = student;
            else{
                int walker;
                int len = this.students.length;
                for(walker = index; walker<len; walker++)
                    if(this.students[walker] == null)
                        break;
                
                if(walker >= len)
                    throw new IllegalArgumentException();
                
                for(; walker>index; walker--)
                    this.students[walker] = this.students[walker-1];
                
                this.students[index] = student;
            }
            this.size++;
            
            return;
            
	}

	@Override
	public void remove(int index) {
		// Add your implementation here
            if(index<0 || index>=this.students.length)
                throw new IllegalArgumentException();
            
            this.students[index] = null;
            this.size--;
            
            return;
            
	}

	@Override
	public void remove(Student student) {
		// Add your implementation here
            
            int walker = 0;
            int len = this.students.length;
            
            for(;walker<len;walker++){
                if(!(this.students[walker] == null))
                
            }
	}

	@Override
	public void removeFromIndex(int index) {
		// Add your implementation here
	}

	@Override
	public void removeFromElement(Student student) {
		// Add your implementation here
	}

	@Override
	public void removeToIndex(int index) {
		// Add your implementation here
	}

	@Override
	public void removeToElement(Student student) {
		// Add your implementation here
	}

	@Override
	public void bubbleSort() {
		// Add your implementation here
	}

	@Override
	public Student[] getByBirthDate(Date date) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		// Add your implementation here
		return null;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		// Add your implementation here
		return 0;
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		// Add your implementation here
		return null;
	}

	@Override
	public Student getNextStudent(Student student) {
		// Add your implementation here
		return null;
	}
}