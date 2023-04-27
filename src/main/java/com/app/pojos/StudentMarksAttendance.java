package com.app.pojos;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Table(name = "student_marks_attendance")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class StudentMarksAttendance extends BaseEntity {
	@OneToOne
	@JoinColumn(name = "subject_id", nullable = false)
	private Subject subjectId;
	@OneToOne
	@JoinColumn(name = "course_id", nullable = false)//change
	private Course courseId;
	@OneToOne
	@JoinColumn(name = "student_id", nullable = false)
	private Student studentId;
	//@Max( value = 100)
	private double marks;
	//@Max( value = 100)
	private double attendance;
	
	

	@Override
	public String toString() {
		return "StudentMarksAttendance [marks=" + marks + ", attendance=" + attendance + "]";
	}

}
